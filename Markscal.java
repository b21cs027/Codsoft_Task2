import java.util.*;
public class Markscal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        int[] marks = new int[numberOfSubjects];
        
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        double avgPercentage = (double) totalMarks / numberOfSubjects;
        
        String grade;
        if (avgPercentage >= 90) {
            grade = "A";
        } else if (avgPercentage >= 80) {
            grade = "B";
        } else if (avgPercentage >= 70) {
            grade = "C";
        } else if (avgPercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
