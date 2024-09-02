import integerAnalysis.*;
import slopeMath.*;
import appleBag.*;
import digitAnalysis.*;

public class Main {
    public double analyzeInts(int max, int n, int[] data) {
        IntegerAnalysis.testIndex = 0;
        IntegerAnalysis.data = data;
        return IntegerAnalysis.analyzeInts(max, n);
    }

    public double slopeMathGetSlope(int a, int b) {
        return SlopeMath.getSlope(a, b);
    }

    public boolean slopeMathIsOnLine(int x, int y, int a, int b, int c) {
        return SlopeMath.isOnLine(x, y, a, b, c);
    }

    public int bagApples(double targetWeight, double allowedVariation,
            double[] appleWeights) {
        AppleBag.testIndex = 0;
        AppleBag.applesWeight = appleWeights;
        return AppleBag.bagApples(targetWeight, allowedVariation);
    }

    public int getCheck(int num){
        return DigitAnalysis.getCheck(num);
    }

    public static int getNumberOfDigits(int num){
        return DigitAnalysis.getNumberOfDigits(num);
    }

    public static int getDigit(int num, int n){
        return DigitAnalysis.getDigit(num, n);
    }

    public static boolean isValid(int numWithCheckDigit){
        return DigitAnalysis.isValid(numWithCheckDigit);
    }
}