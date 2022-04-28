//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.util.regex.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String[] args) throws IOException {
        if (args.length == 0) {throw new IllegalArgumentException("must provide input file");}
        Path fileName = Path.of(args[0]);
        List<String> lines = Files.readAllLines(fileName);
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        Pattern mdLinkSignature = Pattern.compile("\\[.+\\]\\(.+\\)$");
        Pattern linkSignature = Pattern.compile("\\]\\(.+\\)$");
        for (String line: lines) {
            if (mdLinkSignature.matcher(line).matches()) {
                Matcher linkMatcher = linkSignature.matcher(line);
                if (linkMatcher.find()) {
                    String link = line.substring(linkMatcher.start() + 2, line.length() - 1);
                    toReturn.add(link);
                    //linkSignature.matcher(line).reset();
                }
            }
        }
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        ArrayList<String> links = getLinks(args);
        System.out.println(links.toString());
    }
}

