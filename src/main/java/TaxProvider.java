import java.util.HashMap;
import java.util.Map;

/**
 * Created by zeeshan on 06/02/2017.
 */
public class TaxProvider {
    public static Map<Type,Tax> taxMap = new HashMap();
    static {
        taxMap.put(Type.GENERAL,new Tax(17.5,0));
        taxMap.put(Type.MEDICAL,new Tax(0,0));
        taxMap.put(Type.CD,new Tax(17.5,1.25));
    }

}
