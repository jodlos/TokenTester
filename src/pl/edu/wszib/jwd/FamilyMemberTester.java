package pl.edu.wszib.jwd;

public class FamilyMemberTester {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name = "Karol";
        dad.age = 34;
        dad.surmame = "Kowalski";
        System.out.println("Nazwisko rodu to: " + dad.surmame);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surmame);

        FamilyMember moth = new FamilyMember();
        moth.name = "Dorota";
        moth.age = 30;
        System.out.println("Nazwisko rodu to: " + moth.surmame);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surmame);



    }
}
