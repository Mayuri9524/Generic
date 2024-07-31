public class Box <T>{
    // This is a generic class it should declare it as generic using "<any letter will be allowed here>"
    public T content;

    public void addContent(T content)
    {
        this.content=content;
    }

    public T getContent() {
        return content;
    }
}
