import java.io.*;
import java.nio.charset.Charset;

public class TextReader {
    private int wordsRead;

    ///////////////////////////////////////////////////////////////////
    /// readText()                                                  ///
    /// Input : Binary tree                                         ///
    /// Output: none                                                ///
    /// parses a text file into individual words and inserts        ///
    /// them to binary tree                                         ///
    ///////////////////////////////////////////////////////////////////
    public BinaryTree readText() {
        String fileName = "Dracula.rtf";
        BinaryTree wordList = new BinaryTree();

        try {
            String line;
            InputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(isr);

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase();
                String[] lineArray = line.split("\\W+");

                for (String word : lineArray){
                    if (!word.isEmpty()) {
                        wordsRead++;
                        Word wordObj = new Word();
                        wordObj.setWordString(word);
                        if (!wordList.isRepeat(wordObj)) {
                            wordList.add(wordObj);
                        }
                    }
                }
            }
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file " + fileName);
        } catch (IOException e) {
            System.out.println("Problem with input from file " + fileName);
        }
        return wordList;
    }

    ///////////////////////////////////////////////////////////////////
    /// getWordsRead()                           			        ///
    /// Input : none                                                ///
    /// Output: int                                                 ///
    /// simple getter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public int getWordsRead() {
        return wordsRead;
    }
}
