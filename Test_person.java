package Chapter9;

public class Test_person {
public static void main(String[] args) {

person_hw4 person = new person_hw4(
"John Smith",
"123 Main St",
"555-1234",
"john@email.com");

Student student = new Student(
"Alice Johnson",
"456 Oak St",
"555-5678",
"alice@email.com",
Student.JUNIOR);

Employe_hw4 employee = new Employe_hw4(
"Bob Brown",
"789 Pine St",
"555-9999",
"bob@email.com",
"Office 101",
50000,
new MyDate(6, 1, 2024));

faculty faculty = new faculty(
"Dr. Green",
"321 Elm St",
"555-1111",
"green@email.com",
"Office 202",
75000,
new MyDate(8, 15, 2020),
"9AM-11AM",
"Professor");

Staff staff = new Staff(
"Jane White",
"654 Maple St",
"555-2222",
"jane@email.com",
"Office 303",
45000,
new MyDate(3, 10, 2022),
"Administrator");

System.out.println(person);
System.out.println(student);
System.out.println(employee);
System.out.println(faculty);
System.out.println(staff);
}
}
