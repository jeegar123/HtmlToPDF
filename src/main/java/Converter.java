//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.pdmodel.PDPage;
//import org.apache.pdfbox.pdmodel.PDPageContentStream;
//import org.apache.pdfbox.pdmodel.font.PDFont;
//import org.apache.pdfbox.pdmodel.font.PDType0Font;
//import org.apache.pdfbox.pdmodel.font.PDType1Font;
//
//import java.io.IOException;
//
//public class Converter {
//
//    /* class variables*/
////    document
//    private PDDocument document;
//    //    page in document
//    private PDPage pdPage;
//
//
//    public Converter(PDDocument document, PDPage pdPage) {
//        this.document = document;
//        this.pdPage = pdPage;
//    }
//
//    public void createPDF(String fileName) throws IOException {
////        add page to file
//        document.addPage(pdPage);
////        save file
//        document.save(fileName);
//        document.close();
//    }
//
//    public static void main(String[] args) throws IOException {
//        PDDocument pdDocument = new PDDocument();
//        PDPage pdPage=new PDPage();
//        pdDocument.addPage(pdPage);
//
//        PDPageContentStream pdPageContentStream=new PDPageContentStream(pdDocument,pdPage);
//        pdPageContentStream.beginText();
//        pdPageContentStream.setFont(PDType1Font.HELVETICA,13);
//        pdPageContentStream.moveTextPositionByAmount(100,700);
//        pdPageContentStream.drawString("Hello Jeegar");
//        pdPageContentStream.endText();
//        pdPageContentStream.close();
//        Converter converter=new Converter(pdDocument,pdPage);
//        converter.createPDF("demo.pdf");
//        System.out.println("pdf created successfully");
//    }
//
//}
