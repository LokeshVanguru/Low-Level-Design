package org.lokesh.SOLIDPrinciples.LiskovSubstiutionPrinciple.BadCode;

public class Client {

    public static void main(String[] args) {
        File file=new ReadOnlyFile();
        File file1=new File();
        file1.write();// works fine
        file.write(); //throws exception
    }
}

//children object doesn't replaced the parent object
