public class Email implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("відправлення по інтернету через E-Mail.");
    }
}
