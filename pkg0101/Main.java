
package pkg0101;

public class Main {
    public static void main(String[] args) {
        double dinoMassKg = 15700.05;
        
        double dinoMassGr = MassConversion.ConvertToGrams(dinoMassKg);
        double dinoMassMg = MassConversion.ConvertToMilligrams(dinoMassKg);
        double dinoMassTn = MassConversion.ConvertToTons(dinoMassKg);
                
        System.out.format("Dino mass in grams is %.1f%n", dinoMassGr);
        System.out.format("Dino mass in milligrams is %.1f%n", dinoMassMg);  
        System.out.format("Dino mass in tons is %.6f%n", dinoMassTn);            
    } 
}
