# Transcript Generator 📑

This project generates transcript with entered data.

# Technologies

Java 17 

# Packages

## Util

### Grade.java

1. The enum type Grade represents the grade of a student and it should define constants
   representing the grades of A, B, C, D, F. <br /><br />
2. The constants should be named Grade.A, Grade.B, Grade.C, Grade.D, Grade.F. <br /><br />
3. Grade should have two instance fields, stringValue and numericValue. <br /><br />
4. stringValue should contain a String representation of the letter grade, e.g., “C”, “A”. <br /><br />
   numericValue should contain the numeric grade corresponding to the letter grade, which
   are 4, 3, 2, 1, 0 for A, B, C, D, and F respectively. <br /><br />
5. Implement an appropriate toString() method for this class that will print the letter and
   numerical grade stored for a grade as in the following form (for Grade.F):<br /><br />
   Grade F corresponds to numeric grade 0 <br />

### GradeTest.java

1. In the package, hw3.util, write a test program GradeTest that uses the enhanced for
   loop, and the values() method of Grade to print out the following output: <br /><br />
   Grade F corresponds to numeric grade 0. <br />
   Grade D corresponds to numeric grade 1. <br />
   .  <br />
   . <br />
   . <br />
   Grade A corresponds to numeric grade of 4.<br /><br />
2. Use toString() method of Grade class during printing.<br />

## Main

### CourseGrade.java

1. The CourseGrade class will keep information about the department the course is offered,
   course code of the course, credit of the course and the grade taken for that course in the
   courseDepartment, courseCode and courseCredit and gradeTaken fields. <br /><br />
2. courseDepartment is a four letter acronym indicating the department, the class is offered. <br /><br />
3. The possible values of departments in your application are CENG, COMP, ECE, ME and MATH. <br /><br />
4. courseCode is a three digit code (e.g., 101, 200, or 590) for the course. This number should
   be between 100 and 599. <br /><br />
5. courseCredit is an integer that indicates how many credits the course is worth. The only
   valid values are 3 and 4. <br /><br />
6. gradeTaken is a Grade value that represents the grade obtained in this course. <br /><br />
7. Provide all appropriate get and set methods for the fields above. Set methods should perform a
   check on their arguments and set the field to a default value if the argument to the set method
   is invalid. <br /><br />
8. Default values for courseCode is 100, courseCredit is 4, courseDepartment is CENG
   and gradeTaken is Grade.F. <br /><br />
9. The set method for gradeTaken should be overloaded as specified below:
    setGradeTaken(double val) should select the letter grade whose numeric
   value is closest to val if numValue is between 0 and 4.0 . Otherwise it should set
   gradeTaken to Grade.F
    setGradeTaken (Grade g) should simply set the grade to the value given by g <br /><br />
10. Implement four overloaded constructors which will take either
     only courseDepartment
     courseDepartment and courseCode
     courseDepartment, courseCode and courseCredit
     courseDepartment, courseCode , courseCredit , and gradeTaken
    as input. They will fill in the missing parameters for the fields to the default values mentioned in
    item 8. <br /><br />
11. The first , second and third constructor will call the fourth constructor and that constructor
    should set all the fields using the set method of those variables. <br /><br />
12. Implement a toString() method for this class that will return a string value that contains all
    the information stored for a CourseGrade object in the following form:<br /><br />
    Department: CENG CourseCode: 201 Credit: 5 Grade: F <br />

### Transcript.java

1. This class keeps the transcript of a student with id studentID. <br /><br />
2. studentID is an integer value storing the id of the student. <br /><br />
3. Each student transcript can contain grades of arbitrary number of courses, therefore, the class
   keeps an arbitrary number of CourseGrade objects that stands for the grades taken by the
   student throughout her education. Therefore, you should include an appropriate field in the
   class to keep these arbitrary number of CourseGrade objects. <br /><br />
4. The class also calculates and stores the GPA of the student as a double field which is the average
   of all grades taken by the student for all the courses. GPA is therefore a value between 0.0 and
   4.0. <br /><br />
5. Class has a one-argument constructor that takes an integer containing the student’s id ,sets
   GPA to 0.0 and initializes the list of CourseGrade objects. <br /><br />
6. It has an addCourseTaken method which will take a CourseGrade object as input and
   inserts it into the list of course grades stored in the Transcript. This method should first check
   that CourseGrade object given as parameter is not null. Otherwise, it should not perform
   the addition and print an error message. In addition, it should update the GPA of the student
   accordingly. <br /><br />
7. The class should have a toString()method that prints the student’s transcript. This method
   should use the toString()method of CourseGrade class. The student’s GPA together
   with each of the course grades should be printed in the following form. <br /><br />
   Student ID: 1112234 <br />
   Department: CENG Code: 201 Credit: 5 Grade: C <br />
   Department: CENG Code: 201 Credit: 5 Grade: A <br />
   Department: CENG Code: 201 Credit: 5 Grade: C <br />
   Department: CENG Code: 201 Credit: 5 Grade: A <br />
   Department: CENG Code: 201 Credit: 5 Grade: B <br />
   GPA:3.0 <br />

### GenerateTranscript.java

To be done in the next assignment...
