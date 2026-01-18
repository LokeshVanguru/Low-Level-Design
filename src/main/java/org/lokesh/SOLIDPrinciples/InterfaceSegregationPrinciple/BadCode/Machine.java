package org.lokesh.SOLIDPrinciples.InterfaceSegregationPrinciple.BadCode;

public interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void copy(Document doc);
}
