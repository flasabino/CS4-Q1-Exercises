/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02_GRA_SabinoFLA;

/**
 *
 * @author Chezca Sabino
 */
public class Song {
    String name;
    String artist;
    int releaseDate; //year of release date
    double length; //in the format x.zz where x is the number of minutes and zz is the number of seconds
    
    public Song(String n, String a, int rD, double l) {
        name = n;
        artist = a;
        releaseDate = rD;
        length = l;
    }
    
    public void songInfo(){
        System.out.println("This song is titled '" + name + "', was released by " 
                + artist + " in " + releaseDate + " and is " + length +
                " minutes long" + '\n');
    }
}
