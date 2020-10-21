package sec11.exam_01_Api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectioExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("sec06.exam01_class.Car");

        System.out.println("[클래스이름]");
        System.out.println(clazz.getName());
        System.out.println();

        System.out.println("[생성자 정보]");

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }

        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName() + "(");
            Class[] classes = method.getParameterTypes();
            printParameters(classes);
            System.out.println(")");
        }

    }
    public static void printParameters(Class[] classes){
        for (int i=0; i <classes.length; i++){
            System.out.println((classes[i].getName()));
            if (i<classes.length-1){
                System.out.println(",");
            }
        }
    }
}
