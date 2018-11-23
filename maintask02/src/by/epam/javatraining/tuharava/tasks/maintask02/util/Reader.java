
package by.epam.javatraining.tuharava.tasks.maintask02.util;

import by.epam.javatraining.tuharava.tasks.maintask02.view.Output;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Anastasiya Tuharava
 * @version 1.0 development date: 22/11/2018
 */
public class Reader {
    
    private StringBuilder data = new StringBuilder(" ");
    
    public Reader (String path) {
        data = new StringBuilder(" ");
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            while(br.read()!=-1) {
                data.append(br.readLine());
            }
        } catch (IOException e) {
            Output.log("IO Exception" + e);
        }
    }

    public StringBuilder getData() {
        return data;
    }
}
