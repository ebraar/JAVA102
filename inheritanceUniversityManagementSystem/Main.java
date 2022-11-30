public class Main {
    public static void main(String[] args) {
        Academician a1 = new Academician("Ebrar Betül Akgül", "123456789","ebolak@gmail.com", "ceng", "prof");
        a1.login();
        a1.attendClass();
        Officer o1 = new Officer("Havva Nur Ceylan", "123456789", "ceylancik@gmail.com", "kitchen", "chef");
        o1.login();
        o1.work();
        o1.diningHall();
        Lecturer l1 = new Lecturer("Utku Çolak", "05355353535", "utkuca@gmail.com", "Math", "Dr.", 2);
        System.out.println(l1.getNameSurname() + " kapı numarası : " + l1.getDoorNumber());
        Assistant as1 = new Assistant("İsmail Babaoğlu", "05323323232", "isot@gmail.com", "ENG", "Assistant", "08.00 - 17.00");
        System.out.println(as1.getNameSurname() + " çalışma saatleri : " + as1.getOfficeClock());
        Computing c1 = new Computing("Esra Şule Gezici", "05365363636", "esrasule@gmail.com", "computing", "officer", "network");
        System.out.println(c1.getNameSurname() + " görevi : " + c1.getTask());
        SecurityOfficer so1 = new SecurityOfficer("Ömer Asaf Gezici", "05343343434", "omerasaf@gmail.com", "security", "officer", "security");
        so1.bout();
        LabAssistant la1 = new LabAssistant("Talha Gezici", "05343356236", "talha@gmail.com", "FZK", "Assistant", "08.00 - 17.00");
        la1.labEnter();

    }
}
