import gradleproj1.Course;
import gradleproj1.Student;
import gradleproj1.Module;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {
        //System.out.println("test");

        //Student object creation
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.setName("Jane");
        s1.setAge(20);
        s1.setDob("10/5/2003");
        s1.setId(180000);


        s2.setName("Harry");
        s2.setAge(20);
        s2.setDob("1/2/1999");
        s2.setId(180001);

        s3.setName("Sarah");
        s3.setAge(21);
        s3.setDob("4/7/2001");
        s3.setId(180002);

        s4.setName("Tom");
        s4.setAge(22);
        s4.setDob("8/9/2000");
        s4.setId(180003);

        //Module object creation
        Module m1 = new Module();
        Module m2 = new Module();
        Module m3 = new Module();

        ArrayList<Module> listModules = new ArrayList<>();
        listModules.add(m1);
        listModules.add(m2);
        listModules.add(m3);

        m1.setName("Machine Learning");
        m2.setName("Software Engineering 3");
        m3.setName("Advanced Professional Skills");

        m1.setId(4101);
        m2.setId(417);
        m3.setId(436);

        //Grouping students into modules
        ArrayList<Student> m1Enrolled = new ArrayList<>();
        m1Enrolled.add(s1);
        m1Enrolled.add(s4);
        m1.setStudents(m1Enrolled);

        ArrayList<Student> m2Enrolled = new ArrayList<>();
        m2Enrolled.add(s2);
        m2Enrolled.add(s3);
        m2.setStudents(m2Enrolled);

        ArrayList<Student> m3Enrolled = new ArrayList<>();
        m3Enrolled.add(s2);
        m3Enrolled.add(s4);
        m3.setStudents(m3Enrolled);


    }
}
