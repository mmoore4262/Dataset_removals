
package sample;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static void main(String... args)
    {
        List<Book> books = readBooksFromCSV("books.txt");

        // let's print all the person read from CSV file
        for (Book b : books) {
            System.out.println(b);
        }
    }
    private static List<Book> readBooksFromCSV(String fileName) {
        List<Book> books = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();


            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                Book book = createBook(attributes);

                // adding book into ArrayList
                books.add(book);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return books;
    }

    private static Book createBook(String[] metadata) {
        String agency = metadata[0];
        String dataSet = metadata[1];
        String rFR = metadata[2];

        // create and return book of this metadata
        return new Book(agency, dataSet, rFR);
    }

    public List<String> getColumnHeaders()
    {

    }

}

class Book {
    private String agency;
    private String dataSet;
    private String rFR;

    public Book(String agency, String dataSet,String rFR) {
        this.agency = agency;
        this.dataSet = dataSet;
        this.rFR = rFR;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getdataSet() {
        return dataSet;
    }

    public void setDataSet(String dataSet) {
        this.dataSet = dataSet;
    }

    public String getrFR() {
        return rFR;
    }

    public void setrFR(String rFR) {
        this.rFR = rFR;
    }

    @Override
    public String toString() {
        return "Book [agency=" + agency + ", dataSet=" +dataSet + ", Reason for Removal=" + rFR
                + "]";
    }

}



