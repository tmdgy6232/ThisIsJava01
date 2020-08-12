package sec06.exam07_staticFinal;

public class Earth {

    /*
    *   상수 (static Final)
    * 상수 이름은 대문자로 작성하는것이 관례이다.
    * 객체마다 저장할 필요가 없는 공용성을 띄는 데이터를 상수라 한다.
    * 상수는 한번 초기값이 정해지면 변경할 수 없다.
    *
    * */
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
