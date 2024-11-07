public abstract class Environment {
    //Attributes - encapsulated as private
    protected String season;
    protected final String weather;

    //Static variable to track total number of seasons changed across all the environments
    protected static int totalSeasons = 0;

    //Parameterized Constructor
    public Environment(String season, String weather) {
        this.season = season;
        this.weather = weather;
    }

    //Default Constructor
    public Environment() {
        this.season = "Spring";
        this.weather = "Mild";
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

    //Abstract method for displaying environment details (to be implemented by subclasses)
    public abstract void displayEnvironment();

    //Abstract method for simulating the change in environment (to be implemented by subclass)
    public abstract void changeSeason(String newSeason);

    //Static method to get the total number of season changes
    public static int getTotalSeasons() {
        return totalSeasons;
    }
}
