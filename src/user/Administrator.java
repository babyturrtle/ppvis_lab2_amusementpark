package user;

import model.*;

public class Administrator
{
    public String nickname;
    public String password;
    public boolean isAuthorised;

    public Administrator(String nickname, String password){
        this.nickname=nickname;
        this.password=password;
    }

    public Attraction addAttraction()
    {
        Attraction attraction = new Attraction();
        return attraction;
    }

    public Ticket attachTicket(Attraction attraction)
    {
        attraction.ticket= new Ticket();
        return attraction.ticket;
    }

    public Coupon attachCoupon(Attraction attraction)
    {
        attraction.coupon= new Coupon();
        return attraction.coupon;    }

    public Merchandise addMerchandise()
    {
        Merchandise merchandise=new Merchandise();
        return merchandise;
    }

    public Attraction editAttraction(Attraction attraction)
    {
        return attraction;
    }

    public Ticket editTicket(Ticket ticket)
    {
        return ticket;
    }

    public Coupon editCoupon(Coupon coupon)
    {
        return coupon;
    }

    public Merchandise editMerchandise(Merchandise merchandise)
    {
        return merchandise;
    }

    public void removeAttraction(Attraction attraction)
    {
    }

    public void removeTicket(Ticket ticket)
    {
    }

    public void removeCoupon(Coupon coupon)
    {
    }

    public void removeMerchandise(Merchandise merchandise)
    {
    }
}