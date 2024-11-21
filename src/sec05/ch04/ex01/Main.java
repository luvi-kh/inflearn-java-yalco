package sec05.ch04.ex01;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
//        String cu = phone.cpu; // ⚠️ 불가

        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

//        String pb = smartPhone.powerButton; // ⚠️ 불가
        String ss2 = smartPhone.sdCardSlot;
    }
}
