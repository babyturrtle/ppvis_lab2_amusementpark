package service;

import model.VirtualWallet;
import model.CreditCard;

import java.util.List;

public interface ICustomer{
    public VirtualWallet createWallet(double bonusPoints, List<CreditCard> cards);
    public void removeWallet(VirtualWallet wallet);
}