package phonebook;

public class Main {
    public static void main(String[] args) {
        User alena = new User("Alena");
        User oleg = new User("Oleg");
        User aidar = new User("Aidar");

        PhoneBook pb = new PhoneBook();
        pb.addPhone(alena.getName(), 777);
        pb.addPhone(oleg.getName(), 2222);
        pb.addPhone(oleg.getName(), 87987);
        pb.addPhone(oleg.getName(), 54546);
        pb.addPhone(oleg.getName(), 548);
        pb.addPhone(aidar.getName(), 111);
        pb.addPhone(aidar.getName(), 222);
        pb.addPhone(aidar.getName(), 800);

        pb.printAll();
    }
}
