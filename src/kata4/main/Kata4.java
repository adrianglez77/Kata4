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
    
    private List<Mail> mailList;
    private Histogram<String> histogram;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Kata4 k4 = new Kata4();
        k4.execute();  
    }
    
    public void execute() throws IOException{
        input();
        process();
        output();
    }
    
    public void input() throws IOException{
        String fileName;
        fileName = "email.txt";
        mailList = MailListReader.read(fileName);
    }
    
    public void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output(){
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
    
}