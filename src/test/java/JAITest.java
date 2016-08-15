import java.io.ByteArrayInputStream;

import com.sun.media.jai.codec.SeekableStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;
import se.jiderhamn.classloader.leak.Leaks;

@RunWith(JUnitClassloaderRunner.class)
public class JAITest {
  
  @Test
  @Leaks(dumpHeapOnError = true)
  public void jai() throws Exception {
    SeekableStream.wrapInputStream(new ByteArrayInputStream(new byte[0]), true);
  }
}