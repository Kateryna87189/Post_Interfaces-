import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Предположим, ваша программа предоставляет пользователю возможность отослать письмо
одним из 3 возможных способов: DHL, E-Mail, Owl. Вам необходимо реализовать
один общий метод отправки почты, который в качестве параметра получает способ отправки почты.
Реализация каждого из способов, должна быть выполнена отдельным методом
(каждый метод может просто выводить на экран соответствующее сообщения, например, в случае DHL,
что то типа: «кладу письмо в конверт, клею марку, иду на  почту»).
Выбор способа отправки определяется пользователем, например через Scanner
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sender mailDeliveryServiceExample = new Sender();

        //створимо список з способом доставки
        List<MailDeliveryService> services = new ArrayList<>();
        services.add(new DHL());
        services.add(new Email());
        services.add(new Owl());

        //виведем варіанти на екран
        System.out.println("Виберіть спосіб відпрвки пошти: ");
        System.out.println("1. DHL");
        System.out.println("2. E-Mail");
        System.out.println("3. Owl");

        int choice = scanner.nextInt();

        //перевірка вибору користувача в межах індекса
        if (choice>=1 && choice<= services.size()){
            MailDeliveryService service = services.get(choice-1);
            mailDeliveryServiceExample.send(service);

        }else {
            System.out.println("Not found");
        }




    }
}