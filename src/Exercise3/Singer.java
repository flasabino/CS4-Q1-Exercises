//Ex03_GRA_SabinoFLA
package Ex03_GRA_SabinoFLA;

public class Singer {
    private String name;
    private String favoriteSong;
    private int noOfPerformances;
    private static int totalPerformances;
    private int audience1;
    private int audience2;
    private int totalAudience;
    private double totalEarnings;
    private double earnings1;
    private double earnings2;
    
    public Singer(String n, int a1, double tE) {
        name = n;
        audience1 = a1;
        totalEarnings = tE;
        
    }
    
    public void performForAudience(double tE, int a1){
        tE = a1 * 100;
        setNoOfPerformances(getNoOfPerformances() + 1);
        System.out.println("The singer has total earnings of PhP " + 
                tE + '\n');
    }
    
    public void performForAudience(double earnings1, double earnings2, int a1, int a2) {
        setAudience1(a1);
        setAudience2(a2);
        setTotalEarnings((a1 + a2) * 100);
        setTotalPerformances(getNoOfPerformances() + 2);
        earnings1 = getTotalEarnings()/2; //earnings for singer1
        earnings2 = getTotalEarnings()/2; //earnings for singer2
        setTotalAudience(getAudience1()+getAudience2());
        System.out.println("Singer 1 has " + earnings1 + " earnings.");
        System.out.println("Singer 2 has " + earnings2 + " earnings.");
        System.out.println("There is a total of " + getTotalEarnings() + " earnings." + '\n');
    }
    
    public void changeFavSong(String favoriteSong, String artist) {
        System.out.println("The singer's favorite song is " + favoriteSong + 
                " by " + artist + '\n');
    }
    
    public void performanceUpdate() {
        System.out.println("The singer performed to " + getTotalAudience() + " audiences"
        + '\n');
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
     * @return the favoriteSong
     */
    public String getFavoriteSong() {
        return favoriteSong;
    }

    /**
     * @param favoriteSong the favoriteSong to set
     */
    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    /**
     * @return the noOfPerformances
     */
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    /**
     * @param noOfPerformances the noOfPerformances to set
     */
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    /**
     * @return the totalPerformances
     */
    public static int getTotalPerformances() {
        return totalPerformances;
    }

    /**
     * @param aTotalPerformances the totalPerformances to set
     */
    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }

    /**
     * @return the audience1
     */
    public int getAudience1() {
        return audience1;
    }

    /**
     * @param audience1 the audience1 to set
     */
    public void setAudience1(int audience1) {
        this.audience1 = audience1;
    }

    /**
     * @return the audience2
     */
    public int getAudience2() {
        return audience2;
    }

    /**
     * @param audience2 the audience2 to set
     */
    public void setAudience2(int audience2) {
        this.audience2 = audience2;
    }

    /**
     * @return the totalEarnings
     */
    public double getTotalEarnings() {
        return totalEarnings;
    }

    /**
     * @param totalEarnings the totalEarnings to set
     */
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    /**
     * @return the earnings1
     */
    public double getEarnings1() {
        return earnings1;
    }

    /**
     * @param earnings1 the earnings1 to set
     */
    public void setEarnings1(double earnings1) {
        this.earnings1 = earnings1;
    }

    /**
     * @return the earnings2
     */
    public double getEarnings2() {
        return earnings2;
    }

    /**
     * @param earnings2 the earnings2 to set
     */
    public void setEarnings2(double earnings2) {
        this.earnings2 = earnings2;
    }

    /**
     * @return the totalAudience
     */
    public int getTotalAudience() {
        return totalAudience;
    }

    /**
     * @param totalAudience the totalAudience to set
     */
    public void setTotalAudience(int totalAudience) {
        this.totalAudience = totalAudience;
    }
    
    
}
