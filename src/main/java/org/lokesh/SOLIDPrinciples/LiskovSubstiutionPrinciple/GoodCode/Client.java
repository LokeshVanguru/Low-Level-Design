package org.lokesh.SOLIDPrinciples.LiskovSubstiutionPrinciple.GoodCode;

public class Client {

    public static void readAnyFile(ReadableFile file)
    {
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readablefile=new ReadonlyFile();
        readablefile.read();

        WriteableFile writeablefile=new WriteableFile();
        writeablefile.write();
        writeablefile.read();

        readAnyFile(writeablefile);
        // writeablefile is a child of readablefile in this case it is replaceable

        readAnyFile(readablefile);
    }
}
