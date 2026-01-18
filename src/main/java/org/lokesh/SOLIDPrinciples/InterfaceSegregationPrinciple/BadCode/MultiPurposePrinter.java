package org.lokesh.SOLIDPrinciples.InterfaceSegregationPrinciple.BadCode;

public class MultiPurposePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Prints the Document");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("scanning not possible.");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("copying not possible.");
    }
}
