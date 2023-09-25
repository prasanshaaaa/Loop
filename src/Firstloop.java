import java.util.Scanner;

public class Firstloop {
    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int noofsub = input_scanner.nextInt();

        double total_marks = 0;

        for (int sub = 1; sub <= noofsub; sub++) {
            System.out.print("Enter the mark for subject " + sub + ": ");
            double subject_mark = input_scanner.nextDouble();
            total_marks = total_marks + subject_mark;
        }

        double average_mark = total_marks / noofsub;

        System.out.println("Results:");
        System.out.println("Total Marks: " + total_marks);
        System.out.println("Average Mark: " + average_mark);
    }
}
