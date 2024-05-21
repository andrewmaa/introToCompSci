package nine;

public class problem2 {
    public static void main(String[] args) {

        // create new course
        Course myCourse = new Course("Intro to Computer Science");

        // add 3 students
        myCourse.addStudent("Faith");
        myCourse.addStudent("Sanviti");
        myCourse.addStudent("Bob");

        // drop 1 student
        myCourse.dropStudent("Bob");

        // print number of students in course
        System.out.println("Number of students: " + myCourse.getNumberOfStudents() + "\n");

        // print students in course
        System.out.println("Students in course:");
        for (int i = 0; i < myCourse.getNumberOfStudents(); i++) {
            System.out.println(myCourse.getStudents()[i]);
        }





    }
}
