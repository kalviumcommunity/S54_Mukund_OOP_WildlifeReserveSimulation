public class Rainforest extends Environment {
    public Rainforest(String season, String weather) {
        super(season, weather);
    }

    public Rainforest() {
        super();
    }

    @Override
    public void displayEnvironment() {
        System.out.println("Environment: Rainforest");
        System.out.println("Current Season: " + getSeason());
        System.out.println("Current Weather: " + getWeather());
    }

    @Override
    public void changeSeason(String newSeason) {
        this.season = newSeason; // Use the setter method to change the season
        totalSeasons++;          // Incrementing total season count when the season changes
        System.out.println("The season in the Rainforest has changed to " + getSeason() + ".");
    }
}
