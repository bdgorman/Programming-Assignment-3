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
// Node class used by binary tree
//
// Assumptions:
//      Requires local text file. change file name in
//      TextReader class to the file name with extension
public class Node {
    private Word data;
    private Node lChild;
    private Node rChild;

    ///////////////////////////////////////////////////////////////////
    /// getData()                                 			        ///
    /// Input : none                                                ///
    /// Output: Word data                                           ///
    /// simple getter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public Word getData() {
        return data;
    }

    ///////////////////////////////////////////////////////////////////
    /// setData()                                 			        ///
    /// Input : Word class data                                     ///
    /// Output: none                                                ///
    /// simple setter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public void setData(Word data) {
        this.data = data;
    }

    ///////////////////////////////////////////////////////////////////
    /// getlChild()                                 			    ///
    /// Input : none                                                ///
    /// Output: left node                                           ///
    /// simple getter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public Node getlChild() {
        return lChild;
    }

    ///////////////////////////////////////////////////////////////////
    /// setlChild()                                 			    ///
    /// Input : Word class data                                     ///
    /// Output: none                                                ///
    /// simple setter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public void setlChild(Node lChild) {
        this.lChild = lChild;
    }

    ///////////////////////////////////////////////////////////////////
    /// getrChild()                                 			    ///
    /// Input : none                                                ///
    /// Output: right node                                          ///
    /// simple getter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public Node getrChild() {
        return rChild;
    }

    ///////////////////////////////////////////////////////////////////
    /// setrChild()                                 			    ///
    /// Input : Word class data                                     ///
    /// Output: none                                                ///
    /// simple setter                                               ///
    ///                                                             ///
    ///////////////////////////////////////////////////////////////////
    public void setrChild(Node rChild) {
        this.rChild = rChild;
    }
}
