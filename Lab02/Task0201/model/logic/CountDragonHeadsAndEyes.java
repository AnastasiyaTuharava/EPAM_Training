
package by.epam.java0.tuharava.model.logic;

public class CountDragonHeadsAndEyes {
    
    private static int dragonHeads, dragonEyes;
    private static final int HEADS_IN_YEAR_BEFORE_200 = 3;
    private static final int HEADS_IN_YEAR_AFTER_200_AND_BEF_300 = 2;
    private static final int HEADS_IN_YEAR_AFTER_300 = 1;
    private static final int YEARS_BETWEEN_200_AND_300 = 300-200;
    private static final int YEARS_BEFORE_200 = 199;
    private static final int HEADS_AT_BIRTH = 3;
    private static final int EYES_ON_EACH_HEAD = 2;
    
    public static int getHeads (int dragonAge) {
        if (dragonAge >= 300) {
            dragonHeads = (dragonAge - YEARS_BEFORE_200 - YEARS_BETWEEN_200_AND_300) * HEADS_IN_YEAR_AFTER_300 + 
                            YEARS_BEFORE_200 * HEADS_IN_YEAR_BEFORE_200 + YEARS_BETWEEN_200_AND_300 * HEADS_IN_YEAR_AFTER_200_AND_BEF_300 + HEADS_AT_BIRTH; 
        }
        else if (dragonAge >= 200) {
            dragonHeads = (dragonAge - YEARS_BEFORE_200) * HEADS_IN_YEAR_AFTER_200_AND_BEF_300 + YEARS_BEFORE_200 * HEADS_IN_YEAR_BEFORE_200 + HEADS_AT_BIRTH; 
        }
        else if (dragonAge >= 0) {
            dragonHeads = dragonAge * HEADS_IN_YEAR_BEFORE_200 + HEADS_AT_BIRTH;
        }
        else if (dragonAge < 0) {
            dragonHeads = 0;
        }
        return dragonHeads;
    }  
    
    public static int getEyes (int dragonHeads) {
        
        return dragonHeads * EYES_ON_EACH_HEAD;
        
    }
}
