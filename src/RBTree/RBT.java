package RBTree;

public class RBT
{

    RBNode root = null;



    public void insertNode(int key)
    {
        root = insertNode(key,root);
    }



    private RBNode insertNode(int key, RBNode node)
    {
        if(node == null)
        {
            return new RBNode(key);
        }
        else
        {
            if(key < node.key)
            {
                node.left = insertNode(key,node.left);
                node.left.parent = node;
            }
            else
            {
                node.right = insertNode(key,node.right);
                node.right.parent=node;
            }
            return node;
        }
    }



    public void RBinsert(int key)
    {
        insertNode(key);
        RBNode temp = find(key,root);

        if(temp!=root)
        {
            if(temp.parent!=root)
            {
                if(temp.parent.parent!=root)
                {
                    while(temp!=root && temp.parent.color==false)
                    {

                        if(temp.parent == temp.parent.parent.left)
                        {


                            if(temp.parent.parent.right!=null)
                            {
                                if(temp.parent.parent.right.color==false)
                                {
                                    temp.parent.color = true;
                                    temp.parent.parent.right.color = true;
                                    temp.parent.parent.color = false;
                                    temp = temp.parent.parent;
                                }

                                else
                                {
                                    if(temp == temp.parent.right)
                                    {
                                        temp = temp.parent;
                                        leftRotate(temp,root);
                                    }
                                    temp.parent.color = true;
                                    temp.parent.parent.color = false;
                                    rightRotate(temp.parent.parent,root);
                                }
                            }

                            else
                            {
                                if(temp == temp.parent.right)
                                {
                                    temp = temp.parent;
                                    leftRotate(temp,root);
                                }
                                temp.parent.color = true;
                                temp.parent.parent.color = false;
                                rightRotate(temp.parent.parent,root);
                            }


                        }
                        else
                        {
                            if(temp.parent.parent.left!=null)
                            {
                                if(temp.parent.parent.left.color==false)
                                {
                                    temp.parent.color = true;
                                    temp.parent.parent.left.color = true;
                                    temp.parent.parent.color = false;
                                    temp = temp.parent.parent;
                                }
                                else
                                {
                                    if(temp == temp.parent.left)
                                    {
                                        temp = temp.parent;
                                        rightRotate(temp,root);
                                    }
                                    temp.parent.color = true;
                                    temp.parent.parent.color = false;
                                    leftRotate(temp.parent.parent,root);
                                }
                            }
                            else
                            {
                                if(temp == temp.parent.left)
                                {
                                    temp = temp.parent;
                                    rightRotate(temp,root);
                                }
                                temp.parent.color = true;
                                temp.parent.parent.color = false;
                                leftRotate(temp.parent.parent,root);
                            }
                        }
                    }
                }

            }

        }

        if(root.parent!=null)
        {
            root = root.parent;
        }
        root.color=true;


    }

    public void leftRotate(RBNode temp,RBNode node)
    {
        RBNode y = temp.right;
        temp.right = y.left;

        if(y.left!=null)
        {
            y.left.parent = temp;
        }
        y.parent = temp.parent;
        if(temp.parent==null)
        {
            node = y;
        }
        else if(temp == temp.parent.left)
        {
            temp.parent.left = y;
        }
        else
        {
            temp.parent.right = y;
        }

        y.left = temp;
        temp.parent = y;
    }

    public void rightRotate(RBNode temp,RBNode node)
    {
        RBNode y = temp.left;
        temp.left = y.right;

        if(y.right!=null)
        {
            y.right.parent = temp;
        }
        y.parent = temp.parent;
        if(temp.parent==null)
        {
            node = y;
        }
        else if(temp == temp.parent.right)
        {
            temp.parent.right = y;
        }
        else
        {
            temp.parent.left = y;
        }

        y.right = temp;
        temp.parent = y;
    }

    public RBNode find(int key, RBNode node)
    {
        while(node.key!=key)
        {
            if(key<node.key)
            {
                node = node.left;
            }
            else
            {
                node = node.right;
            }
        }
        return node;
    }


    public void showLevels() throws EmptyQueueException
    {
        showLevels(root);
    }
    private void showLevels(RBNode node) throws EmptyQueueException
    {
        System.out.println(" Levels: ");
        Queue<RBNode> queue = new Queue<>();
        queue.enqueue(node);
        while(!queue.isEmpty())
        {
            if(queue.getFirst().getValue().left!=null)
            {
                queue.enqueue(queue.getFirst().getValue().left);

            }
            if(queue.getFirst().getValue().right!=null)
            {
                queue.enqueue(queue.getFirst().getValue().right);
            }
            RBNode temp = queue.dequeue();
            System.out.print(temp.key + " " + temp.color + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void preOrder()
    {
        preOrder(root);
    }

    private void preOrder(RBNode node)
    {
        if(node !=null)
        {
            System.out.print(node.key + " " + node.color + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder()
    {
        inOrder(root);
    }
    public void inOrder(RBNode node)
    {
        if(node!=null)
        {
            inOrder(node.left);
            System.out.print(node.key +" "+ node.color+ " ");
            inOrder(node.right);
        }
    }

    public void postOrder()
    {
        postOrder(root);
    }
    private void postOrder(RBNode node)
    {
        if(node !=null)
        {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " " + node.color + " ");
        }
    }

    public int maxDepth()
    {
        return maxDepth(root);
    }

    public int maxDepthLeftSubtree()
    {
        return maxDepth(root.left);
    }

    public int maxDepthRightSubtree()
    {
        return maxDepth(root.right);
    }

    private int maxDepth(RBNode node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            int left_depth = maxDepth(node.left);
            int right_depth = maxDepth(node.right);

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

    public int countNodes()
    {
        return countNodes(root);
    }

    public int countNodesLeftSubtree()
    {
        return countNodes(root.left)-1;
    }

    public int countNodesRightSubtree()
    {
        return countNodes(root.right)-1;
    }

    private int countNodes(RBNode node)
    {
        if(node != null)
        {
            return countNodes(node.left) + countNodes(node.right) + 1;
        }
        else
        {
            return 0;
        }
    }

    public void addParametersToNode(RBNode node)
    {
        node.amount_of_leaves = countNodes(node)-1;
        node.amount_of_leaves_in_left_subtree = countNodes(node.left);
        node.amount_of_leaves_in_right_subtree = countNodes(node.right);

        node.height = maxDepth(node);
        node.height_of_left_subtree = maxDepth(node.left);
        node.height_of_right_subtree = maxDepth(node.right);

        System.out.println("AMOUNT OF LEAVES");
        System.out.println(node.amount_of_leaves);
        System.out.println("AMOUNT OF LEAVES IN LEFT SUBTREE");
        System.out.println(node.amount_of_leaves_in_left_subtree);
        System.out.println("AMOUNT OF LEAVES IN RIGHT SUBTREE");
        System.out.println(node.amount_of_leaves_in_right_subtree);

        System.out.println("HEIGHT");
        System.out.println(node.height);
        System.out.println("HEIGHT OF LEFT SUBTREE");
        System.out.println(node.height_of_left_subtree);
        System.out.println("HEIGHT OF RIGHT SUBTREE");
        System.out.println(node.height_of_right_subtree);

    }

}


