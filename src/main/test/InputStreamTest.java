import junit.framework.TestCase;

public class InputStreamTest extends TestCase {
  private InputStream i;

  protected void setUp() throws Exception {
   i = new InputStream();
 }

 public void testInputOutstream() throws Exception{
   assertEquals(0, i.InputStream());
 }

}
