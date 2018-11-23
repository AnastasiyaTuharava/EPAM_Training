
package by.epam.javatraining.tuharava.tasks.maintask02.model.entity;

import java.util.Objects;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class EducationalTour extends Tour {
    
    private String university;
    private String specialty;

    public EducationalTour(String university, String specialty, String tourName, 
                String description, String transportType, int duration, double price) {
        super(tourName, description, transportType, duration, price);
        this.university = university;
        this.specialty = specialty;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.university);
        hash = 59 * hash + Objects.hashCode(this.specialty);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EducationalTour other = (EducationalTour) obj;
        if (!Objects.equals(this.university, other.university)) {
            return false;
        }
        if (!Objects.equals(this.specialty, other.specialty)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EducationalTour{" + "university=" + university + ", specialty=" + specialty + '}';
    }
    
}
