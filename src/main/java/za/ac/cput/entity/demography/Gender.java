package za.ac.cput.entity.demography;

public class Gender {
    private String generatedId;
    private String description;

     private Gender() { }

    public Gender(Builder builder) {
        this.generatedId = builder.generatedId;
        this.description = builder.description;
    }

    public String getGeneratedId() {
        return generatedId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "generatedId='" + generatedId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String generatedId;
        private String description;

        public Builder setGeneratedId(String generatedId) {
            this.generatedId = generatedId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Gender gender) {
            this.generatedId = gender.generatedId;
            this.description = gender.description;
            return this;
        }

        public Gender build() {
            return new Gender(this);
        }
    }
}