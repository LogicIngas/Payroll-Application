package za.ac.cput.repository;

import za.ac.cput.domain.Job;

import java.util.ArrayList;
import java.util.List;

public class JobRepository implements IJobRepository {

    private static JobRepository repository = null;
    private List<Job> jobList;

    private JobRepository() {
        jobList = new ArrayList<>();
    }

    public static JobRepository getRepository() {
        if (repository == null) repository = new JobRepository();
        return repository;
    }

    @Override
    public Job create(Job job) {
        this.jobList.add(job);
        return job;
    }

    @Override
    public Job read(String jobTitle) {
        return jobList.stream()
                .filter(j -> j.getJobTitle().equals(jobTitle))
                .findAny()
                .orElse(null);
    }

    @Override
    public Job update(Job job) {
        Job oldJob = read(job.getJobTitle());
        if (oldJob != null) {
            this.jobList.remove(oldJob);
            this.jobList.add(job);
            return job;
        }
        return null;
    }

    @Override
    public boolean delete(String jobTitle) {
        Job jobToDelete = read(jobTitle);
        if (jobToDelete == null) {
            return false;
        }
        return this.jobList.remove(jobToDelete);
    }

    @Override
    public List<Job> getAll() {
        return jobList;
    }
}