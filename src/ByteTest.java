import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ByteTest {

  public static <T> T toObject (byte[] bytes, Class<T> type) throws IOException, ClassNotFoundException{

    Object obj = null;
    //ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
    //ObjectInputStream ois = new ObjectInputStream(bis);
    //obj = readObject();
    //System.out.println("obj = " + obj.toString());

    return type.cast(obj);
  }

  public static void main(String[] args) throws IOException,ClassNotFoundException {
    byte[] bytes = new byte[10];

    /*
    if(bytes.length == 0){
      System.out.println("yes");
    }

    Person p = new Person(11100000, "이성연");
    ByteArrayOutputStream bos = new ByteArrayOutputStream();

    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(p);
    oos.flush();
    oos.close();
    bos.close();
    bytes = bos.toByteArray();

    System.out.println(bytes.length);
    Person recvPerson = toObject(bytes, Person.class);

    System.out.println(recvPerson.age);
    System.out.println(recvPerson.name);

    SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMddHHmmss");
    Date time = new Date();
    long ss = Long.parseLong(format1.format(System.currentTimeMillis()));
    System.out.println(ss);

    System.out.println();


     */

  }
}
