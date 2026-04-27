package homeworks;
import java.util.Random;

public class Homework1_P2 {

// Method to display scores (10 per line)
public static void displayScores(int[] scores) {
System.out.println("Generated Scores:");

for (int i = 0; i < scores.length; i++) {
System.out.printf("%3d ", scores[i]);

// Print 10 scores per line
if ((i + 1) % 10 == 0) {
System.out.println();
}
}
}

// Method to calculate average
public static double calculateAverage(int[] scores) {
int sum = 0;

for (int score : scores) {
sum += score;
}

return (double) sum / scores.length;
}

// Method to count scores above or equal to average
public static void countAboveOrEqualAverage(int[] scores) {
double average = calculateAverage(scores);
int count = 0;

for (int score : scores) {
if (score >= average) {
count++;
}
}

System.out.printf("\nAverage score: %.2f\n", average);
System.out.println("Number of scores above or equal to average: " + count);
}

// Method to count number of scores in each range
public static void scoreRanges(int[] scores) {
int[] ranges = new int[10]; // 0-9, 10-19, ..., 90-99

for (int score : scores) {
ranges[score / 10]++;
}

System.out.println("\nScore Distribution:");
for (int i = 0; i < ranges.length; i++) {
int lower = i * 10;
int upper = lower + 9;

System.out.println(lower + " - " + upper + ": " + ranges[i]);
}
}

public static void main(String[] args) {

// Create integer array of size 100
int[] scores = new int[100];

// Generate 100 random scores (0 - 99)
Random random = new Random();

for (int i = 0; i < scores.length; i++) {
scores[i] = random.nextInt(100);
}

// Invoke methods
displayScores(scores);
countAboveOrEqualAverage(scores);
scoreRanges(scores);
}
}