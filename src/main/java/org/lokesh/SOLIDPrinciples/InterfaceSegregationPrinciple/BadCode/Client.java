package org.lokesh.SOLIDPrinciples.InterfaceSegregationPrinciple.BadCode;

public class Client {
    public static void main(String[] args) {
        Machine m1=new SimplePrinter();
        Machine m2=new MultiPurposePrinter();
        Document doc=new Document();

        m2.print(doc);
        m2.copy(doc);
        m2.scan(doc);

        m1.print(doc);
        m1.copy(doc);
        m1.scan(doc);

    }
}


