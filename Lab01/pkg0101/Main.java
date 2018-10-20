
package pkg0101;

public class Task0101 {

    public static void main(String[] args) {
        double dinoMassKg = UserInput.getDinoMassKG("Enter Dino Mass (kg), please:");
        
        double dinoMassGr = MassConversion.ConvertToGrams(dinoMassKg);
        double dinoMassMg = MassConversion.ConvertToMilligrams(dinoMassKg);
        double dinoMassTn = MassConversion.ConvertToTons(dinoMassKg);
        
        Output.print("Dino mass in gr: ", dinoMassGr);
        Output.print("Dino mass in mg: ", dinoMassMg);
        Output.print("Dino mass in tn: ", dinoMassTn);
    }
}
