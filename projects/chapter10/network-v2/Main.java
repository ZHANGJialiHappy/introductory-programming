public class Main {

    public static void main(String[] args) {
        NewsFeed jialis = new NewsFeed();
        Post post1 = new MessagePost("jiali", "haha");
        Post post2 = new PhotoPost("jiali1", "Spring", "Spring2023");
        post1.like();
        post2.like();
        post2.addComment("haha");
        jialis.addPost(post1);
        jialis.addPost(post2);
        jialis.show();
    }
}
