// importing relevant libraries for use in code
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;
// creating test class
public class MarkdownParseTest {
    //marking method as a test method
    @Test
    //declaring method
    public void additionTest() {
        //actual code for running test
        assertEquals(2, 1 + 1);
    }

    @Test
    public void markdownParseTest1() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"test-file.md"}));
    }
    
    @Test
    public void markdownParseTest2() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("never-gonna-give-you-up.html");
        expected.add("never-gonna-let-you-down.html");
        expected.add("never-gonna-run-arround.html");
        expected.add("and-desert-you.html");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"test-file-2.md"}));
    }
    
    @Test
    public void markdownParseTest3() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("https://www.website.com/?utm_source=google%5BB%2B%5D&utm_medium=cpc&utm_content=google_ad(B)&utm_campaign=product");
        expected.add("https://www.zombo.com/");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"test-file-3.md"}));
    }
    
    @Test
    public void markdownParseTest4() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("https://www.petco.com/shop/en/petcostore/category/fish/live-fish");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"test-file-4.md"}));
    }

    @Test
    public void CharlesTest1() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"test-file-Charles-1.md"}));
    }

    @Test
    public void CharlesTest2() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"test-file-Charles-2.md"}));
    }

    @Test
    public void CharlesTest3() throws IOException{
        ArrayList <String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(new String[]{"test-file-Charles-3.md"}));
    }

    @Test
    public void failingTest(){
        assertEquals(1, 2);
    }
}