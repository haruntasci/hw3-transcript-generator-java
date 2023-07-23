package main;

import java.util.ArrayList;
import java.util.List;

public class Transcript {
    private int studentID;
    private List<CourseGrade> courseGradeList;
    private double GPA;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.GPA = 0;
        this.courseGradeList = new ArrayList<>();
    }

    private void calculateGPA() {

        double result;
        double totalGPA = 0;
        int totalCredit = 0;
        for (CourseGrade grade : courseGradeList) {
            totalGPA += grade.getCourseCredit() * grade.getGradeTaken().getNumericValue();
            totalCredit += grade.getCourseCredit();
        }
        result = totalGPA / totalCredit;
        result = (double) (Math.round(result * 100)) / 100;

        this.GPA = result;
    }

    public void addCourseTaken(CourseGrade courseGrade) {
        if (courseGrade != null) {
            this.courseGradeList.add(courseGrade);
            calculateGPA();
        } else {
            System.err.println("CourseGrade is null");
        }
    }

    @Override
    public String toString() {

        //Loop boyutu artarsa performans sıkıntısı olabilir, bunun için StringBuilder kullanıldı

        StringBuilder transcriptString = new StringBuilder("Student ID: " + studentID + "\n");
        for (CourseGrade courseGrade : courseGradeList) {
            transcriptString.append(courseGrade.toString().replaceAll("CourseCode:", "Code:")).append("\n");
        }
        transcriptString.append("GPA:").append(GPA);
        return transcriptString.toString();

    }

    //Proje geliştirildikçe ihtiyaç halinde getter ve setter kullanılabilir
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<CourseGrade> getCourseGradeList() {
        return courseGradeList;
    }

    public void setCourseGradeList(List<CourseGrade> courseGradeList) {
        this.courseGradeList = courseGradeList;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
