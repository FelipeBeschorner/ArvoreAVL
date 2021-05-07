package com.company;

public class Main {

    public static void main (String args[]){
        AvlTree t = new AvlTree();

        System.out.println("\nInserções\n");
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(1);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(2);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(3);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(4);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(5);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(6);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(7);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(8);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.insert(9);
        t.displayTree();
        System.out.println("\n=======================================================================\n");

        System.out.println("\nBusca\n");

        t.search(1);

        System.out.println("\n=======================================================================\n");

        t.search(9);

        System.out.println("\nRemoção\n");

        t.displayTree();

        System.out.println("\n=======================================================================\n");
        t.remove(1);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(2);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(3);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(4);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(5);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(6);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(7);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(8);
        t.displayTree();
        System.out.println("\n=======================================================================\n");
        t.remove(9);
        t.displayTree();
        System.out.println("\n=======================================================================\n");

    }
}
