package oop.abstraction;

class CertificateServiceImpl extends CertificateService {
    Attender attender;

    public CertificateServiceImpl(Attender attender) {
        this.attender = attender;
    }

    @Override
    Certificate getMyCertificate(ApplicationForm form) {
        return attender.processCertificate(form);
    }
}
