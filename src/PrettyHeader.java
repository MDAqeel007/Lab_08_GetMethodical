public class PrettyHeader {
    public static void main(String[] args) {
        printPrettyHeader("Lab 8 Complete - Great Job!");
    }

    public static void printPrettyHeader(String msg)
    {
        for (int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        int totalWidth = 60;
        int remainingSpace = totalWidth - 6 - msg.length();
        int leftSpaces = remainingSpace / 2;
        int rightSpaces = remainingSpace - leftSpaces;
        System.out.print("***");
        for (int i = 0; i < leftSpaces; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpaces; i++)
        {
            System.out.print(" ");
        }
        System.out.println("***");
        for (int i = 0; i < 60; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
