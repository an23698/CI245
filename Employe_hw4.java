package Chapter9;

public class Employe_hw4 extends person_hw4 {

    private String office;
    private double salary;
    private MyDate dateHired;

    public Employe_hw4(String name, String address, String phone,
                        String email, String office,
                        double salary, MyDate dateHired) {

        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}