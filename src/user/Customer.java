package user;
import model.CreditCard;
import service.ICustomer;
import model.VirtualWallet;
import java.util.List;


public class Customer implements ICustomer {
    public String nickname;
    private String email;
    public String password;
    public boolean isAuthorised;
    public VirtualWallet wallet=null;

    public Customer(String nickname, String password){
        this.nickname=nickname;
        this.password=password;
    }

    @Override
    public VirtualWallet createWallet(double bonusPoints, List<CreditCard> cards) {
        this.wallet=new VirtualWallet(bonusPoints, cards);
        return wallet;
    }

    @Override
    public void removeWallet(VirtualWallet wallet)
    {
        this.wallet=null;
    }
}