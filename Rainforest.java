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
        setSeason(newSeason);
        totalSeasons++;
        System.out.println("The season in the Rainforest has changed to " + getSeason() + ".");
    }
}
