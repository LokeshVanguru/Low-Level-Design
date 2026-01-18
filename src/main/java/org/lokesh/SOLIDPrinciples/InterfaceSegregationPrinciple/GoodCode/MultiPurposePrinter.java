package org.lokesh.SOLIDPrinciples.InterfaceSegregationPrinciple.GoodCode;

public class MultiPurposePrinter implements Printer,Copier,Scanner{
    @Override
    public void copy(Document doc) {
        System.out.println("Copying the document");
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing the Document");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning the Document");
    }
}
