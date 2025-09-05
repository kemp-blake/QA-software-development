package lab5static1;

public class RegistrationPlateFactory {
    private static String[] registrationPlates = {
        "LAOS XYZ", 
        "NG58 HYP", 
        "MA13 TUV", 
        "CF67 PQR", 
        "YS09 NML", 
        "WD21 FGH", 
        "KR16 ABC", 
    };
    static int i = 0;
    public static RegistrationPlate getNextRegistrationPlate() {
        RegistrationPlate regPlate;
        try {
            regPlate = new RegistrationPlate(registrationPlates[i++]);
            return regPlate;
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfRegPlatesException("The factory has run out of Registration plates.");
        }
        

    }
    
}
