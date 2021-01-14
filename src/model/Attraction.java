package model;

import model.Ticket;
import model.Coupon;

public class Attraction {
    public int id;
    public String info;
    public Coupon coupon;
    public Ticket ticket;

/*    public Attraction(int id, String info) {
        this.id=id;
        this.info=info;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}