import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse() {
        double legA=15, legB=20, hypotenuse;          
        hypotenuse= Math.sqrt((legA*legA)+(legB*legB));
        // System.out.println("The length of the hypotenuse is: " + hypotenuse);
        return hypotenuse;
    }
}