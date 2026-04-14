package za.ac.cput.entity.demography;

public class Race {
    private String raceId;
    private String description;

    private Race() {
    }

    public Race(Builder builder) {
        this.raceId = builder.raceId;
        this.description = builder.description;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String raceId;
        private String description;

        public Builder setRaceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Race race){
            this.raceId = race.raceId;
            this.description = race.description;
            return this;
        }

        public Race build(){
            return new Race(this);
        }
    }
}
