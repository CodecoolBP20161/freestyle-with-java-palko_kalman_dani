package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    private int chapterNumber;
    //you need to give the chapters number
    public TextReader(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }


    //this method reads the file line-by-line and prints it out until we get null
    //you need to give the pages number
    public void read (int pageNumber) {
        String page = Integer.toString(pageNumber);
        try (BufferedReader br = new BufferedReader(
                new FileReader("story/chapter"+Integer.toString(this.chapterNumber)+"/"+page)))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}