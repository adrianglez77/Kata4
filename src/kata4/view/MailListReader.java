package kata4.view;
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException {
        List<Mail> lista = new ArrayList<>();
        String ar ="@";
        
        try {
          FileReader fr = new FileReader (fileName);
          BufferedReader br = new BufferedReader(fr);

          String linea;
          while((linea=br.readLine())!=null) {;
              if(linea.contains(ar)){
                  lista.add(new Mail(linea));
              }
          }
          br.close();
          fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
            return lista;
        }
    
}