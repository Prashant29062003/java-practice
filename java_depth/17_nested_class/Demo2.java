public class Demo2 {
    public static void main(String[] args) {

    }
}

class BankAccout{

    private static class IntersetCalculator {
        static double calculateYearly (double principle, double rate, int years){
            return principle * rate * years;
        }   

        static double calculateMonthly (double principle, double rate, int years){
            return IntersetCalculator.calculateYearly(principle, rate, years)/12;
        }
    }
    public double computeInterst(double principle, double rate, int years){
        return IntersetCalculator.calculateYearly(principle, rate, years);
    }
}

// Use cases of static nested class
/*
 1. As helper class for any outer class.
 2. Builder design pattern
 3. if you want to have static methods inside a nested class
 4. Request/Response DTO

*/