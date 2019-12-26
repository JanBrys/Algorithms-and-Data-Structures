package RBTree;

public class RBNode
{
    //color = false - RED NODE
    //color = true - BLACK NODE
    boolean color;

    RBNode left,right,parent;

    int key, height, height_of_left_subtree, height_of_right_subtree, amount_of_leaves, amount_of_leaves_in_left_subtree, amount_of_leaves_in_right_subtree;

    //building a default node (0 connection with other nodes)

    public RBNode(int key)
    {
        this.key = key;
        left = null;
        right = null;;
        parent = null;
        color = false;
    }
    public RBNode(RBNode node)
    {
        this.left = node.left;
        this.right=node.right;
        this.color = node.color;
        this.parent = node.parent;
        this.key = node.key;
    }
    public RBNode()
    {
        this.color = true;
    }

}