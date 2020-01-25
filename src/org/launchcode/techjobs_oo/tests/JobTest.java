package org.launchcode.techjobs_oo.tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.swing.text.Position;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.getId() == job2.getId());
        assertEquals(-1, job1.getId() - job2.getId());
    }

    @Test
    public void testJobConstructorSetAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testJobToStringBounds() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedStringBounds = "\n\n";
        int stringLength = job1.toString().length();
        String actualStringBounds = job1.toString().substring(0,1) + job1.toString().substring(stringLength -1, stringLength);
        assertEquals(expectedStringBounds, actualStringBounds);
    }

    @Test
    public void testJobToStringAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedString = "\n" + "ID: " + job1.getId() + "\n" +
            "Name: " + job1.getName() + "\n" +
            "Employer: " + job1.getEmployer().getValue() + "\n" +
            "Location: " + job1.getLocation().getValue() + "\n" +
            "Position Type: " + job1.getPositionType().getValue() + "\n" +
            "Core Competency" + job1.getCoreCompetency().getValue() + "\n";
        assertEquals(expectedString, job1.toString());
    }

    @Test
    public void testJobToStringWithNullFields() {
        Job job1 = new Job("Product tester", null, new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedString = "\n" + "ID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + job1.getLocation().getValue() + "\n" +
                "Position Type: " + job1.getPositionType().getValue() + "\n" +
                "Core Competency" + job1.getCoreCompetency().getValue() + "\n";
        assertEquals(expectedString, job1.toString());
    }

    @Test
    public void testNonExistingJob() {
        Job job = new Job();
        assertEquals("OOPS! This job does not seem to exist.", job.toString());
    }
}
