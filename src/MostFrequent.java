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
// gets the Most frequent word in the tree
//
// Assumptions:
//      Requires local text file. change file name in
//      TextReader class to the file name with extension
public class MostFrequent {
    private int mostFrequent;
    private Word tmpWord;
    ///////////////////////////////////////////////////////////////////
    /// frequent()                       			    	        ///
    /// Input : none                                                ///
    /// Output: none                                                ///
    /// calls private method find()                                 ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public Word frequent(Node root) {
        find(root);
        return tmpWord;
    }
    ///////////////////////////////////////////////////////////////////
    /// find()                       			            	    ///
    /// Input : Node root                                           ///
    /// Output: none                                                ///
    /// sets mostFrequent to quantity of current node if it is the  ///
    /// most frequent checked so far                                ///
    ///////////////////////////////////////////////////////////////////
    private void find(Node root) {
        if (root != null) {
            //recursive call -- traverse left
            find(root.getlChild());
            int quantity = root.getData().getQuantity();
            if (quantity > mostFrequent) {
                tmpWord = root.getData();
                mostFrequent = quantity;
            }
            //recursive call -- traverse right
            find(root.getrChild());
        }
    }
}
