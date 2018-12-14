package sample;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {


        ArrayList<String> CSVData;

        int numColumns;

        public CSVUtilities(File csv)
        {
               String csvFile="Dataset_Removals.csv";
               BufferedReader br= null;
               String line="";
               String cvsSplitBy=",";

               try
               {
                       br= new BufferedReader(new FileReader(csvFile));
                       while ((line = br.readLine()) != null) {
                               String[] agency= line.split(cvsSplitBy);
                               System.out.println("Agency Name"+ agency[0]);
                       }

               }
               catch (FileNotFoundException e) {
                       e.printStackTrace();
               } catch (IOException e) {
                       e.printStackTrace();
               }
               finally
               {
                       if (br != null)
                       {
                               try {
                                       br.close();
                               } catch (IOException e) {
                                       e.printStackTrace();
                               }
                       }

        /*public List<String> getColumnHeaders()
        {
              return
        }*/
               }
        }
}