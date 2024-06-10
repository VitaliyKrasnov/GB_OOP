package less1.practice.impl;

public enum HotDrinkVolumes {

    SMALL("объём 250мл"),

    MEDIUM("объём 350мл"),

    LARGE("объём 420мл");

    private final String description; 


    HotDrinkVolumes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
