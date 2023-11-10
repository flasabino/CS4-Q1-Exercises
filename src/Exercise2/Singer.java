/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02_GRA_SabinoFLA;

/**
 *
 * @author Chezca Sabino
 */
public class Singer {
    String name;
    String favoriteSong;
    int noOfPerformances;
    int audience;
    double earnings;
    
    public Singer(String n, int a, double e) {
        name = n;
        audience = a;
        earnings = e;
    }
    
    public void performForAudience(){
        earnings = audience * 100;
        noOfPerformances++;
        System.out.println("The singer has total earnings of PhP " + earnings +
                '\n');
    }
    
    public void changeFavSong(String favoriteSong, String artist) {
        System.out.println("The singer's favorite song is " + favoriteSong + 
                " by " + artist);
    }
    
    public void performanceUpdate() {
        System.out.println("The singer performed to " + audience + " audiences"
        + '\n');
    }
}
