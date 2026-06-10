package Chapter9;


public class person_hw4 {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public person_hw4(String name, String address,
                      String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}