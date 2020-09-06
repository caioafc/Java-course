package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String result;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        if (student.finalGrade() < 60) {
             result = "FAILED \nMISSING "
                            + String.format("%.2f", student.missingPoints())
                            + " POINTS";
        }
        else {
            result = "PASS";
        }

        System.out.println("\nFINAL GRADE: " + String.format("%.2f", student.finalGrade()) + "\n" + result);
    }
}
