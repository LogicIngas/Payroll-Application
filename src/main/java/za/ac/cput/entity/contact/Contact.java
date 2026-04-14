package za.ac.cput.entity.contact;

public class Contact {
    private String cellNumber;
    private String homeNumber;
    private String email;

    private Contact() {
    }

    public Contact(Builder builder) {
        this.cellNumber = builder.cellNumber;
        this.homeNumber = builder.homeNumber;
        this.email = builder.email;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cellNumber='" + cellNumber + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

//    public Contact copy(Contact contact){ //I am not sure if I am supposed to crete a copy method for the builder or the contact class
//        this.cellNumber = contact.cellNumber;
//        this.homeNumber = contact.homeNumber;
//        this.email = contact.email;
//        return this;
//    }

    public static class Builder{
        private String cellNumber;
        private String homeNumber;
        private String email;

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder setHomeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Contact contact){
            this.cellNumber = contact.cellNumber;
            this.homeNumber = contact.homeNumber;
            this.email = contact.email;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }
}
