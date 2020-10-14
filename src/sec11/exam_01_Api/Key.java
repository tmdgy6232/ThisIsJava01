package sec11.exam_01_Api;

public class Key {
    /**
     * hashCode
     * 객체 해시코드란 객체를 식별할 하나의 정수값을 말한다.
     * 해쉬코드 메소드는 객체의 메모리 번지를 이용해 해시코드를 만들어 리턴하기 때문엥 객체마다 다른값을 가지고 있다.
     * 논리적 동등 비교시 이 hashcode를 오버라이딩 할 필요성이 있다.
     * HashSet, HashMap, Hashtable은 다음과 같은 방법으로 동등한지 비교한다.
     * 우선 hashCode 메소드를 실행하여 리턴된 해쉬코드가 같은지 물어본다.
     * 해쉬코드 값이 다르면 다른 객체로 판단하고, 해쉬코드 값이 같으면 equals() 메소드로 다시 비교한다.
     * 그렇기 때문에 hashcode가 트루가 나와도 equals()의 리턴값이 다르면 다른 객체가 된다.
     *
     * */
    public  int number;

    public Key(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  Key){
            Key compareKey = (Key) obj;
            if (this.number == compareKey.number){
                return true;
            }
        }
        return  false;
    }
}
