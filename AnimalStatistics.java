import java.util.HashSet;

public class AnimalStatistics {
    private static final HashSet<String> uniqueSpecies = new HashSet<>();
    private static int animalCount = 0;

    public static void incrementCount(String species) {
        animalCount++;
        uniqueSpecies.add(species);
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getUniqueSpecies() {
        return uniqueSpecies.size();
    }
}
