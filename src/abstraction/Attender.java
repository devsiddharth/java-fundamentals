package abstraction;

class Attender {
    int fee;
    Mro mro;

    public Attender(int fee, Mro mro) {
        this.fee = fee;
        this.mro = mro;
    }

    public Certificate processCertificate(ApplicationForm form) {
        System.out.println("Attender: Verifying fee and passing to MRO...");
        if (fee > 0) {
            return mro.signCertificate(form);
        }
        return null;
    }
}