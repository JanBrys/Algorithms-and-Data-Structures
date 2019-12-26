package OneWayLinkedListWithHead;


public class Main {

    public static void main(String args[])
    {
        Ware A = new Ware("eggs",7,5);
        Ware B = new Ware("bread",10,2);
        Ware C = new Ware("water",20,5);
        Ware D = new Ware("soda",100,1);
        Ware E = new Ware("beef",20,5);

        List<Ware> Shop = new List<>();

        Shop.insert(0,A);
        Shop.insert(1,B);
        Shop.insert(2,C);
        Shop.insert(3,D);
        Shop.insert(4,E);

        System.out.println("Size of the list: " + Shop.size());
        System.out.println();
        Ware F = new Ware("Aaa",200,200);

        Shop.showList();
        System.out.println("\nGetters: \n");
        System.out.println(Shop.get(0).toString() + "\n" + Shop.get(1).toString() + "\n" + Shop.get(2).toString() + "\n" + Shop.get(3).toString() + "\n" + Shop.get(4).toString());

        System.out.println("\nDelete ware at 0 index");
        Shop.delete(0);
        System.out.println("Delete ware at 3 index");
        Shop.delete(3);
        System.out.println("Delete ware at 1 index");
        Shop.delete(1);

        System.out.println("\nSetting new ware at 1 index");
        Shop.set(1, F);
        System.out.println();
        Shop.showList();
        System.out.println();
        System.out.println("Printing list with iterator: ");
        Shop.showListWithIterator();
        System.out.println();
        System.out.println();

        System.out.println(Shop.contains(F));
    }
}