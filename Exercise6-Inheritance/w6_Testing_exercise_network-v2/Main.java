public class Main {
   public static void main(String[] args) {
      NewsFeed a = new NewsFeed();
      Post b = new MessagePost("null", "null");
      Post c = new EventPost("zhang", "hahaha", "party1", "girls");
      a.addPost(b);
      a.addPost(new PhotoPost("a", "a", "a"));
      a.addPost(c);
      c.addComment("haha");
      c.like();
      a.show();
   }
}