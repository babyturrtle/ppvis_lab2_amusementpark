package model;

public class Price {
    private double currency;
    private double bonusPoints;
    private boolean isCurrencyAllowed;
    private boolean areBonusPointsAllowed;

    public Price(double currency, double bonusPoints, boolean isCurrencyAllowed, boolean areBonusPointsAllowed){
        this.currency=currency;
        this.bonusPoints=bonusPoints;
        this.isCurrencyAllowed=isCurrencyAllowed;
        this.areBonusPointsAllowed=areBonusPointsAllowed;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public void setBonusPoints(double bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public void setIsCurrencyAllowed(boolean isCurrencyAllowed) {
        this.isCurrencyAllowed = isCurrencyAllowed;
    }

    public void setAreBonusPointsAllowed(boolean areBonusPointsAllowed) {
        this.areBonusPointsAllowed = areBonusPointsAllowed;
    }

    public double getCurrency() {
        return currency;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }

    public boolean isCurrencyAllowed() {
        return isCurrencyAllowed;
    }

    public boolean areBonusPointsAllowed() {
        return areBonusPointsAllowed;
    }
}