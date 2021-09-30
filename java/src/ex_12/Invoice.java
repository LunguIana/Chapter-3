package ex_12;
public class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;
    //constructor l-am folosit pentru a initializa un obiect
    public Invoice(String partNumber, String partDescription, int quantity, double unitPrice){

        setPartNumber(partNumber);
        setDescription(partDescription);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }
    //metoda set se foloseste pentru a seta valoarea
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity){
        this.quantity = Math.max(quantity, 0);
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = Math.max(unitPrice, 0.0);
    }
    //iar aici metoda get e folosita pentru a returna valoarea variabilelor
    public String getPartNumber(){
        return partNumber;
    }
    public String getDescription(){
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public double getInvoiceAmount(){
        return getQuantity() * getUnitPrice();
    }
}
