// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Ticket t1 = new Ticket("abc 1234");
        Ticket t2 = new Ticket("xyz 4321");
        Ticket t3 = new Ticket("fks 3233");
        Ticket t4 = new Ticket("kdf 3321");

        System.out.println(t1.getNumber());
        System.out.println(t2.getNumber());
        System.out.println(t3.getNumber());
        System.out.println(t4.getNumber());
    }
}