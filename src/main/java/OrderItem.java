
public class OrderItem {

    private final Util util = new Util();
    private String name;
    private int quantity;
    private double unitPrice;
    private Type type;
    private double totalTax;
    private double total;
    private double totalIncludingTaxes;


    public OrderItem(String name,int quantity, double unitPrice, Type type){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.type = type;
        calculateTaxes();
    }

    private void calculateTaxes() {

        Tax tax = TaxProvider.taxMap.get(type);
        double totalPercentageTax = ((quantity * unitPrice * tax.getPercentage())/100);
        this.totalTax = Util.getRoundValue(totalPercentageTax, 10);
        if (tax.getFixed() != 0 ) {
            this.totalTax += tax.getFixed();
        }
        this.total = Util.getRoundValue(quantity * unitPrice, 100);
        this.totalIncludingTaxes = Util.getRoundValue((this.total + this.totalTax), 100);
    }



    public double getTotalTax(){
        return this.totalTax;
    }

    public double getTotal(){
        return this.total;
    }

    public double getTotalIncludingTaxes(){
        return this.totalIncludingTaxes;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
