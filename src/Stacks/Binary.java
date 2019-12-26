package Stacks;

public class Binary {


    public static void makeBinary(int users_number)
    {
        ListStack<Integer> stack_binary = new ListStack<>();
        int binary_number;
        while(users_number>0)
        {
            binary_number = users_number%2;
            stack_binary.push(binary_number);
            users_number = users_number/2;
        }
        while(!stack_binary.isEmpty())
        {
            System.out.print(stack_binary.pop() + " ");
        }
    }

}
