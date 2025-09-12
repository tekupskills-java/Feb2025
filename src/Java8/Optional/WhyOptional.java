package Java8.Optional;

import java.util.Optional;

public class WhyOptional {

    public static void main(String[] args) {

       /* Student Student = getStudentWithName("bharat");

        if (Student != null) {
            System.out.println(Student.getName());
        } else {
            System.out.println("no Student with the given name ");
        }*/

        Optional<Student> student = Optional.ofNullable(getStudentWithName("bharat").orElse(new Student("no one", 0, "Unknown")));
        if (student.isPresent()) {
            System.out.println(student.get().getName());
        } else {
            System.out.println("Student  is not present");
        }

    }

    public static Optional<Student> getStudentWithName(String name) {
        // lets suppose that our database contain only 2 students ahmed and hamza .
        if (name.equals("hamza") || name.equals("ahmed")) {
            return Optional.of(new Student(name, 22, "Morocco"));
        } /*else {
            return null;
        }*/
        return Optional.empty();
    }
}
