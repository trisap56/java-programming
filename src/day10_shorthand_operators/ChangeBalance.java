package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kanafa = 44.5;
        System.out.println("kanafa = " + kanafa);
        balance = balance - kanafa;
        System.out.println("balance after kanafa = " + balance);
        kanafa = kanafa / 2;
        System.out.println("kanafa = " + kanafa);
        balance = balance - kanafa;
        System.out.println("balance = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);

        double icedTea = 3;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea * 4;
        System.out.println("balance after 4 iced teas= " + balance);

        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);
    }
}