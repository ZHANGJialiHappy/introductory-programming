public class Main {
    public static void main(String[] args) {
        AddressBook a = new AddressBook();
        a.addDetails(new ContactDetails("zh", "123", "address"));
        a.addDetails(new ContactDetails("zh2", "223", "address2"));

        a.search("zh");
        System.out.println(a.getDetails("123"));
        ContactDetails b = new ContactDetails("null", "1234", "hh");
        System.out.println(b);
    }

}
