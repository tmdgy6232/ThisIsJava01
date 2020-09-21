package sec06.exam17_abstract;

public abstract class Animal {
    public String kind;

    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }

    /**
     *  추상 메서드
     *  추상 메서드의 경우에는 추상 클래스에서만 선언할 수 있으며
     *  동물 소리같이 정의는 무조건 해야하나 같은 데이터가 아닐 경우에 꼭 재정의 해서 사용하라는
     *  느낌으로 선언해준다.
     * */
    public abstract void sound();
}
