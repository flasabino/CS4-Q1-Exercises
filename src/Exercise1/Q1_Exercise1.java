package Exercise1;
public class Q1_Exercise1 {
    public static void main(String[] args) {
        String book1 = "The Song of Achilles";
        int pages1 = 384;
        boolean hardcover1 = false;
        
        String book2 = "You've Reached Sam";
        int pages2 = 304;
        boolean hardcover2 = false;
        
        String book3 = "These Violent Delights";
        int pages3 = 496;
        boolean hardcover3 = true;
        
        System.out.println("SAD BOOKS I'VE ALREADY READ" + '\n');
        System.out.println("Book 1" + '\n' + "Book Title: " + book1 + '\n' + 
        "Number of Pages: " + pages1 + "\n" +
        "[T/F] It's a hardcover book. (" + hardcover1 + ")" +'\n');
        
        System.out.println("Book 2" + '\n' + "Book Title: " + book2 + '\n' + 
        "Number of Pages: " + pages2 + "\n" +
        "[T/F] It's a hardcover book. (" + hardcover2+ ")" + '\n');
        
        System.out.println("Book 3" + '\n' + "Book Title: " + book3 + '\n' + 
        "Number of Pages: " + pages3 + "\n" +
        "[T/F] It's a hardcover book. (" + hardcover3 + ")" + '\n');
        
        System.out.println('\n' + "OPERATIONS" + '\n');
        System.out.println("1. Total number of pages read: " + (pages1+pages2+pages3) + " // (operation: sum)");
        System.out.println("2. The third book is shorter than the first two books combined: " +
                (pages3 < (pages1+pages2)) + " // (operation: sum and comparison)");
        System.out.println("3. All three books are hardcover: " +
                ((hardcover1 == hardcover2 && hardcover2 == hardcover3) && hardcover1 == hardcover3)
                + " // (operation: comparison)");
    }
}