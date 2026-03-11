package za.ac.cput.domain;


import java.util.Objects;

public class AddressDetails {
    private String streetAddress;
    private String postalAddress;

    public AddressDetails() {

    }

    private AddressDetails(Builder builder) {
        this.streetAddress = builder.streetAddress;
        this.postalAddress = builder.postalAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AddressDetails that = (AddressDetails) o;
        return Objects.equals(getStreetAddress(), that.getStreetAddress()) &&
                Objects.equals(getPostalAddress(), that.getPostalAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreetAddress(), getPostalAddress());
    }

    @Override
    public String toString() {
        return "AddressDetails{" + "street='" + streetAddress + '\'' + '}';
    }

    public static class Builder {

        private String streetAddress;
        private String postalAddress;
        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }
        public Builder setPostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

public Builder copy(AddressDetails addressDetails) {
            this.streetAddress = addressDetails.streetAddress;
            this.postalAddress = addressDetails.postalAddress;
            return this;
}

        public AddressDetails build(){
            return new AddressDetails(this);
        }
    }
}