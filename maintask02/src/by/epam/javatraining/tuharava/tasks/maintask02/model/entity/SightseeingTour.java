
package by.epam.javatraining.tuharava.tasks.maintask02.model.entity;

import java.util.Objects;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class SightseeingTour extends Tour{
    
    private String museums;
    private String galleries;

    public SightseeingTour(String museums, String galleries, String tourName, String description, String transportType, int duration, double price) {
        super(tourName, description, transportType, duration, price);
        this.museums = museums;
        this.galleries = galleries;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.museums);
        hash = 71 * hash + Objects.hashCode(this.galleries);
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
        final SightseeingTour other = (SightseeingTour) obj;
        if (!Objects.equals(this.museums, other.museums)) {
            return false;
        }
        if (!Objects.equals(this.galleries, other.galleries)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SightseeingTour{" + "museums=" + museums + ", galleries=" + galleries + '}';
    }
    
}
