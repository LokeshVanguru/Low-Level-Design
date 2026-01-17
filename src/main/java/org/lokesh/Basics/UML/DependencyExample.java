package org.lokesh.Basics.UML;

public class DependencyExample {
    public static void main(String[] args) {
        Document doc=new Document("Bhanu is a Accenture Employee");
        Printer p=new Printer();
        p.print(doc);
    }
}


class Document
{
    private String content;

    Document(String content)
    {
        this.content=content;
    }

    public String getContent()
    {
        return content;
    }
}

class Printer
{
    public void print(Document doc)
    {
        System.out.print("Printing Document:"+doc.getContent());
    }
}