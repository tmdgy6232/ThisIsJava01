package sec11.exam_01_Api.System;

public class ExitExample {
    public static void main(String[] args) {
        /**
         * 자바 프로그램은 운영체제상에서 바로 실행되는것이 아니고
         * jvm위에서 실행된다. 따라서 운영체제의 기능을 자바 코드로 접근하기란 어렵다.
         * java.lang 패키지에는 운영체제의 일부 기능을 사용할 수 있게 System 클래스를 구현해놓았다.
         * 이 클래스의 모든 필드와 메소드는 정적필드와 정적 메소드로 구성되어있다.
         *
         * */
        // 보안관리자 설정
        System.setSecurityManager(new SecurityManager(){
            @Override
            public void checkExit(int status) {
                if (status != 5){
                    throw new SecurityException();
                }
            }
        });

        for (int i=0; i<10; i++){
            System.out.println(i);

            try {
                //JVM 종료요청
                System.exit(i);
            } catch (SecurityException e){

            }
        }
    }
}
