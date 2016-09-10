import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;
import se.jiderhamn.classloader.leak.Leaks;

/** 
 * {@link com.sun.org.apache.xerces.internal.dom.DOMNormalizer#abort}
 */
@RunWith(JUnitClassloaderRunner.class)
public class NormalizeDom {
  
  @Test
  @Leaks(dumpHeapOnError = true)
  public void normalizeDom() throws Exception {
    DocumentBuilderFactory.newInstance()
        .newDocumentBuilder()
        .newDocument()
        .normalizeDocument();
  }
}