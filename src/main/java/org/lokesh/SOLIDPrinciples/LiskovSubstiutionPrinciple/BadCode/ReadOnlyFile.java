package org.lokesh.SOLIDPrinciples.LiskovSubstiutionPrinciple.BadCode;

public class ReadOnlyFile extends File{


    public void write()
    {
       throw new UnsupportedOperationException("Can't write to read only file");
    }
}
