import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);



        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);


        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);

        

        StudentGroup group5282 = new StudentGroup(listStud1, 5282);
        StudentGroup group111 = new StudentGroup(listStud2, 111);


        List<StudentGroup> listGroup1 = new ArrayList<StudentGroup>();
        listGroup1.add(group5282);
        listGroup1.add(group111);


        StudentSteam Steam1 = new StudentSteam(listGroup1, 1);

        for(StudentGroup studentgroup : Steam1)
        {
            System.out.println(studentgroup);
        }




        Collections.sort(Steam1.getSteam());



        System.out.println("Поток, с отсортированными по количеству студентов, группами:");

        for(StudentGroup studentgroup : Steam1)
        {
            System.out.println(studentgroup);
        }

    }

}