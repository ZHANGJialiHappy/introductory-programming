public class Main {
    public static void main(String[] args) {
        Course introProgramCourse = new Course("Introductory Programming", 200);
        System.out.println(introProgramCourse.toString());
        introProgramCourse.setEnrolments(300);
        System.out.println(introProgramCourse.getEnrolments());

    }

}
