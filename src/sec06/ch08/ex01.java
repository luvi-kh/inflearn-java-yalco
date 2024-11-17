package sec06.ch08;

import java.math.BigDecimal;

public class ex01 {
    public static void main(String[] args) {
        //  부동소수점 오차
        double num1 = 0.2 + 0.3f;
        double num2 = 0.3f * 0.7f;
        double num3 = 0.4 - 0.3;
        double num4 = 0.9f / 0.3;
        double num5 = 0.9 % 0.6;

        //  💡 BigDecimal 클래스
        //  - 부동소수점 오차를 해결

        float num6 = new BigDecimal("0.2")
                .add(new BigDecimal("0.3"))
                .floatValue();

        float num7 = new BigDecimal("0.3")
                .multiply(new BigDecimal("0.7"))
                .floatValue();

        float num8 = new BigDecimal("0.4")
                .subtract(new BigDecimal("0.3"))
                .floatValue();

        double num9 = new BigDecimal("0.9")
                .divide(new BigDecimal("0.3"))
                .doubleValue();

        double num10 = new BigDecimal("0.9")
                .remainder(new BigDecimal("0.6"))
                .doubleValue();
    }
}
