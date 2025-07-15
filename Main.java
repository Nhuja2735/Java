class Box<T> {
    private T content;
    public void setContent(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        Box<Integer> intBox = new Box<>();
        intBox.setContent(100);
    }
}
