package Homework_CIS245;
import java.util.Scanner;

public class CI245_homework2 {

public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS) {
Scanner input = new Scanner(System.in);

for (int i = 0; i < NAMES.length; i++) {
	System.out.println("Enter work hours for " + NAMES[i] + ":");

for (int j = 0; j < DAYS.length; j++) {
System.out.print(DAYS[j] + ": ");
hours[i][j] = input.nextDouble();
}
}
}
		
public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS) {

System.out.println("\nWeekly Work Hours:");
System.out.print("Employee\t");

for (String day : DAYS) {
	System.out.print(day + "\t");
		}
	System.out.println();

for (int i = 0; i < NAMES.length; i++) {
	System.out.print(NAMES[i] + "\t\t");

for (int j = 0; j < DAYS.length; j++) {
	System.out.print(hours[i][j] + "\t");
		}
	System.out.println();
		}
		}
public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS) {
double total = 0;

for (int i = 0; i < NAMES.length; i++) {
for (int j = 0; j < DAYS.length; j++) {
total += hours[i][j];
	}
	}

return total;
	}

		
public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS) {

System.out.println("\nTotal Hours by Employee:");

for (int i = 0; i < NAMES.length; i++) {
double employeeTotal = 0;

for (int j = 0; j < DAYS.length; j++) {
employeeTotal += hours[i][j];
}

System.out.println(NAMES[i] + ": " + employeeTotal + " hours");
	}
	}

	public static void main(String[] args) {

String[] NAMES = {"Tom", "Jane", "Mark"};
String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI"};

double[][] hours = new double[NAMES.length][DAYS.length];
		
	input_hours(hours, NAMES, DAYS);

	display_hours(hours, NAMES, DAYS);

System.out.println("------------------------------------------------");
System.out.println("Total hours : " + totalHours(hours, NAMES, DAYS));
totalHoursByEmployee(hours, NAMES, DAYS);
	}
	}

