package za.ac.cput.domain;

import java.util.Objects;

public class Position {

    private String positionCode;
    private String jobTitle;     // the job this position belongs to
    private String status;       // OPEN or CLOSED

    public Position() {
    }

    private Position(Builder builder) {
        this.positionCode = builder.positionCode;
        this.jobTitle = builder.jobTitle;
        this.status = builder.status;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(getPositionCode(), position.getPositionCode()) &&
                Objects.equals(getJobTitle(), position.getJobTitle()) &&
                Objects.equals(getStatus(), position.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPositionCode(),
                getJobTitle(), getStatus());
    }

    @Override
    public String toString() {
        return "Position{" + "positionCode='" + positionCode + '\'' + ", jobTitle='" + jobTitle + '\'' + ", status='" + status + '\'' + '}';
    }

    public static class Builder {
        private String positionCode;
        private String jobTitle;
        private String status;

        public Builder setPositionCode(String positionCode) {
            this.positionCode = positionCode;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder copy(Position position) {
            this.positionCode = position.positionCode;
            this.jobTitle = position.jobTitle;
            this.status = position.status;
            return this;
        }

        public Position build() {
            return new Position(this);
        }
    }
}