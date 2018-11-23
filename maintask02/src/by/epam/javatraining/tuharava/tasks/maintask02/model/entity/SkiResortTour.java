
package by.epam.javatraining.tuharava.tasks.maintask02.model.entity;

import java.util.Objects;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class SkiResortTour extends Tour {
    
    private String resortName;
    private String apartmentType;
    private String typeOfFood;

    public SkiResortTour(String resortName, String apartmentType, String typeOfFood, String tourName, String description, String transportType, int duration, double price) {
        super(tourName, description, transportType, duration, price);
        this.resortName = resortName;
        this.apartmentType = apartmentType;
        this.typeOfFood = typeOfFood;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.resortName);
        hash = 37 * hash + Objects.hashCode(this.apartmentType);
        hash = 37 * hash + Objects.hashCode(this.typeOfFood);
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
        final SkiResortTour other = (SkiResortTour) obj;
        if (!Objects.equals(this.resortName, other.resortName)) {
            return false;
        }
        if (!Objects.equals(this.apartmentType, other.apartmentType)) {
            return false;
        }
        if (!Objects.equals(this.typeOfFood, other.typeOfFood)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SkiResortTour{" + resortName + apartmentType + typeOfFood + "}";
    }

       
}
