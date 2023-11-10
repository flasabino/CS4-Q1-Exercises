//Ex03_GRA_SabinoFLA
package Ex03_GRA_SabinoFLA;

public class Main {
    public static void main(String[] args) {
        Books firstBook = new Books("The Song of Achilles", 384, false);
        Books secondBook = new Books("You've Reached Sam", 304, false);
        Books thirdBook = new Books("These Violent Delights", 496, true);
        firstBook.output();
        secondBook.output();
        thirdBook.output();
        
        Song song1 = new Song("Anti-Hero", "Taylor Swift", 2022, 3.21);
        Song song2 = new Song("vampire", "Olivia Rodrigo", 2023, 3.39);
        song1.songInfo();
        song2.songInfo();
        
        Singer adele = new Singer("Adele", 16, 0.00);
        Singer tSwift = new Singer("Taylor Swift", 4, 0.00);
        adele.changeFavSong(song1.getName(), song1.getArtist());
        adele.performForAudience(adele.getTotalEarnings(), tSwift.getTotalEarnings(), 
                adele.getAudience1(), tSwift.getAudience1());
        adele.changeFavSong(song2.getName(), song2.getArtist());
        adele.performanceUpdate();
    }
}
