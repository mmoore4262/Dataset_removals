package sample;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities {

        //List<String> books = readstuffFromCSV("Dataset_Removals.csv");
        ArrayList<String> CSVData;
        int numColumns;

        public CSVUtilities(File csv)
        {
                List<String> books = new ArrayList<>();
                Path pathToFile= Paths.get(csv);

                try (BufferedReader br = Files.newBufferedReader(pathToFile,
                        StandardCharsets.US_ASCII)) {

                        // read the first line from the text file
                        String line = br.readLine();


                        String CSVData=
                }


        }

        public List<String> getColumnHeaders()
        {
              return
        }

}
