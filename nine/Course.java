package nine;

public class Course {
    // create data fields
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    // method to initalize course instance
    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[1];
    }

    // method to add student to course
    public void addStudent(String student) {
        // if the number of students is greater than the array size
        if (numberOfStudents >= students.length) {
            // create new array and copy the old array into the new array
            String[] temp = new String[students.length + 1];
            // using .arraycopy() --> https://www.geeksforgeeks.org/system-arraycopy-in-java/
            System.arraycopy(students, 0, temp, 0, students.length);
            
            // set the new array back to the old array
            students = temp;
        }

        // update number of students
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // methods returning course data
    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName () {
        return courseName;
    }

    // method to drop a student from the course
    public void dropStudent(String student) {
        // index tracking variable
        int count = 0;

        // create new array with a size of one less element
        // subtract 1 from number of students
        String[] temp = new String[--numberOfStudents];

        // iterates over all students in the array
        for (int i = 0; i < students.length; i++) {
            // skip if the element matches the student name passed in the method argument
            if (students[i].equals(student)) {
                continue; 
            }
            
            // add student to array and increase count
            temp[count] = students[i];
            count++;
        }
        // replace old array with updated array
        students = temp;
    }

    public void clear() {

        // set array size to 1 and number of students to 0
        students = new String[1];
        numberOfStudents = 0;
    }
}
