import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currentPrice = 0;
        boolean notDone = false;


            double priceOfItem = InputHelper.getRangedDouble(scan, "What is the price of your item?",0.50,10);
            String moreItems = InputHelper.getYNConfirm(scan,"Do you have more items? If so [Y] for Yes and [N] for no: ");
        System.out.println(moreItems);

    }
}
