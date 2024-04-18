import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer
{
    private static Map<String, String> offerMap = new HashMap<>();
    
    static{
        offerMap.put("Smart", "Does not offer any free calls or texts, and you will be charged per use.");
        offerMap.put("Globe", "Comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        offerMap.put("Ditto", "Includes unlimited calls and texts to all networks within the country.");
    }
    
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText)
    {
        return offerMap.get(telcoName);
    }
}
