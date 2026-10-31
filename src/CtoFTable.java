public class CtoFTable
{
    public static void main(String[] args)
    {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("-------------------------");
        for (int celsius = -20; celsius <= 100; celsius++)
        {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%d\t\t%.2f%n", celsius, fahrenheit);
        }
    }
    public static double celsiusToFahrenheit(double celsius)
    {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
