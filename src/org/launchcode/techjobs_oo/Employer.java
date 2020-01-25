package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField {
    private static int nextId = 1;

    public Employer() {
        this.id = nextId;
        nextId++;
    }

    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom equals, and hashCode methods:

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
