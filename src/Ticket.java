public class Ticket
{
    private static int serialNumber = 100; //Unique ticket id number
    private int price;

    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }

    //returns the price for this ticket
    public int getPrice()
    {
        return price;
    }
    //set the price
    public void setPrice(int price)
    {
        this.price = price;
    }

    //returns a string with information about the ticket
    public String toString()
    {
        return "Number: "+ serialNumber +"\nPrice: " + getPrice();
    }
    //get the serial number
    public static int getSerialNumber()
    {
        //get the serial number
        return serialNumber;
    }

    //increase the current serial number and return the new value
    private static int getNextSerialNumber()
    {
        serialNumber++;
        return serialNumber;
    }
}
