package ForestsAndCounts;


public class Main {

    public static void main(String[] args)
    {

        ForestSeparableCollection A = new ForestSeparableCollection();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        A.makeSet(a);
        A.makeSet(b);
        A.makeSet(c);
        A.makeSet(d);
        A.makeSet(e);


        System.out.println("Forest Separable Collection implemented on a list without compression: \n\n");
        A.union(10,20);
        A.union(30, 40);
        A.union(10, 30);
        A.union(30, 50);
        A.showDetailsForNode(10);
        A.showDetailsForNode(20);
        A.showDetailsForNode(30);
        A.showDetailsForNode(40);
        A.showDetailsForNode(50);


        System.out.println("\n\nForest Separable Collection implemented on a list with balancing: \n\n");
        ForestSeparableCollection B = new ForestSeparableCollection();
        B.makeSet(a);
        B.makeSet(b);
        B.makeSet(c);
        B.makeSet(d);
        B.makeSet(e);

        B.unionBalanced(10, 20);
        B.unionBalanced(30, 40);
        B.unionBalanced(10, 50);
        B.unionBalanced(10, 40);
        B.showDetailsForNode(10);
        B.showDetailsForNode(20);
        B.showDetailsForNode(30);
        B.showDetailsForNode(40);
        B.showDetailsForNode(50);


        System.out.println("\n\nForest Separable Collection implemented on an array without compression: \n\n");
        ArraySeparableCollection B1 = new ArraySeparableCollection(5);

        B1.makeSet(0);
        B1.makeSet(1);
        B1.makeSet(2);
        B1.makeSet(3);
        B1.makeSet(4);

        B1.union(0, 1);
        B1.union(2, 3);
        B1.union(3, 4);
        B1.union(1, 4);

        B1.showDetailsForNode(0);
        B1.showDetailsForNode(1);
        B1.showDetailsForNode(2);
        B1.showDetailsForNode(3);
        B1.showDetailsForNode(4);


        System.out.println("\n\nMatrix: \n\n");
        MatrixCount C = new MatrixCount();
        C.addNode();
        C.addLink(1, 3);
        C.addNode();
        C.addLink(1, 4);
        C.addNode();
        C.showMatrix();


        System.out.println("\n\nDirected Matrix: \n\n");
        MatrixDirectedCount D = new MatrixDirectedCount();
        D.addNode();
        D.addLink(1, 3);
        D.addNode();
        D.addLink(1, 4);
        D.addNode();
        D.addLink(4, 2);
        D.showMatrix();


        System.out.println("\n\nArray list count: \n\n");
        ArrayListCount E = new ArrayListCount();
        E.addNode();
        E.addLink(1, 2);
        E.addNode();
        E.addLink(1, 3);
        E.addLink(2,3);
        E.showCount();

    }
}
