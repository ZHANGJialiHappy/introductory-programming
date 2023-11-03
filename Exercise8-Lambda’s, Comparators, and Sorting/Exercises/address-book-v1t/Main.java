public class Main {

    public static void main(String[] args) {
        AddressBook a = new AddressBook();
        a.addDetails(new ContactDetails("jiali", "12345678", "Richard Mortensens"));
        a.changeDetails("1234567", new ContactDetails("jiali", "99998", "Richard Mortensens"));
        // a.removeDetails("123");
    }
}
