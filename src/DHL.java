public class DHL implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Поклади лист у конверт, наклей марку, відправ за адресою ");
    }
}
