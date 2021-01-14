package service;

import model.Price;

public interface IPayable {
    public Price setPrice(double currency, double bonusPoints, boolean isCurrencyAllowed, boolean areBonusPointsAllowed);
}