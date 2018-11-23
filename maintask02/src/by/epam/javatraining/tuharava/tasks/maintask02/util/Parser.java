
package by.epam.javatraining.tuharava.tasks.maintask02.util;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */

public class Parser {
    
    private String path;

    public Parser(String path) {
        this.path=path;
    }
    
    private Reader reader1 = new Reader(path);
    private StringBuilder temp = reader1.getData();
    private String data = temp.toString();
    
    public String[][] parsData () {
        String [][] tours = new String [100][];
        String[] strings1 = data.split("\n");
        tours = new String[strings1.length][];
        for (int i = 0; i < strings1.length; i++) {
            String[] strings2 = strings1[i].split(",");
            for (int j = 0; j<strings2.length; j++) {
                tours[i][j] = strings2[j];
            }
        } 
        return tours;
    }

}