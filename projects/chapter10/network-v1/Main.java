public class Main {
    public static void main(String[] args) {
        NewsFeed jialis = new NewsFeed();
        MessagePost message1 = new MessagePost("jiali", "haha");
        MessagePost message2 = new MessagePost("jiali", "haha");
        PhotoPost photo1 = new PhotoPost("jiali", "spring", "Spring1");
        message1.like();
        message2.like();
        message2.like();
        message1.addComment("good");
        jialis.addMessagePost(message1);
        jialis.addMessagePost(message2);
        jialis.addPhotoPost(photo1);
        jialis.show();
    }

}
