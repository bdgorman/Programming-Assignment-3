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
// Gets the deepest Node
//
// Assumptions:
//      Requires local text file. change file name in
//      TextReader class to the file name with extension
public class DeepestNode {
    private int deepestLvl;
    private Word tmpWord;
    ///////////////////////////////////////////////////////////////////
    /// deep()                       			    	            ///
    /// Input : none                                                ///
    /// Output: none                                                ///
    /// calls private method find()                                 ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public Word deep(Node root) {
        find(root, 0);
        return tmpWord;
    }
    ///////////////////////////////////////////////////////////////////
    /// find()                       			            	    ///
    /// Input : Node root, int lvl                                  ///
    /// Output: none                                                ///
    /// sets deepestLvl to lvl of current node if it is the         ///
    /// deepest checked so far                                      ///
    ///////////////////////////////////////////////////////////////////
    private void find(Node root, int lvl) {
        if (root != null) {
            //traverse left
            find(root.getlChild(), ++lvl);
            if (lvl > deepestLvl) {
                tmpWord = root.getData();
                deepestLvl = lvl;
            }
            //traverse right
            find(root.getrChild(), lvl);
        }
    }
}