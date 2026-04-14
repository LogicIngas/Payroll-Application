package za.ac.cput.entity.employment;

public class Identity {
    private String identityType;
    private String description;

    private Identity() {
    }

    public Identity(Builder builder) {
        this.identityType = builder.identityType;
        this.description = builder.description;
    }

    public String getIdentityType() {
        return identityType;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "identityType='" + identityType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String identityType;
        private String description;

        public Builder setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Identity identity){
            this.identityType = identity.identityType;
            this.description = identity.description;
            return this;
        }

        public Identity build(){
            return new Identity(this);
        }
    }
}
