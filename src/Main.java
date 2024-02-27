//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContactInfo John = new ContactInfo("John","johnjohn@johnmail.john");
        John.display();

        BusinessContactInfo Jame = new BusinessContactInfo("Jame","jamejame@jamemail.jame",1234567890);
        Jame.display();
    }
}