
package by.epam.javatraining.tuharava.tasks.maintask02.util;

import by.epam.javatraining.tuharava.tasks.maintask02.model.entity.BeachResortTour;
import by.epam.javatraining.tuharava.tasks.maintask02.model.entity.Tour;
import by.epam.javatraining.tuharava.tasks.maintask02.view.Output;
import java.util.ArrayList;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class TourCreator {
    
    private ArrayList <BeachResortTour> tours;
    
    private Parser parser1 = new Parser ("C:\\Users\\HP\\Desktop\\EPAM\\Projects\\maintask02\\BeachResortTours.txt");
    String [][] temp1 = parser1.parsData();
    
    public void createBeachResortTour () {
        for (String[] temp2 : temp1) {
            String resortName = temp2[0];
            String apartmentType = temp2[1];
            String typeOfFood = temp2[2];
            String tourName = temp2[3];
            String description = temp2[4];
            String transportType = temp2[5];
            int duration = 0;
            try {
                duration = Integer.parseInt(temp2[6]);
            }catch (NumberFormatException e) {
                Output.log("NumberFormatException" + e);
            }
            double price = 0;
            try {
                price = Double.parseDouble(temp2[7]);
            }catch (NumberFormatException e) {
                Output.log("NumberFormatException" + e);
            }
            tours.add(new BeachResortTour (resortName, apartmentType, 
                        typeOfFood, tourName, description, transportType, duration, price));
        }
    }

    public ArrayList<BeachResortTour> getTours() {
        return tours;
    }
    
    
}
