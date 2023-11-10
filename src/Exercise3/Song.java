//Ex03_GRA_SabinoFLA
package Ex03_GRA_SabinoFLA;

public class Song {
    private String name;
    private String artist;
    private int releaseDate; //year of release date
    private double length; //in the format x.zz where x is the number of minutes and zz is the number of seconds
    
    public Song(String n, String a, int rD, double l) {
        name = n;
        artist = a;
        releaseDate = rD;
        length = l;
    }
    
    public void songInfo(){
        System.out.println("This song is titled '" + getName() + "', was released by " 
                + getArtist() + " in " + getReleaseDate() + " and is " + getLength() +
                " minutes long" + '\n');
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the releaseDate
     */
    public int getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    
   
    
    
}
