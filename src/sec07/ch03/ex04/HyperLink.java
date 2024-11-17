package sec07.ch03.ex04;

public class HyperLink implements Clickable {
    @Override
    public void onClick() {
        System.out.println("링크로 이동");
    }
}
