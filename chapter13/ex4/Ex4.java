package chapter13.ex4;

import java.util.Formatter;

class Receipt {
    public double total = 0;
    public static final int ITEM_WIDTH = 15;
    public static final int QTY_WIDTH = 5;
    public static final int PRICE_WIDTH = 10;

    public static final String TITLE_FORMAT =
            "%-" + ITEM_WIDTH + "s" + " %" + QTY_WIDTH + "s" + " %" +
                    PRICE_WIDTH + "s \n";
    public static final String ITEMS_FORMAT =
            "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s" + " %" +
                    QTY_WIDTH + "d" + " %" + PRICE_WIDTH + ".2f \n";
    public static final String TOTAL_FORMAT =
            "%-" + ITEM_WIDTH + "s" + " %" + QTY_WIDTH + "s" + " %" +
                    PRICE_WIDTH + ".2f \n";

    private Formatter formatter = new Formatter(System.out);

    public void printTitle() {
        formatter.format(TITLE_FORMAT, "Item", "Qty", "Price");
        formatter.format(TITLE_FORMAT, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        formatter.format(ITEMS_FORMAT, name, qty, price);
        total += price;
    }

    public void printTotal() {
        formatter.format(TOTAL_FORMAT, "Tax", "", total * 0.06);
        formatter.format(TITLE_FORMAT, "", "", "-----");
        formatter.format(TOTAL_FORMAT, "Total", "",
                total * 1.06);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
