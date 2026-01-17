package org.lokesh.Basics.UML;

import java.util.Arrays;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        Professor p1=new Professor("Bhanu");
        Professor p2=new Professor("Lokesh");
        Professor p3=new Professor("Srinu");
        Professor p4=new Professor("Venky");

        List<Professor> professor= Arrays.asList(p1,p2,p3,p4);
        Department dept=new Department("cse", professor);
        dept.showProfessors();
    }






}

class Professor
{
    private String p_name;
    Professor(String name)
    {
        p_name=name;
    }

    public String getName()
    {
        return p_name;
    }
}

class Department
{
    private String d_name;
    private List<Professor> professor;

    Department(String name, List<Professor> professor)
    {
        this.d_name=name;
        this.professor=professor;
    }

    public void showProfessors()
    {
        System.out.println("Department : "+d_name);
        for(Professor p:professor)
        {
            System.out.println(p.getName());
        }
    }

}


//professors are exists without department.
//depart are build by grouping professors.
