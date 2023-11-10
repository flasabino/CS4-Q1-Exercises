/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02_GRA_SabinoFLA;

/**
 *
 * @author Chezca Sabino
 */
public class mainMethod {
    public static void main(String[] args) {
        books firstBook = new books("The Song of Achilles", 384, false);
        books secondBook = new books("You've Reached Sam", 304, false);
        books thirdBook = new books("These Violent Delights", 496, true);
        firstBook.output();
        secondBook.output();
        thirdBook.output();
        
        Song song1 = new Song("Anti-Hero", "Taylor Swift", 2022, 3.21);
        Song song2 = new Song("vampire", "Olivia Rodrigo", 2023, 3.39);
        song1.songInfo();
        song2.songInfo();
        
        Singer adele = new Singer("Adele", 12, 0.00);
        adele.changeFavSong(song1.name, song1.artist);
        adele.performForAudience();
        adele.changeFavSong(song2.name, song2.artist);
        adele.performanceUpdate();
    }
}
