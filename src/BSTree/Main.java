package BSTree;

import java.util.Scanner;








public class Main {

    public static void main(String[] args) throws EmptyQueueException, NoSuchElementException {

        BST bst = new BST();
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.MIN_VALUE;
        int key = Integer.MIN_VALUE;

        BST test = new BST();
        test.insertNode(20);
        test.insertNode(15);
        test.insertNode(35);

        while(run)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("Welcome in menu!");
            System.out.println("1. Insert node with specific key");
            System.out.println("2. Show keys in Preorder" );
            System.out.println("3. Show keys in Inorder" );
            System.out.println("4. Show keys in Postorder" );
            System.out.println("5. Check if tree contains specific key");
            System.out.println("6. MIN key");
            System.out.println("7. MAX key");
            System.out.println("8. Depth");
            System.out.println("9. Number of nodes");
            System.out.println("10. Number of leaves");
            System.out.println("11. Show nodes in levels");
            System.out.println("12. Show succesor for specific key");
            System.out.println("13. Show predecessor for specific key");
            System.out.println("14. Delete node");
            System.out.println("15. Show tree");
            System.out.println("0. End");

            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.print("Insert key: ");
                    key = scanner.nextInt();
                    bst.insertNode(key);
                }break;
                case 2:
                {
                    bst.preOrder();
                }break;
                case 3:
                {
                    bst.inOrder();
                }break;
                case 4:
                {
                    bst.postOrder();
                }break;
                case 5:
                {
                    System.out.println("Write value: ");
                    key = scanner.nextInt();
                    bst.findNode(key);
                }break;
                case 6:
                {
                    System.out.println("MIN KEY: " + bst.minKey());
                }break;
                case 7:
                {
                    System.out.println("MAX KEY: " + bst.maxKey());
                }break;
                case 8:
                {
                    System.out.println("DEPTH: " + bst.maxDepth());
                }break;
                case 9:
                {
                    System.out.println("Number of nodes: " + bst.countNodes());
                }break;
                case 10:
                {
                    System.out.println("Number of leaves: " + bst.countLeaves());
                }break;
                case 11:
                {
                    bst.showLevels();
                }break;
                case 12:
                {
                    System.out.print("Write value: ");
                    key = scanner.nextInt();
                    System.out.println();
                    System.out.println(bst.succesor(key));
                }break;
                case 13:
                {
                    System.out.print("Write value: ");
                    key = scanner.nextInt();
                    System.out.println();
                    System.out.println(bst.predeccessor(key));
                }break;
                case 14:
                {
                    System.out.println("Write value: ");
                    key = scanner.nextInt();
                    bst.delete(key);
                }break;
                case 15:
                {
                    //bst.showTree();
                }break;
                case 0:
                {
                    run=false;
                }break;
                default:
                {
                    System.out.println("Wrong choice.Try again.");
                }break;
            }
        }


    }

}
