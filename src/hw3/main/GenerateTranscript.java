package hw3.main;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenerateTranscript {

    public static void takeInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Id:");
        int studentID = Integer.parseInt(scanner.nextLine());
        Transcript transcript = new Transcript(studentID);

        while (true) {
            System.out.println("Enter Department:");
            String courseDepartment = scanner.nextLine();

            System.out.println("Enter Course Code:");
            int courseCode = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Credit:");
            int courseCredit = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Grade:");
            double gradeTaken = Double.parseDouble(scanner.nextLine());

            CourseGrade courseGrade = new CourseGrade(courseDepartment, courseCode, courseCredit, gradeTaken);
            transcript.addCourseTaken(courseGrade);

            System.out.println("1-Continue \n2-Save and exit");
            int endOfFile = Integer.parseInt(scanner.nextLine());

            if (endOfFile == 2) {
                System.out.println(transcript);
                break;
            }
        }

    }


    public static void takeInputFromFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename:");
        String filename = "src/hw3/" + scanner.nextLine();

        try {
            File file = new File(filename);
            scanner = new Scanner(file);

            int studentID = Integer.parseInt(scanner.nextLine());
            Transcript transcript = new Transcript(studentID);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] courseLine = line.split(" ");

                String courseDepartment = courseLine[0];
                int courseCode = Integer.parseInt(courseLine[1]);
                int courseCredit = Integer.parseInt(courseLine[2]);
                double gradeTaken = Double.parseDouble(courseLine[3]);

                CourseGrade courseGrade = new CourseGrade(courseDepartment, courseCode, courseCredit, gradeTaken);
                transcript.addCourseTaken(courseGrade);
            }

            System.out.println(transcript);

        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found!");
        }
    }
}
