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
        if (this == o) return true;
        if (!(o instanceof AddressDetails)) return false;
        AddressDetails that = (AddressDetails) o;
        return Objects.equals(streetAddress, that.streetAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetAddress);
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

//        public AddressDetails.Builder copy(Employee address) {
//            this.postalAddress
//
//        }
        public AddressDetails build(){
            return new AddressDetails(this);
        }
    }
}