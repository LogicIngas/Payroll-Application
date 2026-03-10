package za.ac.cput.domain;

import java.util.Objects;

public class Identity {
    private String identityType; // e.g., Passport
    private String identityValue; // e.g., ZG1234

    public Identity() {}

    private Identity(Builder builder) {
        this.identityType = builder.identityType;
        this.identityValue = builder.identityValue;
    }

    public String getIdentityType() { return identityType; }
    public void setIdentityType(String identityType) { this.identityType = identityType; }
    public String getIdentityValue() { return identityValue; }
    public void setIdentityValue(String identityValue) { this.identityValue = identityValue; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identity)) return false;
        Identity identity = (Identity) o;
        return Objects.equals(identityValue, identity.identityValue);
    }

    @Override
    public int hashCode() { return Objects.hash(identityValue); }

    @Override
    public String toString() { return "Identity{" + identityType + ": " + identityValue + "}"; }

    public static class Builder {
        private String identityType, identityValue;
        public Builder setIdentityType(String identityType) { this.identityType = identityType; return this; }
        public Builder setIdentityValue(String identityValue) { this.identityValue = identityValue; return this; }
        public Identity build() { return new Identity(this); }
    }
}