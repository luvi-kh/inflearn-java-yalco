package sec03;

public class ch01 {
    public static void main(String[] args) {
        int int1 = 3;

        int int2 = int1++; // 🔴
        int int3 = ++int1;
        int int4 = -(int2-- * --int3);
    }
}
