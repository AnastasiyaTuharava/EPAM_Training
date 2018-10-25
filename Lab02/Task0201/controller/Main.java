
package by.epam.java0.tuharava.controller;

import by.epam.java0.tuharava.util.Input;
import by.epam.java0.tuharava.model.logic.CountDragonHeadsAndEyes;
import by.epam.java0.tuharava.view.Output;

public class Main {

    public static void main(String[] args) {
        int dragonAge = Input.getAge();
        
        int dragonHeads = CountDragonHeadsAndEyes.getHeads(dragonAge);
        int dragonEyes = CountDragonHeadsAndEyes.getEyes(dragonHeads);
        
        Output.print(dragonHeads, dragonEyes);
    }
    
}
