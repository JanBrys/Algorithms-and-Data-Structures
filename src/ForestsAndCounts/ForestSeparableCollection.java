package ForestsAndCounts;

import java.util.*;
public class ForestSeparableCollection
{
    ArrayList<Node> list_of_nodes;

    public ForestSeparableCollection()
    {
        list_of_nodes = new ArrayList<Node>();
    }

    public Node getNode(int value)
    {
        for(int i = 0; i < list_of_nodes.size();i++)
        {
            if(list_of_nodes.get(i).value==value)
            {
                return list_of_nodes.get(i);
            }
        }
        return null;
    }

    public void makeSet(Node node)
    {
        node.parent = node;
        list_of_nodes.add(node);
    }

    void union(int val_1,int  val_2)
    {
        find(getNode(val_1)).parent = find(getNode(val_2)).parent;

    }



    public Node find(Node node)
    {
        if(node!=node.parent)
        {
            return find(node.parent);
        }
        return node.parent;
    }

    public void unionBalanced(int val_1,int val_2)
    {
        Node root_1 = find(getNode(val_1));
        Node root_2 = find(getNode(val_2));

        if(root_1.rank>root_2.rank)
        {
            root_2.parent = root_1;
            root_1.rank+=1;
        }
        else
        {
            root_1.parent = root_2;
            root_2.rank+=1;
        }


    }

    public void showDetailsForNode(int value)
    {
        System.out.println("Details for Node with value = " + value );
        System.out.println("Parent's value : " + getNode(value).parent.value);
        System.out.println("Representant's value for node: " + find( getNode(value).parent).value);
        System.out.println();
    }


    public void kruskal()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();


    }


}
