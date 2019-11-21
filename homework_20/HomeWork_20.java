package homework_20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class HomeWork_20 {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

        Class<Cars> cars = Cars.class;
        System.out.println("Ім'я класу: ");
        System.out.println(cars);
        System.out.println(cars.getName());
        System.out.println(cars.getSimpleName());
        System.out.println();

        int modifiers = cars.getModifiers();
        System.out.println("Кількість модифікаторів - " + modifiers);
        System.out.println("Чи є публічний модифікатор - " + Modifier.isPublic(modifiers));
        System.out.println("Чи є статичний модифікатор - " + Modifier.isStatic(modifiers));
        System.out.println("Чи є приватний модифікатор - " + Modifier.isPrivate(modifiers));
        System.out.println("Чи є абстрактний модифікатор - " + Modifier.isAbstract(modifiers));
        System.out.println();

        Package pack = cars.getPackage();
        System.out.println("Пакет - " + pack);
        Class superclass = cars.getSuperclass();
        System.out.println("Суперклас - " + superclass);
        System.out.println();

        Constructor<?>[] constructors = cars.getConstructors();
        int i = 1;
        for (Constructor cons : constructors) {
            System.out.println("Конструктор " + i + ": " + cons);
            i++;
        }
        System.out.println();

        Cars c = cars.getConstructor(String.class, int.class).newInstance(new Object[]{"Mazda", 550000});
        System.out.println("Новий об'єкт - " + c);
        System.out.println();

        System.out.println("Public поля: ");
        Field[] field = cars.getFields();
        for (Field f : field) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println("Всі поля: ");
        Field[] declaredFields = cars.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println("Список всіх методів: ");
        Method[] method = cars.getMethods();
        for (Method m : method) {
            System.out.println(m);
        }
        System.out.println();
        
        Cars c2 = cars.getConstructor(String.class, int.class).newInstance(new Object[]{"Tesla", 1500000});
        System.out.println("Новий об'єкт - " + c2);
        Field marka = c2.getClass().getField("marka");
        marka.set(c2,"BMW");
        System.out.println("Зміна поля нового об'єкта - " + c2);
        
        Method met = cars.getMethod("myMethod_add_to_price", int.class);
        met.invoke(c2, 5000);
        System.out.println("Змінилася ціна - " + c2.toString());
        
        Method met2 = cars.getMethod("myMethod2_chance_car", String.class, int.class);
        met2.invoke(c2, "Mers", 770000);
        System.out.println("Зміна всіх полів - " + c2.toString());
    }

}
