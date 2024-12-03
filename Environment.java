public abstract class Environment {
    protected static int totalSeasons = 0;
    protected final String weather;
    protected String season;

    public Environment(String season, String weather) {
        this.season = season;
        this.weather = weather;
    }

    public Environment() {
        this("Spring", "Mild");
    }

    public static int getTotalSeasons() {
        return totalSeasons;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getWeather() {
        return weather;
    }

    public abstract void displayEnvironment();

    public abstract void changeSeason(String newSeason);
}
