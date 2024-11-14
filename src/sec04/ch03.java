package sec04;

public class ch03 {
    public static void main(String[] args) {
        System.out.println("\n- - - - -\n");

        //  💡 label : 중첩 루프에서 어느쪽을 continue, break 할 지 구분
        outer:
        for (int i = 0; i < 10; i++) {

            inner:
            for (int j = 0; j < 10; j++) {
                if (j % 2 == 0) continue inner;
                if (i * j >= 30) continue outer;

                if (j > 8) break inner;
                if (i - j > 7) break outer;

                System.out.printf("i: %d, j: %d%n", i, j);
            }
        }
    }
}
