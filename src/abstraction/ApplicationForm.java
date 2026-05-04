package abstraction;

class ApplicationForm {
    String applicantName;
    public ApplicationForm(Customer customer) {
        this.applicantName = customer.name;
    }
}

