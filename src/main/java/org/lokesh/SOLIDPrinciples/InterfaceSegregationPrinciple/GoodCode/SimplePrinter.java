package org.lokesh.SOLIDPrinciples.InterfaceSegregationPrinciple.GoodCode;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the Document");
    }
}
