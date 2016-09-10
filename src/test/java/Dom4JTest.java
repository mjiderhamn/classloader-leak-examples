import org.dom4j.DocumentFactory;
import org.dom4j.DocumentHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;
import se.jiderhamn.classloader.leak.Leaks;

/** 
 * {@link DocumentFactory#singlePerThread} 
 */
@RunWith(JUnitClassloaderRunner.class)
public class Dom4JTest {
  
  @Leaks(dumpHeapOnError = true)
  @Test
  public void dom4j() {
    DocumentHelper.createDocument();
  }
}