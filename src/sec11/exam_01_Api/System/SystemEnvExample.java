package sec11.exam_01_Api.System;

public class SystemEnvExample {
    public static void main(String[] args) {
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("자바 홈  : " + javaHome);
    }
}
