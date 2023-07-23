package main;

import util.Grade;

public class CourseGrade {
    private String courseDepartment;
    private int courseCode;
    private int courseCredit;
    private Grade gradeTaken;


    public CourseGrade(String courseDepartment) {
        this(courseDepartment, 100, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode) {
        this(courseDepartment, courseCode, 4, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit) {
        this(courseDepartment, courseCode, courseCredit, Grade.F);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, Grade gradeTaken) {
        setCourseDepartment(courseDepartment);
        setCourseCode(courseCode);
        setCourseCredit(courseCredit);
        setGradeTaken(gradeTaken);
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, double val) {
        setCourseDepartment(courseDepartment);
        setCourseCode(courseCode);
        setCourseCredit(courseCredit);
        setGradeTaken(val);
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {

        if (courseDepartment.equals("COMP") || courseDepartment.equals("ECE") || courseDepartment.equals("ME")
                || courseDepartment.equals("MATH")) {
            this.courseDepartment = courseDepartment;
        } else {
            this.courseDepartment = "CENG";
        }
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        if (courseCode >= 100 && courseCode <= 599) {
            this.courseCode = courseCode;
        } else {
            this.courseCode = 100;
        }
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        if (courseCredit == 3 || courseCredit == 4) {
            this.courseCredit = courseCredit;
        } else {
            this.courseCredit = 4;
        }
    }

    public Grade getGradeTaken() {
        return gradeTaken;
    }

    public void setGradeTaken(Grade gradeTaken) {
        this.gradeTaken = gradeTaken;
    }

    public void setGradeTaken(double val) {
        if (val >= 0 && val <= 4) {
            double roundedValue = Math.round(val);
            for (Grade grade : Grade.values()) {
                if (grade.getNumericValue() == roundedValue) {
                    this.gradeTaken = grade;
                    break;
                }
            }
        } else {
            this.gradeTaken = Grade.F;
        }
    }

    @Override
    public String toString() {
        return "Department: " + courseDepartment +
                " CourseCode: " + courseCode +
                " Credit: " + courseCredit +
                " Grade: " + gradeTaken.getStringValue();
    }
}
