
package by.epam.javatraining.tuharava.tasks.maintask02.model.entity;

import java.util.Objects;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class BeachResortTour extends Tour {
    
    private String resortName;
    private String apartmentType;
    private String typeOfFood;

    public BeachResortTour(String resortName, String apartmentType, String typeOfFood, 
                String tourName, String description, String transportType, int duration, double price) {
        super(tourName, description, transportType, duration, price);
        this.resortName = resortName;
        this.apartmentType = apartmentType;
        this.typeOfFood = typeOfFood;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.resortName);
        hash = 53 * hash + Objects.hashCode(this.apartmentType);
        hash = 53 * hash + Objects.hashCode(this.typeOfFood);
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
        final BeachResortTour other = (BeachResortTour) obj;
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
        return "BeachResortTour{" + "resortName=" + resortName + ", apartmentType=" + apartmentType + ", typeOfFood=" + typeOfFood + '}';
    }
    
    
  
}
