package ForestsAndCounts;


public class MatrixDirectedCount {

    int[][] matrix;
    int nodes=2;

    public MatrixDirectedCount()
    {
        matrix = new int[nodes][nodes];
    }

    public void addNode()
    {
        matrix = resize(true);

    }
    //z node_1 do node_2
    public void addLink(int node_1,int node_2)
    {
        matrix[node_1-1][node_2-1] = 1;
        matrix[node_2-1][node_1-1] = -1;
    }


    public int[][] resize(boolean a)
    {
        nodes++;
        int[][] temp = new int[nodes][nodes];


        for(int r = 0; r<nodes-1;r++)
        {
            for(int c = 0; c<nodes-1;c++)
            {
                temp[r][c] = matrix[r][c];
            }
        }
        return temp;
    }

    public void showMatrix()
    {
        for(int r=0;r<nodes;r++)
        {
            for(int c=0;c<nodes;c++)
            {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
