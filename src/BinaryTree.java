public class BinaryTree {

    private Node root;
    private int total;
    public int counter = 0;

    public int getTotal() {
        return total;
    }

    public Node getRoot() {
        return root;
    }

    public void add(Word data) {

        if (root == null) {
            // Add root to the tree
            root = new Node();
            root.setData(data);
        } else {
            internalAdd(root, data);
        }
        total++;
    }
    // Add unique word (determined not repeat by isRepeat())
    private void internalAdd(Node root, Word data) {
        if (root == null) {
            return;
        }
        // less than 0 means word string is sooner than data string in alphabet
        if (data.compareWords(root.getData()) < 0) {
            if (root.getlChild() == null) {
                // add it to left
                Node n = new Node();
                n.setData(data);
                root.setlChild(n);
            } else {
                // recurse
                internalAdd(root.getlChild(), data);
            }
        } else {
            if (root.getrChild() == null) {
                // add it to right
                Node n = new Node();
                n.setData(data);
                root.setrChild(n);
            } else {
                internalAdd(root.getrChild(), data);
            }
        }

    }

    public Node search(Word data) {
        return (search(root, data));
    }

    private Node search(Node root, Word data) {

        if (root == null)
            return null;

        if (root.getData().equals(data)) {
            return root;
        }

        if (data.compareWords(root.getData()) < 0) {
            // recursive call to left
            return search(root.getlChild(), data);
        } else {
            // recursive call to right
            return search(root.getrChild(), data);
        }


    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
        counter = 0;

    }

    private void preOrder(Node root) {
        counter++;
        if (counter <= 20) {
            System.out.print(root.getData().getWordString() + ", ");
            // recursive call to left child
            if (root.getlChild() != null) {
                preOrder(root.getlChild());
            }
            // recursive call to right child
            if (root.getrChild() != null) {
                preOrder(root.getrChild());
            }
        }
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
        counter = 0;

    }
    private void inOrder(Node root) {
        counter++;
        if (counter <= 20) {
            // recursive call to left child

            if(root.getlChild() != null) {
                inOrder(root.getlChild());
            }
            System.out.print(root.getData().getWordString() + ", ");
            // recursive call to right child

            if (root.getrChild() != null) {
                inOrder(root.getrChild());
            }
        }

    }
    public void postOrder() {
        postOrder(root);
        System.out.println();
        counter = 0;
    }

    private void postOrder(Node root) {
        counter++;
        if (counter <= 20) {

            if (root.getlChild() != null) {
                postOrder(root.getlChild());
            }
            if (root.getrChild() != null) {
                postOrder(root.getrChild());
            }
            System.out.print(root.getData().getWordString() + ", ");
        }
    }

    public int depth() {
        return depth(root, -1, -1);
    }

    private int depth(Node root, int curLevel, Integer maxLevel) {
        if (root == null) {
            return curLevel;
        }

        curLevel++;

        if (curLevel  > maxLevel) {
            maxLevel = curLevel;
        }

        int lmax = depth(root.getlChild(), curLevel, maxLevel);
        int rmax = depth(root.getrChild(), curLevel, maxLevel);
        // return whichever is greater left or right depth
        return rmax > lmax ? rmax : lmax;


    }
    public boolean isRepeat(Word data) {
        Node tmpNode = search(root, data);
        if (tmpNode != null){
            tmpNode.getData().increaseQuantity();
            return true;
        }
        return false;
    }
}
