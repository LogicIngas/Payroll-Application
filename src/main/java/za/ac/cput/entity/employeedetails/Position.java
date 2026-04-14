package za.ac.cput.entity.employeedetails;

public class Position {
    private String positionCode;
    public Status status;

    private Position() {
    }

    public Position(Builder builder) {
        this.positionCode = builder.positionCode;
        this.status = builder.status;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionCode='" + positionCode + '\'' +
                ", status=" + status +
                '}';
    }

    public static class Builder{
        private String positionCode;
        public Status status;

        public Builder setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this;
        }

        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        public Builder copy(Position position){
            this.positionCode = position.positionCode;
            this.status = position.status;
            return this;
        }

        public Position build(){
            return new Position(this);
        }
    }
}
