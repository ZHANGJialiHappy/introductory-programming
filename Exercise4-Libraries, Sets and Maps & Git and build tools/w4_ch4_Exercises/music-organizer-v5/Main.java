public class Main {
   public static void main(String[] args) {

      // write you code here
      MusicOrganizer jiali = new MusicOrganizer();
      jiali.addTrack(new Track("jiali", "I love music", "Love Music"));
      // jiali.addTrack(new Track("jiali", "Who loves music", "Love Music"));
      // jiali.addTrack(new Track("jiali", "She loves music", "Love Music"));
      jiali.playTrack(0);
      jiali.playTrack(1);
      jiali.playTrack(2);
      jiali.playTrack(3);
      jiali.playTrack(4);

      System.out.println("............");

      jiali.playTrackOnce();

   }
}
