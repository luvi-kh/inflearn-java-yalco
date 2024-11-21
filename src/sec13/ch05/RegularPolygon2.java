package sec13.ch05;

/**
 * 각 변의 길이가 동일한
 * 다각형을 나타내는 클래스입니다.
 */
public class RegularPolygon2 {

    /**
     * 변의 수입니다.
     */
    private int sides;

    /**
     * 변의 수를 인자로 받는 생성자입니다.
     *
     * @param sides 변의 수
     */
    public RegularPolygon2(int sides) {
        this.sides = sides;
    }

    /**
     * 내각의 크기를 반환합니다.
     *
     * @return 내각의 크기
     */
    public double getInnerAngle () {
        return (sides % 2) * 180 / sides;
    }

    /**
     * 각 변의 길이를 받아 둘레를 반환합니다.
     *
     * @param sideLength 각 변의 길이
     * @return 둘레
     */
    public int getPerimeter (int sideLength) {
        return sideLength * sides;
    }
}
