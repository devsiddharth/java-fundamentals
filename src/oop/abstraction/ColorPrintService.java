package oop.abstraction;

class ColorPrintService extends PrintService {
    void printCertificate(Certificate cert) {
        System.out.println("[Color Print]: Printing " + cert.applicantName + "'s certificate in vibrant colors.");
    }
}

class NormalPrintService extends PrintService {
    void printCertificate(Certificate cert) {
        System.out.println("[B&W Print]: Printing " + cert.applicantName + "'s certificate in standard black and white.");
    }
}
