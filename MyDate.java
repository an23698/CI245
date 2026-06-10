package Chapter9;

public class MyDate {
private int month;
private int day;
private int year;

public MyDate(int month, int day, int year) {
this.month = month;
this.day = day;
this.year = year;
}

@Override
public String toString() {
return month + "/" + day + "/" + year;
}
}