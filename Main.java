import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean loopIgnition = true;
        ArrayList<Item> itemList = new ArrayList<>();

        while (loopIgnition)
        {
            switch (userInput())
            {
                case 1:
                    case1(itemList);
                    break;
                case 2:
                    case2(itemList);
                    break;
                case 3:
                    case3(itemList);
                    break;
                case 4:
                    case4(itemList);
                    break;
                case 5:
                    loopIgnition = false;
                    break;
            }
        }
    }

    public static int userInput()
    {
        int userListOpt;
        Scanner input = new Scanner(System.in);

        System.out.println("""
                    Press 1 to add an item.
                    Press 2 to delete an item.
                    Press 3 to update an item.
                    Press 4 to show all the items.
                    Press 5 to quit the program.""");
        userListOpt = input.nextInt();

        input.nextLine();

        return userListOpt;
    }

    public static void case1(ArrayList<Item> itemList)
    {
        Scanner input = new Scanner(System.in);
        Item I1 = new Item();

        System.out.println("Enter the name:");
        I1.setName(input.nextLine());

        System.out.println("Enter the serial number:");
        I1.setSerialNum(input.nextLine());

        System.out.println("Enter the value in dollars (whole number):");
        I1.setValue(input.nextInt());

        itemList.add(I1);
    }

    public static void case2 (ArrayList<Item> itemList)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the serial number of the item to delete:");
        String serial = input.nextLine();

        for (Item remove : itemList)
        {
            if (remove.getSerialNum().equals(serial))
            {
                itemList.remove(remove);

                break;
            }
        }
    }

    public static void case3 (ArrayList<Item> itemList)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the serial number of the item to change:");
        String serial = input.nextLine();

        for (Item change : itemList)
        {
            if (change.getSerialNum().equals(serial))
            {
                System.out.println("Enter the name:");
                change.setName(input.nextLine());

                System.out.println("Enter the value in dollars (whole number):");
                change.setValue(input.nextInt());
                input.nextLine();

                break;
            }
        }
    }

    public static void case4(ArrayList<Item> itemList)
    {
        for (Item show : itemList)
        {
            System.out.println(show.getName() + "," + show.getSerialNum() + "," + show.getValue());
        }
    }
}