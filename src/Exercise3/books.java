//Ex03_GRA_SabinoFLA
package Ex03_GRA_SabinoFLA;

public class Books {
    private String title;
    private int pages;
    private boolean hardcover;
    
    public Books(String t, int p, boolean h){
        title = t;
        pages = p;
        hardcover = h;
    }
    
    public void output(){
        System.out.println("I have read the book '" + title + "' which has " + pages + " pages");
        System.out.println("This is a hardcover book: " + hardcover + '\n');
    }
}
