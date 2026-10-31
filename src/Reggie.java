import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (e.g., 000-00-0000)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNum = SafeInput.getRegExString(in, "Enter your M-number (e.g., M12345)", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice [OoSsVvQq]", "^[OoSsVvQq]$");
        System.out.println("\n--- Summary of Inputs ---");
        System.out.println("SSN: " + ssn);
        System.out.println("M-Number: " + mNum);
        System.out.println("Menu Choice: " + menuChoice);
    }
}
