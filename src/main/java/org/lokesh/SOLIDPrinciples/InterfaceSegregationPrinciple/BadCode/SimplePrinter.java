package org.lokesh.SOLIDPrinciples.InterfaceSegregationPrinciple.BadCode;

public class SimplePrinter implements Machine {
    @Override
    public void print(Document doc) {
        System.out.println("Prints the Document");
    }

    @Override
    public void scan(Document doc) {
      throw new UnsupportedOperationException("scanning not possible.");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("copying not possible.");
    }
}
