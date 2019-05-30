//---------------------------------------------------------------------------
//
// Programming Assignment 3
// Reads and parses text into a binary tree sorted alphabetically
//
// Author: Benjamin Gorman
// Date Due: 04/30/2019
// Class: MET CS342
// ****Issues: Text file has strange words such as 'rtf1'****
//
// Description:
// Word class including quantity
//
// Assumptions:
//      Requires local text file. change file name in
//      TextReader class to the file name with extension
import java.util.Objects;

public class Word {
    private String wordString;
    private int quantity = 1;


    public Word() {

    }
    public Word(String data) {
        this.wordString = data;
    }

    ///////////////////////////////////////////////////////////////////
    /// getQuantity()                             			        ///
    /// Input : none                                                ///
    /// Output: int                                                 ///
    /// simple getter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public int getQuantity() {
        return quantity;
    }

    ///////////////////////////////////////////////////////////////////
    /// increaseQuantity()                                          ///
    /// Input : none                                                ///
    /// Output:  quantity +1                                        ///
    /// increase quantitiy of word buy +1                           ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public void increaseQuantity() {
        this.quantity += 1;
    }

    ///////////////////////////////////////////////////////////////////
    /// getWordString()                           			        ///
    /// Input : String                                              ///
    /// Output: WordString                                          ///
    /// simple getter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public String getWordString() {
        return wordString;
    }

    ///////////////////////////////////////////////////////////////////
    /// setWordString()                                             ///
    /// Input : none                                                ///
    /// Output: String data                                         ///
    /// simple Setter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public void setWordString(String data) {
        this.wordString = data;
    }


    ///////////////////////////////////////////////////////////////////
    /// equals()    OVERRIDE                                        ///
    /// Input : other object                                        ///
    /// Output: boolean                                             ///
    /// simple equals method                                        ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word = (Word) o;
        return getWordString().equals(word.getWordString());
    }

    ///////////////////////////////////////////////////////////////////
    /// hashCode()    OVERRIDE                                      ///
    /// Input : none                                                ///
    /// Output: int hashcode                                        ///
    /// calls object hash method                                    ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    @Override
    public int hashCode() {
        return Objects.hash(getWordString());
    }


    ///////////////////////////////////////////////////////////////////
    /// toString()                                                  ///
    /// Input : none                                                ///
    /// Output: String                                              ///
    /// returns word string and quantity                            ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public String toString() {
        String tempString = wordString + " " + quantity;
        return tempString;
    }

    ///////////////////////////////////////////////////////////////////
    /// compareWords()                                              ///
    /// Input : Word otherWord                                      ///
    /// Output: String                                              ///
    /// returns negative number if other word is before this word   ///
    /// returns positive number if other word is after this word    ///
    /// returns zero if other word is equal to this word            ///
    ///////////////////////////////////////////////////////////////////
    public int compareWords(Word otherWord) {
        return (this.getWordString().compareTo(otherWord.getWordString()));
    }
}
