package oop.abstraction;

public class Certificate {

    public String applicantName;
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

    public void display() {
        System.out.println("--- Certificate ---");
        System.out.println("Name: " + applicantName);
        System.out.println("Issued By: " + issuedBy);
        System.out.println("Date: " + issuedDate);
    }
}

