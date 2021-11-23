public class Customer {

    private int customerNumber;
    private String email;

    public Customer(){
    }

    public Customer(int customerNumber, String email) {
        this.customerNumber = customerNumber;
        this.email = email;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // override method to just return the customer email when wanting to print a customer object in main
    @Override
    public String toString() {
        return this.email;
    }
}
