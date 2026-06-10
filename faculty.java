package Chapter9;

public class faculty extends Employe_hw4 {

    private String officeHours;
    private String rank;

    public faculty(String name, String address, String phone,
                   String email, String office,
                   double salary, MyDate dateHired,
                   String officeHours, String rank) {

        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + getName() +
               ", Rank: " + rank +
               ", Office Hours: " + officeHours;
    }
}