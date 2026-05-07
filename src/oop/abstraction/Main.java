package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        // 1. Set up the Office (Wiring the dependencies)
        Mro mro = new Mro(1000);
        Attender attender = new Attender(500, mro);
        CertificateService service = new CertificateServiceImpl(attender);

        // 2. Customer Action
        Customer me = new Customer("01", "Siddhartha", "21/12/2001", "Siddharth@gmail.com" );
        ApplicationForm form = new ApplicationForm(me);

        // 3. Process the request
        Certificate myCert = service.getMyCertificate(form);

        // 4. Handle Result and Print
        if (myCert != null) {
            myCert.display();

            // Using Polymorphism to choose a print style
            PrintService printer = new ColorPrintService();
            printer.printCertificate(myCert);
        } else {
            System.out.println("Error: Process could not be completed.");
        }
    }
}