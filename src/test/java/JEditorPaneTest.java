import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;
import se.jiderhamn.classloader.leak.Leaks;

@RunWith(JUnitClassloaderRunner.class)
public class JEditorPaneTest {
  @Test
  @Leaks(dumpHeapOnError = true)
  public void swing() {
    new javax.swing.JEditorPane("text/plain", "dummy");
  }
}