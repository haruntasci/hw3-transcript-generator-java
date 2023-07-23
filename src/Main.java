import main.CourseGrade;
import main.Transcript;
import util.Grade;

public class Main {
    public static void main(String[] args) {

        CourseGrade firstCourseGrade = new CourseGrade("COMP");
        CourseGrade secondCourseGrade = new CourseGrade("CENG", 201);
        CourseGrade thirdCourseGrade = new CourseGrade("MATH", 600, 3);
        CourseGrade fourthCourseGrade = new CourseGrade("dasdsad", 201, 10, Grade.A);
        CourseGrade fifthCourseGrade = new CourseGrade("CENG", 501, 4, 3);
        CourseGrade sixthCourseGrade = new CourseGrade("COMP", 401, 3, 2.4);
        CourseGrade seventhCourseGrade = new CourseGrade("ECE", 301, 3, 3.7);
        CourseGrade eighthCourseGrade = new CourseGrade("ME", 99, 4, 3.2);


        Transcript transcript = new Transcript(12374923);

        transcript.addCourseTaken(firstCourseGrade);
        transcript.addCourseTaken(secondCourseGrade);
        transcript.addCourseTaken(thirdCourseGrade);
        transcript.addCourseTaken(fourthCourseGrade);
        transcript.addCourseTaken(fifthCourseGrade);
        transcript.addCourseTaken(sixthCourseGrade);
        transcript.addCourseTaken(seventhCourseGrade);
        transcript.addCourseTaken(eighthCourseGrade);


        System.out.println(transcript);


    }
}
