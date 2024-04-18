import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer
{
    private static Map<String, Boolean> usageMap = new HashMap<>();
    
    static{
        usageMap.put("Smart", false);
        usageMap.put("Globe", true);
        usageMap.put("Ditto", true);
    }
    
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText)
    {
        String offersUnli;

        if (unliCallText)
        {
            offersUnli = "offers Unli Calls and Text";
        }
        else
        {
            offersUnli = "does not offer Unli Calls and Text";
        }
        return offersUnli;
    }
}
