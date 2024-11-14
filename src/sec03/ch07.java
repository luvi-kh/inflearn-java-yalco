package sec03;

public class ch07 {
    public static void main(String[] args) {
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        //  💡 formatted : 주어진 형식에 따라 문자열 생성
        //  ⭐️ 13+버전에 추가됨. 편의상 강의에서 많이 사용할 것
        String str2 = str1.formatted(circle, two, PI);

        //  💡 이전 버전에서의 방식. 실무에서 사용하려면 기억
        String str3 = String.format(str1, circle, two, PI);

        System.out.printf("%d, %5d, %05d%n- - - - -%n%n", 123, 123, 123);

        //  💡 정수 다양하게 포매팅하기
        String[] intFormats = {
                "%d",        // 1. 기본
                "%13d",      // 2. n 자리수 확보, 오른쪽 정렬
                "%013d",     // 3. 빈 자리수 0으로 채움
                "%+13d",     // 4. 양수는 앞에 + 붙임
                "%,13d",     // 5. 쉼표 사용
                "%-13d",     // 6. 자리수 확보, 왼쪽 정렬
                "%+,013d"    // 7.
        };

        String[] intResults = new String[intFormats.length];

        // 이후의 배울 for 반복문
        // - 위의 형식들로 하나하나 출력해보는 코드
        for (var i = 0; i < intFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 4; j++) {
                format += intFormats[i] + " ";
            }
            format = format.trim() + "%n%n";  // "%d %d %d %d%n%n" ...
            //  System.out.println(format); // 🔍 주석해제하여 함께 확인

            //  🔍 이 숫자들을 스페이스로 구분해서 출력해 볼 것
            System.out.printf(format, 12, 2345, 67890, -1234567);

            //  ⭐️ formatted 메소드에서도 사용 가능
            intResults[i] = format.formatted(12, 2345, 67890, -1234567);
        }

        //  💡 실수 다양하게 포매팅하기
        String[] fltFormats = {
                "%f",       // 1. 기본 (소수점 6자리, 0으로 메움)
                "%.2f",     // 2. 소수점 n자리까지
                "%13.2f",   // 3. 정수자리 확보, 소수자리 제한
                "%,f",      // 4
                "%+013.2f",  // 5
                "%-13.2f",  // 6
        };

        String[] fltResults = new String[fltFormats.length];

        for (var i = 0; i < fltFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 4; j++) {
                format += fltFormats[i] + " ";
            }
            format = format.trim() + "%n%n";

            System.out.printf(format, 1.2, 123.456, 1234.123456789, -123.4567);

            fltResults[i] = format.formatted(1.2, 123.456, 1234.123456789, -123.4567);
        }

        //  💡 문자열 다양하게 포매팅하기
        String[] strFormats = {
                "%s",    // 1. 기본
                "%9s",   // 2. 자리 확보
                "%.2s",  // 3. ~글자만
                "%9.2s", // 4.
                "%-9s",  // 5. 왼쪽 정렬
        };

        String[] strResults = new String[strFormats.length];

        for (var i = 0; i < strFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 2; j++) {
                format += strFormats[i] + " ";
            }
            format = format.trim() + "%n%n";

            System.out.printf(format, "Hello", "하이염");

            strResults[i] = format.formatted("Hello", "하이염");
        }

    }
}
