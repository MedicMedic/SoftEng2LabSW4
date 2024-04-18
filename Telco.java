
public class Telco implements TelcoSubscription
{
    private String telcoName;
    private Double promoPrice;
    private Integer dataAllowance;
    private Boolean unliCallText;

    public Telco(Integer dataAllowance, Double promoPrice, String telcoName, Boolean unliCallText)
    {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, Double promoPrice)
    {
        this.promoPrice = promoPrice;
        return promo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer offer, Boolean unliCallText)
    {
        this.unliCallText = unliCallText;
        return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Integer getDataAllowance() {
        return dataAllowance;
    }

    public void setDataAllowance(Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public Boolean getUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(Boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
}
