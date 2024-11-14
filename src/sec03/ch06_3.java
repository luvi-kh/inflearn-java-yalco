package sec03;

public class ch06_3 {
    public static void main(String[] args) {

        String str_b1 = "Hi! How are you? I'm fine. Thank you!";
        String str_b2 = "how";

        boolean bool_b1 = str_b1.contains(str_b2);

        //  ⭐️ 영문 텍스트에서 대소문자 무관 특정 텍스트 포함 여부 확인시
        boolean bool_b2 = str_b1
                .toUpperCase()
                .contains(str_b2.toUpperCase());

        boolean bool_b3 = str_b1
                .toLowerCase()
                .contains(str_b2.toLowerCase());

        //  4. ⭐️ 다중 연산시 생성되는 문자열 인스턴스의 수가 다름

        String str_d1 = "a" + "b" + "c" + "d";

        // + 연산은 내부적으로 아래와 같이 최적화됨 (이후 배움)
        String str_d2 = new StringBuilder("a")
                .append("b")
                .append("c")
                .append("d")
                .toString(); // "abcd"가 생성됨
        // "a", "b", "c", "d", "abcd"가 생성되어 메모리 차지

        //  concat은 매 번 문자열을 반환하므로
        String str_d3 = "a"
                .concat("b") // "ab"가 생성됨
                .concat("c") // "abc"가 생성됨
                .concat("d"); // "abcd"가 생성됨
        // "a", "b", "c", "d", "ab", "abc", "abcd"가 생성되어 메모리 차지

        String str_a1 = "덜컹";

        // 💡 repeat : 문자열을 주어진 정수만큼 반복
        String str_a2 = str_a1.repeat(2);
        String str_a3 = str_a1
                .concat(" ")
                .repeat(3)
                .trim();

        String str_e1 = "02=123.4567_8900";

        //  💡 replaceAll / replaceFirst : ⭐️ 정규표현식 사용 가능
        //  전부 치환 / 첫 번째 일치부분만 치환
        String str_e2 = str_e1
                .replaceAll("[=._]", "-")
                .replaceFirst("[-@#]", ")");

        String str1 = "가나다라마";
        String str2 = "010-1234-5678";
        String str3 = "하나 둘 셋 넷 다섯";

        //  💡 toCharArray : 문자열을 분할하여 문자의 배열로 반환
        char[] chAry1 = str1.toCharArray();
        char[] chAry2 = str3
                .replace(" ", "")
                .toCharArray();

        //  💡 split : 주어진 기준으로 (~개까지) 분할하여 문자열 배열로 반환
        String[] strAry1 = str1.split("");
        String[] strAry2 = str2.split("-");
        String[] strAry3 = str3.split(" ");
        String[] strAry4 = str3.split(" ", 3);

    }
}
