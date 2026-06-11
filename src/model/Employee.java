package model;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private String username;
    private String password;
    private String role; // ADMIN, CASHIER, MANAGER

    public Employee() {}

    public Employee(int employeeId, String firstName, String lastName, String position,
                    String email, String phone, double salary, String username,
                    String password, String role) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getEmployeeId()      { return employeeId; }
    public String getFirstName()    { return firstName; }
    public String getLastName()     { return lastName; }
    public String getPosition()     { return position; }
    public String getEmail()        { return email; }
    public String getPhone()        { return phone; }
    public double getSalary()       { return salary; }
    public String getUsername()     { return username; }
    public String getPassword()     { return password; }
    public String getRole()         { return role; }

    public void setEmployeeId(int id)           { this.employeeId = id; }
    public void setFirstName(String f)          { this.firstName = f; }
    public void setLastName(String l)           { this.lastName = l; }
    public void setPosition(String p)           { this.position = p; }
    public void setEmail(String e)              { this.email = e; }
    public void setPhone(String ph)             { this.phone = ph; }
    public void setSalary(double s)             { this.salary = s; }
    public void setUsername(String u)           { this.username = u; }
    public void setPassword(String pw)          { this.password = pw; }
    public void setRole(String r)               { this.role = r; }

    @Override
    public String toString() { return employeeId + " - " + firstName + " " + lastName; }
}
