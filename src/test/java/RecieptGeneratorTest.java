import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class RecieptGeneratorTest {

    @Test
    public void test1(){
        OrderItem item1 = new OrderItem("book", 1, 29.49,Type.GENERAL);
        OrderItem item2 = new OrderItem("music CD", 1, 15.99, Type.CD);
        OrderItem item3 = new OrderItem("chocolate snack ", 1, 0.75, Type.GENERAL);
        List<OrderItem> input = new ArrayList();
        input.add(item1);
        input.add(item2);
        input.add(item3);
        RecieptGenerator recieptGenerator = new RecieptGenerator();
        assertEquals("Total not equal", 55.58 ,recieptGenerator.generateReciept(input),0);
    }

    @Test
    public void test2(){
        System.out.println();
        OrderItem item1 = new OrderItem("bottle of wine", 1, 20.99, Type.GENERAL);
        OrderItem item2 = new OrderItem("box of headache pills", 1, 4.15, Type.MEDICAL);
        OrderItem item3 = new OrderItem("box of pins", 1, 11.25, Type.GENERAL);
        OrderItem item4 = new OrderItem("music CD", 1, 14.99, Type.CD);

        List<OrderItem> input = new ArrayList();
        input.add(item1);
        input.add(item2);
        input.add(item3);
        input.add(item4);
        RecieptGenerator recieptGenerator = new RecieptGenerator();
        assertEquals("Total not equal", 60.93 ,recieptGenerator.generateReciept(input),0);
    }

}
