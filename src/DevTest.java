//import java.util.Scanner;

//public class DevTest
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        String name = SafeInput.getNonZeroLenString(in, "Enter your first name");
//        System.out.println("You entered: " + name);
//    }
//}

//import java.util.Scanner;

//public class DevTest
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        int favoriteNumber = SafeInput.getInt(in, "Please enter your favorite integer");
//        System.out.println("You entered the integer: " + favoriteNumber);
//    }
//}

//import java.util.Scanner;

//public class DevTest
//{
// public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        double price = SafeInput.getDouble(in, "Please enter a double value");
//        System.out.println("You entered the double: " + price);
//    }
//}

//import java.util.Scanner;

//public class DevTest
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        int age = SafeInput.getRangedInt(in, "Enter your age", 1, 10);
//        System.out.println("You entered the valid age: " + age);
//    }
//}

//import java.util.Scanner;

//public class DevTest
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        double rating = SafeInput.getRangedDouble(in, "Enter a rating", 0.5, 5.5);
//        System.out.println("You entered the valid rating: " + rating);
//    }
//}

//import java.util.Scanner;

//public class DevTest
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        boolean keepGoing = SafeInput.getYNConfirm(in, "Do you want to continue");
//        System.out.println("You chose: " + (keepGoing ? "Yes (true)" : "No (false)"));
//    }
//}

import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String mNum = SafeInput.getRegExString(in, "Enter your M-number (e.g., M12345)", "^(M|m)\\d{5}$");
        System.out.println("You entered the valid M-number: " + mNum);
    }
}