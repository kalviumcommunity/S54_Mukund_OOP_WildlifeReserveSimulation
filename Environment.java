public class Environment {
    //Attributes
    private String season;
    private final String weather;

    //Constructor
    public Environment(String season, String weather) {
        this.season = season;
        this.weather = weather;
    }

    //Member function to display the current environment details
    public void displayEnvironment() {
        System.out.println("Current Season: " + season);
        System.out.println("Current Weather: " + weather);
    }

    //Member function to simulate the change in environment
    public void changeSeason(String newSeason) {
        season = newSeason;
        System.out.println("The season has changed to " + season + ".");
    }
}
