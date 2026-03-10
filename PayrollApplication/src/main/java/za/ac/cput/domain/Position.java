// Position.java
package za.ac.cput.domain;

public class Position {
    private String jobTitle;
    private String status; // OPEN or CLOSED

    public Position() {}
    private Position(Builder builder) {
        this.jobTitle = builder.jobTitle;
        this.status = builder.status;
    }

    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public static class Builder {
        private String jobTitle, status;
        public Builder setJobTitle(String jobTitle) { this.jobTitle = jobTitle; return this; }
        public Builder setStatus(String status) { this.status = status; return this; }
        public Position build() { return new Position(this); }
    }
}