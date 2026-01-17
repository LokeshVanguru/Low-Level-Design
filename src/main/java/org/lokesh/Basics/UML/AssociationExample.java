package org.lokesh.Basics.UML;

public class AssociationExample {
    public static void main(String []args)
    {
        Teacher t=new Teacher("Lokesh");
        Student s=new Student("Bhanu");
        t.teaches(s);
    }
}

class Student
{
    private String s_name;

    Student(String name)
    {
        s_name=name;
    }

    public String getStudentName()
    {
        return s_name;
    }
}

class Teacher
{
    private String t_name;

    Teacher(String name)
    {
        t_name=name;
    }

    public String getTeacherName()
    {
        return t_name;
    }

    public void teaches(Student s)
    {
        System.out.print(getTeacherName() +" teaches "+s.getStudentName());
    }
}

//Association represent the relation bw two or more classes.
//weak Association-->Aggregation.
//Strong Assocaiation-->Composition.
