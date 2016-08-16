import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;
import se.jiderhamn.classloader.leak.Leaks;

/** 
 * {@link sun.awt.AppContext#mainAppContext} 
 */
@RunWith(JUnitClassloaderRunner.class)
public class JEditorPaneTest {

  @Test
  @Leaks(dumpHeapOnError = true)
  public void swing() {
    
  }
}