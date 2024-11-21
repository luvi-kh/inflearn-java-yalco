package sec06.ch01;

public class Ex03 {
    String str = "바깥쪽";
    {
        String str = "안쪽"; // ⚠️ 불가
    }

//    while (true) {
//        String str = "안쪽"; // ⚠️ 불가
//    }
}
