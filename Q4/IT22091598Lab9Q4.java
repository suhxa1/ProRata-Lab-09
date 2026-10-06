import java.util.Scanner;

public class IT22091598Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s | %-12.2f | %-5c%n",
                name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            double assignmentMark;
            double examMark;

            do {
                System.out.print("Enter Assignment Mark (out of 100) for "
                        + names[i] + ": ");
                assignmentMark = scanner.nextDouble();

                if (assignmentMark < 0 || assignmentMark > 100) {
                    System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
                }

            } while (assignmentMark < 0 || assignmentMark > 100);

            do {
                System.out.print("Enter Exam Paper Mark (out of 100) for "
                        + names[i] + ": ");
                examMark = scanner.nextDouble();

                if (examMark < 0 || examMark > 100) {
                    System.out.println("Invalid mark. Please enter a mark between 0 and 100.");
                }

            } while (examMark < 0 || examMark > 100);

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println();
        System.out.println("Name            | Final Mark   | Grade");
        System.out.println("---------------------------------------");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}