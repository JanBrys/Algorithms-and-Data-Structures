package Stacks;

import java.io.*;

public class PostfixNotation {
    ListStack<Double> stack;

    public PostfixNotation()
    {
        stack = new ListStack<>();
    }

    public Boolean isOperand(char c)
    {
        if(c=='+' || c=='-' || c=='*' || c=='/')
        {
            return true;
        }
        return false;

    }

    public double calculatePrefixNotation()
    {
        String signs = "";
        String[] temp_signs;
        try
        {
            File my_file = new File("file.txt");
            FileReader temp_file = new FileReader(my_file);
            BufferedReader file = new BufferedReader(temp_file);


            String row;

            row = file.readLine();
            signs = row;
            file.close();

        }
        catch (Exception zd)
        {
            zd.printStackTrace();
        }
        System.out.println("Expression: " + signs);
        temp_signs = signs.split(" ");
        signs= "";


        for(int a=0;a<temp_signs.length;a++)
        {

            signs = signs + temp_signs[a];
        }

        for(int i=0 ; i<signs.length();i++)
        {
            if(!isOperand(signs.charAt(i)))
            {
                stack.push((double)signs.charAt(i) -48);
                stack.showStack();
            }
            else if(isOperand(signs.charAt(i)))
            {
                double o1 = stack.top();
                stack.pop();
                double o2 = stack.top();
                stack.pop();


                switch (signs.charAt(i))
                {
                    case '+':
                        stack.push(o1 + o2);
                        break;
                    case '-':
                        stack.push(o1 - o2);
                        break;
                    case '*':
                        stack.push(o1 * o2);
                        break;
                    case '/':
                        stack.push(o1 / o2);
                        break;
                }
            }
        }
        return stack.top();
    }
}
