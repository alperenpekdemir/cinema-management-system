package model;

import java.sql.Timestamp;

public class Ticket {
    private int ticketId;
    private int screeningId;
    private int customerId;
    private int employeeId;
    private String seatNumber;
    private double totalPrice;
    private Timestamp purchaseTime;
    private String status; // ACTIVE, CANCELLED, USED

    public Ticket() {}

    public Ticket(int ticketId, int screeningId, int customerId, int employeeId,
                  String seatNumber, double totalPrice, Timestamp purchaseTime, String status) {
        this.ticketId = ticketId;
        this.screeningId = screeningId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.seatNumber = seatNumber;
        this.totalPrice = totalPrice;
        this.purchaseTime = purchaseTime;
        this.status = status;
    }

    public int getTicketId()            { return ticketId; }
    public int getScreeningId()         { return screeningId; }
    public int getCustomerId()          { return customerId; }
    public int getEmployeeId()          { return employeeId; }
    public String getSeatNumber()       { return seatNumber; }
    public double getTotalPrice()       { return totalPrice; }
    public Timestamp getPurchaseTime()  { return purchaseTime; }
    public String getStatus()           { return status; }

    public void setTicketId(int id)             { this.ticketId = id; }
    public void setScreeningId(int id)          { this.screeningId = id; }
    public void setCustomerId(int id)           { this.customerId = id; }
    public void setEmployeeId(int id)           { this.employeeId = id; }
    public void setSeatNumber(String s)         { this.seatNumber = s; }
    public void setTotalPrice(double p)         { this.totalPrice = p; }
    public void setPurchaseTime(Timestamp t)    { this.purchaseTime = t; }
    public void setStatus(String s)             { this.status = s; }

    @Override
    public String toString() { return ticketId + " - Seat: " + seatNumber; }
}
