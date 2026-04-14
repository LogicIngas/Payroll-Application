package za.ac.cput.entity.employeedetails;

public class Job {
    private String jobTitle;
    private  String description;

    private Job() {
    }

    public Job(Builder builder) {
        this.jobTitle = builder.jobTitle;
        this.description = builder.description;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String jobTitle;
        private  String description;

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Job job){
            this.jobTitle = job.jobTitle;
            this.description = job.description;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }
}
