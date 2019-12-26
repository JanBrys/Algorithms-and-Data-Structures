package BSTree;

public class BST {

    //korzen
    private Node root = null;

    //klasa wezlow
    private class Node
    {
        private int key;
        private Node left,right = null;

        Node(int key)
        {
            this.key = key;
        }

        public int getKey()
        {
            return key;
        }
        public Node getLeft()
        {
            return left;
        }
        public Node getRight()
        {
            return right;
        }
        public void setLeft(Node left)
        {
            this.left = left;
        }
        public void setRight(Node right)
        {
            this.right = right;
        }

    }

    //wstawianie nowego wezla
    public void insertNode(int key)
    {
        root = insertNode(key,root);
    }


    //rekurencja przy wstawianiu nowego wezla

    private Node insertNode(int key, Node node)
    {
        if(node == null)
        {
            return new Node(key);
        }
        else
        {
            if(key < node.key)
            {
                node.setLeft(insertNode(key,node.getLeft()));
            }
            else
            {
                node.setRight(insertNode(key,node.getRight()));
            }
            return node;
        }
    }


    //~~~~~~~~~~~~~~ PREORDER INORDER POSTORDER ~~~~~~~~~~~~~~~~~~

    public void preOrder()
    {
        preOrder(root);
    }

    private void preOrder(Node node)
    {
        if(node !=null)
        {
            System.out.println(node.getKey() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void inOrder()
    {
        inOrder(root);
    }
    public void inOrder(Node node)
    {
        if(node!=null)
        {
            inOrder(node.getLeft());
            System.out.println(node.getKey() + " ");
            inOrder(node.getRight());
        }
    }

    public void postOrder()
    {
        postOrder(root);
    }
    private void postOrder(Node node)
    {
        if(node !=null)
        {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getKey() + " ");
        }
    }


    //~~~~~~~~~~~~~~~~ ZNALEZIENIE KLUCZA~~~~~~~~~~~~~~~~~

    public void findNode(int key)
    {
        findNode(key,root);
    }

    private void findNode(int key,Node node)
    {
        if(node!=null)
        {
            if(node.getKey()<key)
            {
                findNode(key,node.getRight());
            }
            else if(key < node.getKey())
            {
                findNode(key,node.getLeft());
            }
            else
            {
                System.out.println("Node with selected key is in tree!");
            }
        }
    }


    //~~~~~~~~~~~~~~~~~~ MIN MAX KEY ~~~~~~~~~~~~~~~~~~
    public int minKey()
    {
        return minKey(root).getKey();
    }
    private Node minKey(Node node)
    {
        while(node.getLeft()!=null)
        {
            node = node.getLeft();
        }
        return node;
    }

    public int maxKey()
    {
        return maxKey(root).getKey();
    }

    private Node maxKey(Node node)
    {
        while(node.getRight()!=null)
        {
            node = node.getRight();
        }
        return node;
    }


    //~~~~~~~~~~~~~~~~~ TREE'S HEIGHT ~~~~~~~~~~~~~~~~~~
    public int maxDepth()
    {
        return maxDepth(root);
    }
    private int maxDepth(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            int left_depth = maxDepth(node.getLeft());
            int right_depth = maxDepth(node.getRight());

            if(right_depth<left_depth)
            {
                return (left_depth+1);
            }
            else
            {
                return right_depth +1;
            }
        }
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AMOUNT OF NODES ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public int countNodes()
    {
        return countNodes(root);
    }

    private int countNodes(Node node)
    {
        if(node != null)
        {
            return countNodes(node.getLeft()) + countNodes(node.getRight()) + 1; //1 = parent
        }
        else
        {
            return 0;
        }
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~ AMOUNT OF LEAVES ~~~~~~~~~~~~~~~~~~~~~~~~~
    public int countLeaves()
    {
        return countLeaves(root);
    }

    private int countLeaves(Node node)
    {
        if(node != null)
        {
            if(node.getLeft() == null && node.getRight()==null)
            {
                return 1;
            }
            else
            {
                return countLeaves(node.getLeft()) + countLeaves(node.getRight());
            }
        }
        else
        {
            return 0;
        }
    }

    //~~~~~~~~~~~~~~~~~ NODES ON LEVELS ~~~~~~~~~~~~~~~~~~~~~~

    public void showLevels() throws EmptyQueueException
    {
        showLevels(root);
    }
    private void showLevels(Node node) throws EmptyQueueException
    {
        System.out.println(" Levels: ");
        Queue<Node> queue = new Queue<>();
        queue.enqueue(node);
        while(!queue.isEmpty())
        {
            if(queue.getFirst().getValue().getLeft()!=null)
            {
                queue.enqueue(queue.getFirst().getValue().getLeft());

            }
            if(queue.getFirst().getValue().getRight()!=null)
            {
                queue.enqueue(queue.getFirst().getValue().getRight());
            }
            System.out.print(queue.dequeue().getKey() + " ");
        }
        //System.out.println();
        //System.out.println();
    }


    //~~~~~~~~~~~~~~~~~~~~~	SUCCESSOR
    public int succesor(int key) throws NoSuchElementException
    {
        Node succ =  succesor(root,key);
        return succ == null?null:succ.key;
    }
    private Node succesor(Node node,int key) throws NoSuchElementException
    {
        if(node == null ) throw new NoSuchElementException();
        if(node.getKey() == key)
        {
            if(node.getRight() != null)
            {
                return minKey(node.getRight());
            }
            else
            {
                return null;
            }
        }
        else if(key - node.getKey() < 0)
        {
            Node retNode = succesor(node.getLeft(),key);
            return retNode == null?node:retNode;
        } else
        {
            return succesor(node.getRight(),key);
        }

    }

    //~~~~~~~~~~~~~~~~~~~~~~~ PREDECCESSOR

    public int predeccessor(int key) throws NoSuchElementException
    {
        Node succ = predeccessor(root,key);
        return succ == null?null:succ.key;
    }
    public Node predeccessor(Node node,int key) throws NoSuchElementException
    {
        if (node == null ) throw new NoSuchElementException();
        if(node.getKey() == key)
        {
            if(node.getLeft() != null)
            {
                return maxKey(node.getLeft());
            }

            else
            {
                return null;
            }

        } else if(key - node.getKey() < 0)
        {
            Node retNode = predeccessor(node.getLeft(),key);
            return retNode == null?node:retNode;
        } else
        {
            return predeccessor(node.getRight(),key);
        }

    }

    public void delete(int key) throws NoSuchElementException
    {
        root = delete(key,root);
    }

    public Node delete(int key,Node node ) throws NoSuchElementException
    {
        if(node == null) throw new NoSuchElementException();
        else
        {
            if(key - node.getKey() < 0)
            {
                node.setLeft(delete(key,node.getLeft())) ;
            }
            else if(key - node.getKey() > 0)
            {
                node.setRight(delete(key,node.getRight()));
            }
            else if(node.getLeft() != null && node.getRight() != null)
            {
                node.setRight(detachMin(node,node.getRight()));
            }
            else
            {
                node = (node.getLeft() != null ) ? node.getLeft() : node.getRight();
            }
        }
        return node;


    }
    public Node detachMin(Node del, Node node) {
        if(node.getLeft() != null)
        {
            node.setLeft(detachMin(del,node.getLeft())) ;
        }
        else
        {
            del.key = node.key;
            node = node.right;
        }
        return node;
    }



}