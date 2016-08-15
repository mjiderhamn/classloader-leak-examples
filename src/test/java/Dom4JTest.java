import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;

@RunWith(JUnitClassloaderRunner.class)
public class Dom4JTest {
  @Test
  public void dom4j() {
    org.dom4j.DocumentHelper.createDocument();
  }
}