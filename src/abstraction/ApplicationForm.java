package abstraction;

public class ApplicationForm {

    String id;
    String applicantName;
    String dateOfApplication;
    Customer customer;

    public ApplicationForm(String id, String applicantName, String dateOfApplication, Customer customer) {
        this.id = id;
        this.applicantName = customer.name;
        this.dateOfApplication = dateOfApplication;
        this.customer = customer;
    }
}


