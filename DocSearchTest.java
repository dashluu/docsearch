import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URI;

import org.junit.*;


public class DocSearchTest {
    @Test
    public void testHandleURL() {
        try {
            Handler handler = new Handler("./technical/");
            URI url = new URI("http://localhost:4000/technical/");
            assertEquals("Don't know how to handle that path!", handler.handleRequest(url));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
