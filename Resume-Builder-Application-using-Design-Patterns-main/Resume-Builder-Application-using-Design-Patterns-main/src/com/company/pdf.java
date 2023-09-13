package com.company;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class pdf { private static void doReadWriteTextFile() {

    try {

        BufferedReader inputStream = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Downloads\\Resume-Builder-Application-using-Design-Patterns-main\\Resume-Builder-Application-using-Design-Patterns-main\\src\\com\\company\\resume.txt"));

        String inLine = null;
        StringBuffer sb = new StringBuffer("");

        while ((inLine = inputStream.readLine()) != null) {

            sb.append(inLine);
        }

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(
                "C:\\Users\\ADMIN\\Downloads\\Resume-Builder-Application-using-Design-Patterns-main\\Resume-Builder-Application-using-Design-Patterns-main\\src\\com\\company\\resusijoj.pdf"));
        document.open();
        document.add(new Paragraph(sb.toString()));
        sb.append(inLine);
        System.out.println("Text is inserted into pdf file");
        document.close();

        inputStream.close();

    } catch (Exception e) {

        System.out.println("IOException:");
        e.printStackTrace();

    }

}

    public static void main(String[] args) {
        doReadWriteTextFile();
    }
}