package homeworks;
import java.util.Scanner;

public class Homework1 {


public static boolean equals(int[] list1, int[] list2) {


if (list1.length != list2.length) {
return false;
}


for (int i = 0; i < list1.length; i++) {
if (list1[i] != list2[i]) {
return false;
}
}

return true;
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);


System.out.print("Enter the number of elements in list1: ");
int size1 = input.nextInt();
int[] list1 = new int[size1];

System.out.print("Enter " + size1 + " numbers for list1: ");
for (int i = 0; i < size1; i++) {
list1[i] = input.nextInt();
}


System.out.print("Enter the number of numbers in list2: ");
int size2 = input.nextInt();
int[] list2 = new int[size2];

System.out.print("Enter " + size2 + " elements for list2: ");
for (int i = 0; i < size2; i++) {
list2[i] = input.nextInt();
}


if (equals(list1, list2)) {
System.out.println("Two lists are strictly identical");
} else {
System.out.println("Two lists are not strictly identical");
}

input.close();
}
}


