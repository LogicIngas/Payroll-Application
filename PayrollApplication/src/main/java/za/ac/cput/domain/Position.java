// Position.java
package za.ac.cput.domain;

public class Position {

    private String jobTitle; // I changed this from positionCode to JobTitle
    private String status; // OPEN or CLOSED

    public Position() {
    }

    private Position(Builder builder) {
        this.jobTitle = builder.jobTitle;
        this.status = builder.status;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public String getStatus() {
        return status;
    }

    public static class Builder {
        private String jobTitle;
        private String status;

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Position build() {
            return new Position(this);
        }
    }
}