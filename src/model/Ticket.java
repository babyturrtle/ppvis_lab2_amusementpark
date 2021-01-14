package model;

import service.IPayable;

public class Ticket implements IPayable {
    public int id;
    public String info;
    public Price price;

    public void setInfo(String info) {
        this.info = info;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public int getId() {
        return id;
    }

    @Override
    public Price setPrice(double currency, double bonusPoints, boolean isCurrencyAllowed, boolean areBonusPointsAllowed)
    {
        this.price= new Price(currency, bonusPoints, isCurrencyAllowed, areBonusPointsAllowed);
        return price;
    }
}