package RBTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmptyQueueException
    {
        RBT rbt = new RBT();

        rbt.RBinsert(3);
        rbt.RBinsert(1);
        rbt.RBinsert(5);
        rbt.RBinsert(7);
        rbt.RBinsert(6);
        rbt.RBinsert(8);
        rbt.RBinsert(9);
        rbt.RBinsert(10);
        rbt.showLevels();
        System.out.print("POSTORDER: ");
        rbt.postOrder();
        System.out.println();
        System.out.print("PREORDER: ");
        rbt.preOrder();
        System.out.println();

        System.out.print("INORDER: ");
        rbt.inOrder();
        System.out.println();
        System.out.print("MAX DEPTH: ");
        System.out.println(rbt.maxDepth());

        System.out.print("MAX DEPTH FOR LEFT SUBTREE: ");
        System.out.println(rbt.maxDepthLeftSubtree());

        System.out.print("MAX DEPTH FOR RIGHT SUBTREE: ");
        System.out.println(rbt.maxDepthRightSubtree());

        System.out.print("AMOUNT OF NODES: ");
        System.out.println(rbt.countNodes());

        System.out.print("AMOUNT OF NODES IN LEFT SUBTREE: ");
        System.out.println(rbt.countNodesLeftSubtree());

        System.out.print("AMOUNT OF NODES IN RIGHT SUBTREE: ");
        System.out.println(rbt.countNodesRightSubtree());

        System.out.print("PARAMETERS OF THE NODE!: ");
        rbt.addParametersToNode(rbt.find(8, rbt.root));




    }

}

