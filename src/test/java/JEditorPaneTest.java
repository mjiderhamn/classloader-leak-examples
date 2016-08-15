import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;

@RunWith(JUnitClassloaderRunner.class)
public class JEditorPaneTest {
  @Test
  public void test() {
    new javax.swing.JEditorPane("text/plain", "dummy");
  }
}