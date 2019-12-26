package ForestsAndCounts;


public class Node {

    int value,rank;
    Node parent;

    public Node(int value)
    {
        this.value = value;
        this.rank = 0;
        parent = null;
    }

    public Node()
    {

    }
}
