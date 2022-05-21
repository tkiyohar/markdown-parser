

// importing relevant libraries for use in code
import static org.junit.Assert.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;
// creating test class
public class LabReport4Tests {
    
    @Test
    public void Snippit1Test() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("`google.com");
        expected.add("google.com");
        expected.add("ucsd.edu");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"Snippet1.md"}));
    }

    @Test
    public void Snippit2Test() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"Snippet2.md"}));
    }

    @Test
    public void Snippit3Test() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"Snippet3.md"}));
    }

}
