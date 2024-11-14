package sec04;

import java.util.Scanner;

public class ch07 {
    public static void main(String[] args) {

        //  IDE가 최상단에 import java.util.Scanner 자동 작성
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.nextLine();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        boolean bool = sc.nextBoolean();
        int intNum = sc.nextInt();
        double dblNum = sc.nextDouble();
        // 🧪 기타 next~ 메서드들 확인해 볼 것

        System.out.println("bool: " + bool);
        System.out.println("intNum: " + intNum);
        System.out.println("dblNum: " + dblNum);

        System.out.println("불리언을 입력해주세요.");

        //  💡 다음 입력값이 특정 자료형으로 읽힐 수 있는지 확인
        while (sc.hasNextBoolean()) {
            //  💡 대소문자 무관 비교
            System.out.println("입력값: " + sc.nextBoolean());
        }

        //  ⭐ 스캐너의 사용이 끝나면 OS자원을 반환
        //  파일 등으로부터 읽어오는데 사용시 필수
        sc.close();


        System.out.println("단어를 입력해주세요.");

        while (sc.hasNext()) {
            String nextWord = sc.next();
            if (nextWord.equalsIgnoreCase("quit")) break;
            System.out.println("입력값: " + nextWord);
        }

        System.out.println("문장을 입력해주세요.");

        while (sc.hasNextLine()) {
            String nextSentence = sc.nextLine();
            if (nextSentence.equalsIgnoreCase("quit")) break;
            System.out.println("입력값: " + nextSentence);
        }

        sc.close();

        //  문자열 바로 입력하여 사용하기

        String [] strInputs = new String [5];

        for (int i = 0; i < strInputs.length; i++) {
            strInputs[i] = sc.nextLine();
        }

        sc.close();

        for (String str : strInputs) {
            System.out.println(str);
        }
    }

}
