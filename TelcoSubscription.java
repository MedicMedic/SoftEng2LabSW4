
public interface TelcoSubscription 
{
    public String accept(UsagePromo promo, Double price); 
    public String accept(UnliCallsTextOffer offer, Boolean unliCallText);
    public String getTelcoName();
    public Boolean getUnliCallText();
    public Double getPromoPrice();
}