public class NumberBox <T extends Number>{
    private T content;

    public NumberBox(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

}
