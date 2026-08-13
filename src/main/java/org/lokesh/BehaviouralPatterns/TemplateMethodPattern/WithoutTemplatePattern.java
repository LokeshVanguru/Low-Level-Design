package org.lokesh.BehaviouralPatterns.TemplateMethodPattern;

public class WithoutTemplatePattern {
    public static void main(String[] args) {
        CSVParser csvFile=new CSVParser();
        JSONParser jsonFile=new JSONParser();
        csvFile.parser();
        jsonFile.parser();
    }
}

class CSVParser{
    public void parser()
    {
        openFile();
        //Parsing logic
        System.out.println("CSV PArsing");
        closeFile();
    }
    public void openFile()
    {
        System.out.println("Opening the File");
    }
    public void closeFile()
    {
        System.out.println("Closing the File");
    }
}

class JSONParser{
    public void parser()
    {
        openFile();
        //Parsing logic
        System.out.println("JSON PArsing");
        closeFile();
    }
    public void openFile()
    {
        System.out.println("Opening the File");
    }
    public void closeFile()
    {
        System.out.println("Closing the File");
    }
}


//Code duplication