public class Main {
    public static void main(String[] args)
    {
        PositiveNegativeZero.checkNumber(2);
        PositiveNegativeZero.checkNumber(0);
        PositiveNegativeZero.checkNumber(-3);
    }

    public class PositiveNegativeZero
    {
        public static void checkNumber(int Number)
        {
            if (Number > 0) System.out.println("Positive");
            else if (Number < 0) System.out.println("Negative");
            else System.out.println("Zero");
        }
    }
}