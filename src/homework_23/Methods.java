package homework_23;

import java.io.*;

public class Methods {

    public static void serialize(File f, Object obj) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }

    public static Object deserialize(File f) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f));
        Object obj = objectInputStream.readObject();
        objectInputStream.close();
        return obj;
    }

}
