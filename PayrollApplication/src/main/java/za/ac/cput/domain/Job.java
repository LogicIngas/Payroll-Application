package za.ac.cput.domain;

import java.util.List;
import java.util.Objects;

public class Job {
    private String jobTitle;
    private List<Position> positions;

    public Job() {
    }

    private Job(Builder builder) {
        this.jobTitle = builder.jobTitle;
        this.positions = builder.positions;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public List<Position> getPositions() {
        return positions;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(getJobTitle(), job.getJobTitle()) &&
                Objects.equals(getPositions(), job.getPositions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJobTitle(),
                getPositions());
    }

    @Override
    public String toString() {
        return "Job{" + "jobTitle='" + jobTitle + '\'' + ", positions=" + positions + '}';
    }

    public static class Builder {
        private String jobTitle;
        private List<Position> positions;

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setPositions(List<Position> positions) {
            this.positions = positions;
            return this;
        }

        public Builder copy(Job job) {
            this.jobTitle = job.jobTitle;
            this.positions = job.positions;
            return this;
        }

        public Job build() {
            return new Job(this);
        }
    }
}