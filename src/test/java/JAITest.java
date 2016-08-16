import com.sun.media.jai.codec.FileCacheSeekableStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import se.jiderhamn.classloader.leak.JUnitClassloaderRunner;
import se.jiderhamn.classloader.leak.Leaks;

/** 
 * {@link FileCacheSeekableStream#cleanupThread} 
 */
@RunWith(JUnitClassloaderRunner.class)
public class JAITest {
  
  @Test
  @Leaks(dumpHeapOnError = true)
  public void jai() throws Exception {
    
  }
}