public class Environment {
    //Attributes - encapsulated as private
    private String season;
    private final String weather;

    //Static variable to track total number of seasons changed across all the environments
    private static int totalSeasons = 0;

    //Constructor
    public Environment(String season, String weather) {
        this.season = season;
        this.weather = weather;
    }

    //Getter methods (Accessors)
    public String getSeason() {
        return season;
    }

    public String getWeather() {
        return weather;
    }

    //Setter methods (Mutators)
    public void setSeason(String season) {
        this.season = season;
    }

    //Member function to display the current environment details
    public void displayEnvironment() {
        System.out.println("Current Season: " + getSeason());
        System.out.println("Current Weather: " + getWeather());
    }

    //Static method to get the total number of season changes
    public static int getTotalSeasons() {
        return totalSeasons;
    }

    //Member function to simulate the change in environment
    public void changeSeason(String newSeason) {
        setSeason(newSeason);       //Use the setter method to change the season
        totalSeasons++;             //Incrementing total season count when the season changes
        System.out.println("The season has changed to " + getSeason() + ".");
    }
}
