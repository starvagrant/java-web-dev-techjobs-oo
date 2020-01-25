package org.launchcode.techjobs_oo;

public class JobField {
    protected int id;
    protected String value;

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
