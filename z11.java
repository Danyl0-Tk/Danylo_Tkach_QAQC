import java.util.*;
import java.util.stream.*;

public class z4 {

    public static void main(String args[]){

        Student st_1 = new Student("Dan", 100, 112);
        Student st_2 = new Student("Ron", 25, 115);
        Student st_3 = new Student("Petro", 32, 108);
        Student st_4 = new Student("Joe", 21, 101);
        Student st_5 = new Student("Rose", 28, 203);

        List<Student> student = new ArrayList<Student>();

        student.add(st_1);
        student.add(st_2);
        student.add(st_3);
        student.add(st_4);
        student.add(st_5);

        System.out.println("Not sorted for age:");
        for(Student age : student){
            System.out.println(age);
        }

        student.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 == o2) {
                    return 0;
                }
                if (o1 != null) {
                    return (o2 != null) ? Integer.compare(o1.get_age(), o2.get_age()) : 1;
                }
                return -1;
            }
        });

        System.out.println("\nAfter sorted for age:");
        for(Student age : student){
            System.out.println(age);
        }

        List<String> students = new ArrayList<String>();

        students.add("Dan");
        students.add("Ron");
        students.add("Petro");
        students.add("Joe");
        students.add("Rose");

        System.out.println("\nNot sorted for name:");
        for(String name : students){
            System.out.println(name);
        }

        Collections.sort(students);

        System.out.println("\nSorted for name:");
        for(String name : students){
            System.out.println(name);
        }

    }
}
