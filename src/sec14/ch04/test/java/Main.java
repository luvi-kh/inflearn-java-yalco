package sec14.ch04.test.java;

import sec14.ch04.App;

public class Main {
    public static void main(String[] args) {
        App app = new App();

        //  💡 @Test를 통해 테스트 메소드 생성
        //  - JUnit은 이를 스캔한 뒤 각각을 실행하기 위해
        //  - 클래스의 인스턴스를 생성한 뒤 이를 호출

        //  💡 DisplayName : 테스트 메소드의 이름을 지정
        //  - 필수 아님

        //  두 값이 같은지 여부
//        @Test
//        @DisplayName("🧮 1 더하기 2")
//        public void addTest1() {
//            int result = app.add2Numbers(1, 2);
//            Assertions.assertEquals(3, result);
//        }
//
//        @Test
//        @DisplayName("🧮 3 더하기 4")
//        public void addTest2() {
//            int result = app.add2Numbers(3, 4);
//            Assertions.assertEquals(5, result);
//        }

        //  값이 null인지 또는 아닌지 여부
//        @Test
//        @DisplayName("🦺 널세이프 - 널이 아님")
//        public void trimTest1() {
//            String result = app.trimNullSafe(null);
//            Assertions.assertNotNull(result);
//        }
//        @Test
//        @DisplayName("🦺 널세이프 - 널임")
//        public void trimTest2() {
//            String result = app.trimNullSafe(null);
//            Assertions.assertNull(result);
//        }

        //  특정 예외가 발생하는지 여부
//        @Test
//        @DisplayName("☢️ 예외가 발생할 것")
//        public void getFirstIntTest1() {
//            int[] intAry = {};
//            Assertions.assertThrows(
//                    ArrayIndexOutOfBoundsException.class,
//                    () -> app.getFirstInt(intAry)
//            );
//        }
    }
}
