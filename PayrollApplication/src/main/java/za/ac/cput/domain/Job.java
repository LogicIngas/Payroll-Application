package za.ac.cput.domain;

public class Job {
    private String jobTitle;

    public Job() {
    }

    private Job(Builder builder) {
        this.jobTitle = builder.jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static class Builder {
        private String jobTitle;

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Job build() {
            return new Job(this);
        }
    }
}