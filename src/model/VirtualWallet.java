package model;

import model.CreditCard;
import model.Coupon;

import java.util.Date;
import java.util.List;


public class VirtualWallet {
    private double bonusPoints;
    public List<CreditCard> cards;

    public VirtualWallet(double bonusPoints, List<CreditCard> cards){
        this.bonusPoints=bonusPoints;
        this.cards=cards;
    }


    public void setBonusPoints(double bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }

//        List<CreditCard> cards = new ArrayList<CreditCard>();

    public CreditCard registerCreditCard(String name, int id, Date date, int cvv, int password) {
        CreditCard card=new CreditCard(name, id, date, cvv, password);
        cards.add(card);
        return card;
    }

    public void removeCreditCard(CreditCard card)
    {
        cards.remove(card);
    }

    public double convertCouponIntoPoints(int id)
    {
        return bonusPoints;
    }

    public double payFor(int id)
    {
        return bonusPoints;
    }
}