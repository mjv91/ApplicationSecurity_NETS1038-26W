package midterm.mv.model;
/*
 * 
 * 
 * The purpose of this class is to map (or represent) the data
 * that is coming from the client-side form.
 * 
 * We are NOT doing any database logic here.
 * We are simply storing values entered by the user.
 * 
 */
public class Employee {
	// ------------------------------
    // Instance Variables (Attributes)
    // ------------------------------
    // These variables match the fields from the HTML form.

    private String fullName;        // Stores user's full name (max 50 characters)
    private String contactNumber;   // Stores 10 digit contact number
    private String email;           // Stores email address
    private String date;            // Stores selected date
    private double salary;          // Stores salary in decimal format (ex: 999900.60)
    // ------------------------------
    // Default Constructor
    // ------------------------------
    /*
     * This constructor is called when we create a new Employee object.
     */
    public Employee() {
        // Nothing special happening here,
        // just creating an empty Employee object.
    }

    // ------------------------------
    // Getter and Setter Methods
    // ------------------------------
    /*
     * Getters are used to retrieve values.
     * Setters are used to assign values.
     * 
     */
    // Full Name
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    // Contact Number
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    // Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    // Date
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    // Salary
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}