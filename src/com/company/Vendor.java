package com.company;
/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
    private int price;
    private int stock;
    private int deposit;
    private int change;
    private static double totalSales = 0;

          /**
           * Constructs a Vendor
           * param price the price of a single item in cents (int)
           * param stock number of items to place in stock (int)
           */
    public Vendor (int p, int s)
    {
      price = p;
      stock = s;
      deposit = 0;
      change = 0;
    }

    /**
     * Sets the quantity of items in stock.
     * param qty number of items to place in stock (int)
     */
    public void setStock (int numberOfItemsPlaced)
    {
        stock = numberOfItemsPlaced;
    }

    /**
     * Returns the number of items currently in stock.
     * @return number of items currently in stock (int)
     */
    public int getStock ()
    {
    return stock;
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     * param number of cents to add to the deposit (int)
     */
    public void addMoney (int cents)
    {
        deposit += cents;
    }

    /**
     * Returns the currently deposited amount (in cents).
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit ()
    {
        return deposit;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale ()
    {
        if (stock > 0 && deposit >= price)
        {
            stock--;
            change = deposit - price;
            deposit = 0;
            totalSales += price;
            return true;
        }
        change = deposit;
        deposit = 0;
        return false;
    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     * @return number of cents in the current change (int)
     */
    public int getChange ()
    {
        int a = change;
        change = 0;
        return a;
    }
    public static double getTotalSales ()
    {
        double b = totalSales / 100;
        totalSales = 0;
        return b;
    }
}
