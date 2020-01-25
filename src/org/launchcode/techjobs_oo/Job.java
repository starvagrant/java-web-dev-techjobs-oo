package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = this.nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        if(name == null && employer == null
                && location == null && positionType == null
                && positionType == null) return "OOPS! This job does not seem to exist.";
        String nullString = "Data not available";
        String nameString = name != null ? getName() : nullString;
        String employerString = employer != null ? getEmployer().getValue() : nullString;
        String locationString = location != null ? getLocation().getValue() : nullString;
        String positionString = positionType != null ? getPositionType().getValue() : nullString;
        String competencyString = coreCompetency != null ? getCoreCompetency().getValue() : nullString;
        String jobString = "\n" +
                "ID: " + getId() + "\n" +
                "Name: " + nameString + "\n" +
                "Employer: " + employerString + "\n" +
                "Location: " + locationString + "\n" +
                "Position Type: " + positionString + "\n" +
                "Core Competency: " + competencyString + "\n";
        return jobString;
    }
}
