import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;

@RunWith(JUnitClassloaderRunner.class)
public class NormalizeDOMTest {
  
  @Test
  public void normalize() throws Exception {
    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
    document.normalizeDocument();
  }
}