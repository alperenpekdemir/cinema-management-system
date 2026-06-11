package model;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private java.sql.Date dateOfBirth;

    public Customer() {}

    public Customer(int customerId, String firstName, String lastName,
                    String email, String phone, java.sql.Date dateOfBirth) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public int getCustomerId()           { return customerId; }
    public String getFirstName()         { return firstName; }
    public String getLastName()          { return lastName; }
    public String getEmail()             { return email; }
    public String getPhone()             { return phone; }
    public java.sql.Date getDateOfBirth(){ return dateOfBirth; }

    public void setCustomerId(int id)            { this.customerId = id; }
    public void setFirstName(String f)           { this.firstName = f; }
    public void setLastName(String l)            { this.lastName = l; }
    public void setEmail(String e)               { this.email = e; }
    public void setPhone(String ph)              { this.phone = ph; }
    public void setDateOfBirth(java.sql.Date d)  { this.dateOfBirth = d; }

    @Override
    public String toString() { return customerId + " - " + firstName + " " + lastName; }
}
