package za.ac.cput.entity.contact;

public class Address {
    private String streetAddress;
    private String postalAddress;
    private String email;

    private Address() {
    }

    public Address(Builder builder) {
        this.streetAddress = builder.streetAddress;
        this.postalAddress = builder.postalAddress;
        this.email = builder.email;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private String streetAddress;
        private String postalAddress;
        private String email;

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setPostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Address address){
            this.streetAddress = address.streetAddress;
            this.postalAddress = address.postalAddress;
            this.email = address.email;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
