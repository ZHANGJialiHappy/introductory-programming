public class EventPost extends PhotoPost {
    private String Message;

    public EventPost(String author, String text, String filename, String caption) {
        super(author, filename, caption);
    }

    public String getMessage() {
        return Message;
    }

}
