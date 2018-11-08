package kata4.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName;
        fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram <String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
    
}
