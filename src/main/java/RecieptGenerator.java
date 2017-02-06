import java.util.List;


public class RecieptGenerator {

    public double generateReciept(List<OrderItem> items) {
        double totalOrderTax = 0.0;
        double totalOrder = 0.0;
        for(OrderItem item:items){
            double itemTotalTax = item.getTotalTax();
            double itemTotalIncludingTaxes = item.getTotalIncludingTaxes();
            System.out.print(item.getQuantity()+" ");
            System.out.print(" "+item.getName());
            System.out.print(": "+itemTotalIncludingTaxes);
            System.out.println();
            totalOrderTax += itemTotalTax;
            totalOrder += itemTotalIncludingTaxes;
        }
        totalOrderTax = Util.getRoundValue(totalOrderTax,100);
        System.out.println("Sales Taxes: "+totalOrderTax);
        totalOrder = Util.getRoundValue(totalOrder,100);
        System.out.println("Total: "+totalOrder);
        return totalOrder;
    }
}
