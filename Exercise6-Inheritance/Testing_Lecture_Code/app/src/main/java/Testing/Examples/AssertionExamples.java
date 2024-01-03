package Testing.Examples;

public class AssertionExamples {

    public boolean isEven(int num) {
        return (num % 2 == 0);

    }

    public String nameConcat(String firstName, String lastName) {
        return firstName + " " + lastName;

    }

    public int checkId(int a, int b) {

        if (a < b)
            return a;

        else
            return b;

    }

}
