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
// This is the main, it calls all other methods
//
// Assumptions:
//      Requires local text file. change file name in
//      TextReader class to the file name with extension
public class Driver {

    public static void main(String[] args) {
        Driver me = new Driver();
        me.doIt();
    }
    ///////////////////////////////////////////////////////////////////
    /// doIt()                                 			    	    ///
    /// Input : none                                                ///
    /// Output: none                                                ///
    /// Runs a series of tests on a text file.                      ///
    /// see comments for details                                    ///
    ///////////////////////////////////////////////////////////////////
    private void doIt() {

        TextReader readerObj = new TextReader();
        BinaryTree wordTree = readerObj.readText();

        // Frequency of words
        String[] someWords = {"transylvania", "vampire", "harker", "expostulate", "renfield", "fang"};
        for (String word : someWords) {
            int num = getFrequency(word, wordTree);
            System.out.printf("\n%s: %d\n", word, num);
        }
        // Depth of Tree
        System.out.printf("\nDepth of tree: %d\n", wordTree.depth());

        // Number of different words in text
        System.out.printf("\nNumber of different words in text: %s\n", wordTree.getTotal());

        // Root of tree
        String tmp = wordTree.getRoot().getData().toString();
        System.out.printf("\nRoot word: %s", tmp);

        // Get deepest word
        DeepestNode dp = new DeepestNode();
        String tmpString = dp.deep(wordTree.getRoot()).getWordString();
        System.out.printf("\nDeepestWord: %s", tmpString);

        // Number of words in the text
        int wordsRead = readerObj.getWordsRead();
        System.out.printf("\nWords in Text: %d", wordsRead);

        // Most frequent Word
        MostFrequent frequent = new MostFrequent();
        Word mostFrequent = frequent.frequent(wordTree.getRoot());
        System.out.printf("\nMost Frequent Word: '%s' with %d occurrences\n", mostFrequent.getWordString(), mostFrequent.getQuantity());

        // in order
        System.out.println("In Order:");
        wordTree.inOrder();
        // pre order
        System.out.println("Pre Order:");
        wordTree.preOrder();
        // post order
        System.out.println("Post Order:");
        wordTree.postOrder();

    }
    ///////////////////////////////////////////////////////////////////
    /// getFrequency()                       			    	    ///
    /// Input : String Word, the binary tree                        ///
    /// Output: int indicating frequency of a word within tree      ///
    /// get the frequency of a String within Binary tree. return    ///
    /// number                                                      ///
    ///////////////////////////////////////////////////////////////////
    private int getFrequency(String word, BinaryTree wordList){
        Word tmpWord = new Word(word);
        Node tmpNode = wordList.search(tmpWord);
        if (tmpNode != null){
            return tmpNode.getData().getQuantity();
        }else{
            return 0;
        }
    }
}
