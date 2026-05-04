package abstraction;

public class Certificate {

    String id;
    String issuedDate;
    String issuedBy;
    String issuedTo;

    public Certificate(String id, String issuedDate, String issuedBy, String issuedTo) {
        this.id = id;
        this.issuedDate = issuedDate;
        this.issuedBy = issuedBy;
        this.issuedTo = issuedTo;
    }

    public Certificate() {

    }
}

