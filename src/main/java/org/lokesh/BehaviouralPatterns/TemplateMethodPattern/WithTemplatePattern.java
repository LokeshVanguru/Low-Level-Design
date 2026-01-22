package org.lokesh.BehaviouralPatterns.TemplateMethodPattern;

import javax.xml.crypto.Data;

public class WithTemplatePattern {
    public static void main(String[] args) {
    CSVParserI csvParserI=new CSVParserI();
    JSONParserI jsonParserI=new JSONParserI();

    csvParserI.parse();

    jsonParserI.parse();

    }
}

abstract class DataParsar {

    //Template Method Define
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile() {
        System.out.println("Opening the File");
    }

    protected void closeFile() {
        System.out.println("Closing the File");
    }

    //abstract method
    protected abstract void parseData();
}


//CSVParser

class CSVParserI extends DataParsar
{

    @Override
    protected void parseData() {
        System.out.println("CSV Parsing");
    }
}

//JSON Parser

class JSONParserI extends DataParsar
{
    @Override
    protected void parseData() {
        System.out.println("JSON Parsing");
    }
}