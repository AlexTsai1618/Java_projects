package emailapp;

public class EmailApp{
    public static void main(String[] args) {
        Email em1 = new Email("Alex","Tsai");
        em1.SetMailboxCapacity(10);
        em1.ChangePassword("asdfasdfasdfasdfasdf");
        em1.SetAlternateEmail("alextsai1618@gmaill.com");
        System.out.println(em1.showInfo());

    }

}