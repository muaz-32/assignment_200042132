package assignment2.stampCoupling;

import java.util.ArrayList;

public class School {
    ArrayList<Student> students = new ArrayList<>();
    void addStudent(Student student){
        students.add(student);
    }
    void printStudentAddress(Student student){
        System.out.println(student.address);
    }
}
/*--------------------------------Explanation--------------------------------------
In this example, the School class has two methods addStudent and printStudentAddress.
These methods take an object of student class as parameter. The printStudentAddress
method does not need to take student object as parameter, it can take the student
address as parameter. This is stamp coupling.
 */