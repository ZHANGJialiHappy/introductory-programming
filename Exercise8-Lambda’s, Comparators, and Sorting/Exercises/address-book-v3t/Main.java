public class Main {

    public static void main(String[] args) {
        try {
            AddressBook a = new AddressBook();
            a.addDetails(new ContactDetails("jiali", "99998", "Richard"));
            a.addDetails(new ContactDetails("jiali2", "99998", "Richard"));
            // a.changeDetails("1234567", new ContactDetails("jiali", "99998", "Richard
            // Mortensens"));
            a.removeDetails("123");
        } catch (NoMatchingDetailsException | DuplicateKeyException e) {
            System.out.println(e);
        }

    }
}
