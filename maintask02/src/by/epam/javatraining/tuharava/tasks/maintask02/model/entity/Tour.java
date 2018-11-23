
package by.epam.javatraining.tuharava.tasks.maintask02.model.entity;

import java.util.Objects;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class Tour {
    
    private String tourName;
    private String description;
    private String transportType;
    private int duration;
    private double price;

    public Tour(String tourName, String description, String transportType, int duration, double price) {
        this.tourName = tourName;
        this.description = description;
        this.transportType = transportType;
        this.duration = duration;
        this.price = price;
    }
    
    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
    
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.tourName);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.transportType);
        hash = 59 * hash + this.duration;
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
        final Tour other = (Tour) obj;
        if (this.duration != other.duration) {
            return false;
        }
        if (!Objects.equals(this.tourName, other.tourName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.transportType, other.transportType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tour{" + "tourName=" + tourName 
                    + ", description=" + description 
                    + ", transportType=" + transportType 
                    + ", duration=" + duration + '}';
    }
   
}
