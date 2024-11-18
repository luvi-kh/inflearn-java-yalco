package sec09.ch02;

public class Button {
    private String text;
    public Button(String text) { this.text = text; }
    public String getText() { return text; }

    private Runnable onClickListener;
    public void setOnClickListener(Runnable onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onClick () {
        onClickListener.run();
    }
}
