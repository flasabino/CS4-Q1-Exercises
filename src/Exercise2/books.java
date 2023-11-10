/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02_GRA_SabinoFLA;

/**
 *
 * @author Chezca Sabino
 */
public class books {
    String title;
    int pages;
    boolean hardcover;
    
    public books(String t, int p, boolean h){
        title = t;
        pages = p;
        hardcover = h;
    }
    
    public void output(){
        System.out.println("I have read the book '" + title + "' which has " + pages + " pages");
        System.out.println("This is a hardcover book: " + hardcover + '\n');
    }
}
