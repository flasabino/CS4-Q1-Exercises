import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    earnings = 0.00;
    itemList = new ArrayList();
    storeList.add(this);
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if (index <= itemList.size()) {
        earnings += itemList.get(index).getCost();
        System.out.printf("You have bought %s with the price of PhP %.2f.%n",
                itemList.get(index).getName(), itemList.get(index).getCost());
    }
    // get Item at index from itemList and add its cost to earnings
    else
        System.out.printf("There are only %d items in the store.%n", itemList.size());
    // print statement indicating the sale
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    for(Item i: itemList) {
        if (name.equalsIgnoreCase(i.getName())) {
            earnings += i.getCost();
            System.out.printf("You have bought %s with the price of Php %.2f.%n", i.getName(), i.getCost());
            return;
        }
    }
    System.out.printf("The store doesn't sell %s!%n", name);
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    for (Item e: itemList) {
        if (i == e) {
            earnings += i.getCost();
            System.out.printf("You have bought %s with the price of Php %.2f.%n", i.getName(), i.getCost());
            return;
        }
    }
    System.out.printf("The store doesn't sell %s!%n", i.getName());
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("These are the items that are of %s type: ", type);
    for (Item i: itemList) {
      if (type.equalsIgnoreCase(i.getType()))
          System.out.printf("%s, ", i.getName());
    }
    System.out.printf("%n");
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("These are the items that are at most PhP %.2f: ", maxCost);
    for (Item i: itemList) {
        if (maxCost >= i.getCost())
            System.out.printf("%s, ", i.getName());
    }
    System.out.printf("%n");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("These are the items that are at least PhP %.2f: ", minCost);
    for (Item i: itemList) {
        if (minCost <= i.getCost())
            System.out.printf("%s, ", i.getName());
    }
    System.out.printf("%n");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (Store s: storeList) {
        System.out.printf("%s earned PhP %.2f.%n", s.getName(), s.getEarnings());
    }
  }
}
