import com.itextpdf.html2pdf.HtmlConverter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HtmlToPDF {

    public static void main(String[] args) {
        /*
         *   This Maven Project
         *   dependency uses like html2pdf
         * url:-https://mvnrepository.com/artifact/com.itextpdf/html2pdf
         * use software:intelliJ Idea 2019
         * */

        try {
            /*
             *  convertToPdf required 2 parameters
             *  first html file name or path ,second pdf file name to generate
             *   file will converted to pdf, html file display in browser
             */
            HtmlConverter.convertToPdf(new FileInputStream("src/main/java/demo.html"), new FileOutputStream("demo.pdf"));
            System.out.println("Pdf created Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("done");
        }


    }
}
