package Stacks;

import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        System.out.println("~~~~~~STACK BASED ON LIST~~~~~~\n\n\n");
        ListStack<Integer> lista = new ListStack<>();
        System.out.println("Is empty: " + lista.isEmpty());
        System.out.println("Is full: " + lista.isFull());
        System.out.println("\nAdding 10->124->75");
        lista.push(10);
        lista.push(124);
        lista.push(75);
        System.out.println("\nShowing stack: ");
        lista.showStack();
        System.out.println("Pop");
        lista.pop();
        System.out.println("\nShowing stack: ");
        lista.showStack();
        System.out.println("Pop");
        lista.pop();
        System.out.println("\nShowing stack: ");
        lista.showStack();
        System.out.println("Pop");
        lista.pop();
        System.out.println("Adding 100->200");
        lista.push(100);
        lista.push(200);
        System.out.println("\nShowing stack: ");
        lista.showStack();
        System.out.println("Pop");
        lista.pop();
        System.out.println("\nShowing stack: ");
        lista.showStack();
        System.out.println("Pop");
        lista.pop();
        System.out.println("\nShowing stack: ");
        lista.showStack();
        System.out.println("Pop");
        lista.pop();


        System.out.println("\n\n\n ~~~~~~STACK BASED ON ARRAY~~~~~~");

        ArrayStack<Integer> stos = new ArrayStack<>();
        System.out.println("\nDefault size: " + stos.size());

        System.out.println("\n Adding 1");
        stos.push(1);
        System.out.println("\nSize: " + stos.size());
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("Adding 2->3->4->5->6");
        stos.push(2);
        stos.push(3);
        stos.push(4);
        stos.push(5);
        stos.push(6);
        System.out.println("\nSize: " + stos.size());
        System.out.println("Adding 7");
        stos.push(7);
        System.out.println("\nSize: " + stos.size());
        System.out.println("Adding 8");
        stos.push(8);
        System.out.println("\nSize: " + stos.size());
        System.out.println("Adding 9->10->11");
        stos.push(9);
        stos.push(10);
        stos.push(11);
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\n Poping 2 times");
        stos.pop();
        stos.pop();
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\n Poping 4 times");
        stos.pop();
        stos.pop();
        stos.pop();
        stos.pop();
        System.out.println("\nShowing stack:");

        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\n Poping 1 time");
        stos.pop();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\n Poping 1 time");
        stos.pop();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\n Poping 1 time");
        stos.pop();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\n Poping 1 time");
        stos.pop();
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("Adding 20");
        stos.push(20);
        System.out.println("\nSize: " + stos.size());
        System.out.println("\nAdding 30");
        stos.push(30);
        System.out.println("\nSize: " + stos.size());
        System.out.println("\nAdding 100");
        stos.push(100);
        System.out.println("\nSize: " + stos.size());
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\n Poping 2 times");
        stos.pop();
        stos.pop();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\n Poping 1 time");
        stos.pop();
        System.out.println("\nSize: " + stos.size());
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("Poping 1 time");
        stos.pop();
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("Adding 999");
        stos.push(999);
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("Adding 0");
        stos.push(0);
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());
        System.out.println("Poping 1 time");
        stos.pop();
        System.out.println("\nShowing stack:");
        stos.showStack();
        System.out.println("\nSize: " + stos.size());



        System.out.println("\n\n\n ~~~~~~DESIGNATING BINARY NUMBER WITH STACK~~~~~~");

        int a = 128;
        System.out.println("Number: " + a);

        Binary.makeBinary(a);


        System.out.println("\n\n\n ~~~~~~POSTFIX NOTATION ALGORITHM WITH STACK~~~~~~");

        PostfixNotation test = new PostfixNotation();

        System.out.println(test.calculatePrefixNotation());

    }
}
