package homework_25;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class HomeWork_25 {

    public static void main(String[] args) throws IOException {

        List<String> car_list = new ArrayList();

        Class<Cars> car_class = Cars.class;

        Field[] fields = car_class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(Cars_Annotation.class) instanceof Cars_Annotation) {
                car_list.add("Field" + field.getName() + "with type" + field.getType().getSimpleName() + "has annotation Cars_Annotation with value" + field.getAnnotation(Cars_Annotation.class).value());
            }
        }

        File file = new File("File.txt");
        writeToFile(file, car_list);

    }

    private static void writeToFile(File file, Object object) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }

}
