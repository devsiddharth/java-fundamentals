package abstraction;

public class Mro {
    int money;
    ApplicationForm form;

    public Mro(int money, ApplicationForm form) {
        this.money = money;
        this.form = form;
    }
    
     Certificate processCertificate(ApplicationForm form){
     Certificate certificate = null;
     if(money>500){
        return new Certificate();}
         return certificate;
     }
}


