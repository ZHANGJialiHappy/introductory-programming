public class Main {
   public static void main(String[] args) {
      // NewsFeed a = new NewsFeed();
      // Post b = new MessagePost("zhang2", "message123");
      // Post c = new EventPost("zhang", "456", "party1", "caption girls");
      // a.addPost(b);
      // b.like();
      // a.addPost(new PhotoPost("zhang3", "a", "caption"));
      // a.addPost(c);
      // c.addComment("haha");
      // c.like();
      // a.show();
      Student st = new Student("jiali", 18);
      // String s = st.toString();
      ClassRoom a = new ClassRoom();
      a.addStudent(st);
      a.addStudent(new Student("jiali2", 16));
      a.printOut();

   }
}