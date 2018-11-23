
package by.epam.javatraining.tuharava.tasks.maintask02.controller;

import by.epam.javatraining.tuharava.tasks.maintask02.util.Reader;
import by.epam.javatraining.tuharava.tasks.maintask02.util.TourCreator;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class Main {
    public static void main(String[] args) {
        
        TourCreator tour = new TourCreator();
        tour.createBeachResortTour();
        tour.getTours();

    }
                
}
