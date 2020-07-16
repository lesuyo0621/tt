import java.io.UnsupportedEncodingException;
import java.lang.instrument.Instrumentation;
import java.util.Arrays;

public class test {


  private static Instrumentation inst;

  public static void premain(String args, Instrumentation inst){
    test.inst = inst;
  }

  public static long geto(Object o){
    assert inst != null;
    return inst.getObjectSize(o);
  }



  public static void main(String[] args) throws UnsupportedEncodingException {
    /*
    System.out.println(Arrays.toString("2ymhx90rhs03p".toCharArray()));
    System.out.println(Arrays.toString("2ymhx90rhs03p".getBytes()));
    byte[] buffer = new byte[13];
    buffer = "한글".getBytes();
    System.out.println(buffer.length);
    System.out.println(new String(buffer, 0, buffer.length, "UTF-8"));
    System.out.println(new String(buffer));
    System.out.println(new String(buffer).length());
     */
    System.out.println(geto(new Person(12, "aaa")));
  }
}
