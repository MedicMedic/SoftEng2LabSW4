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

        if (telcoName == "Smart")
        {
            offersUnli = "Does not offer any free calls or texts, and you will be charged per use.";
        }
        else if (telcoName == "Globe")
        {
            offersUnli = "Comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
        }
        else
        {
            offersUnli = "Includes unlimited calls and texts to all networks within the country.";
        }
        return offersUnli;
    }
}
