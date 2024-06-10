package less1.practice.impl;

public enum HotDrinkTemperatures {

    WARM("температура 80°C"),

    HOT("температура 90°C"),

    VERY_HOT("температура 100°C");

    private final String description;

    HotDrinkTemperatures(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
