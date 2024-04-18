import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo
{
    private static Map<String, Integer> usageMap = new HashMap<>();
    
    static{
        usageMap.put("Smart", 15);
        usageMap.put("Globe", 10);
        usageMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) 
    {
        return usageMap.get(telcoName) + " GB for ₱" + money + ".";
    }
}
