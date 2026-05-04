package abstraction;

import java.time.LocalDate;

class Mro {
    int balance;
    public Mro(int money) { this.balance = money; }

    public Certificate signCertificate(ApplicationForm form) {
        if (balance > 0) {
            Certificate cert = new Certificate();
            cert.applicantName = form.applicantName;
            cert.issuedBy = "TKR (MRO)";
            cert.issuedDate = LocalDate.now().toString();
            return cert;
        }
        return null; // No money, no signature
    }
}

