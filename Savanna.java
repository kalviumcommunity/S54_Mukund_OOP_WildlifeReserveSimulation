public class Savanna extends Environment {
    public Savanna(String season, String weather) {
        super(season, weather);
    }

    public Savanna() {
        super();
    }

    @Override
    public void displayEnvironment() {
        System.out.println("Environment: Savanna");
        System.out.println("Current Season: " + getSeason());
        System.out.println("Current Weather: " + getWeather());
    }

    @Override
    public void changeSeason(String newSeason) {
        setSeason(newSeason);
        totalSeasons++;
        System.out.println("The season in the Savanna has changed to " + getSeason() + ".");
    }
}
