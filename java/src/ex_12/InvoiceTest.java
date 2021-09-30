package ex_12;
public class InvoiceTest{
    public static void main(String[] args){
        Invoice spanner = new Invoice("123", "A Spanner", 15, 12.5);

        printInvoice(spanner.getPartNumber(), spanner.getDescription(),
                spanner.getQuantity(), spanner.getUnitPrice(),
                spanner.getInvoiceAmount());

        Invoice hammer = new Invoice("124", "A Hammer", -1, -15.0);

        printInvoice(hammer.getPartNumber(), hammer.getDescription(),
                hammer.getQuantity(), hammer.getUnitPrice(),
                hammer.getInvoiceAmount());

    }
    private static void printInvoice(String num, String desc,
                                     int quan, double price, double total){
        System.out.printf("%s: %s - %d * %.2f = %.2f\n", num, desc, quan, price, total);
    }
}