package lesson1;

public class Test {
    public static void main(String[] args) {
        Ticket.autoGenerateCode();
        System.out.println(Ticket.code);

        Ticket.autoGenerateCode();
        System.out.println(Ticket.code);

        Ticket.autoGenerateCode();
        System.out.println(Ticket.code);
    }
}
