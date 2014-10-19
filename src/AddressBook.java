/**
 * Created by ALEX on 16.10.2014.
 */
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Address[] list = new Address[100];

        System.out.println("Доступные операции:");
        System.out.println("1. Добавить запись в книгу");
        System.out.println("2. Поиск записи по имени человека");
        System.out.println("3. Вывод всех записей на экран");
        System.out.println("4. Удаление записи из книги по индексу");
        System.out.println("5. Изменение записи");
        System.out.println("6. Выход");
        System.out.println("Введите нужный пункт меню: ");
        Scanner sc = new Scanner(System.in);
        int menu;
        menu = sc.nextInt();
        switch (menu) {
            case 1: {
                System.out.println("Введите имя:");
                String name = sc.nextLine();
                System.out.println("Введите телефон:");
                String phone = sc.nextLine();
                System.out.println("Введите емайл:");
                String email = sc.nextLine();
                Manager.add(list, name, phone, email);
                System.out.println("Запись успешно добавлена");
                break;
            }
            case 2: {
                System.out.println("Введите имя:");
                String name = sc.nextLine();
                int[] name1 = Manager.find(list, name);
                if (name1 [0] == -1) {
                    System.out.println("Ничего не найдено");
                    break;
                }
            }
            case 3:
                Manager.print(list);
                break;
            case 4: {
                System.out.println("Введите индекс для удаления записи");
                int index = sc.nextInt();
                if (index < list.length) {
                    Manager.delete(list, index);
                    System.out.println("Запись успешно удалена");
                } else {
                    System.out.println("Неверно указан индекс");
                }
            }
            case 5:
                System.out.println("Введите индекс для изменения записи");
                int index = sc.nextInt();
                if (index < list.length) {
                    System.out.println("Введите имя");
                    String name = sc.nextLine();
                    System.out.println("Введите телефон");
                    String phone = sc.nextLine();
                    System.out.println("Введите емайл");
                    String email = sc.nextLine();
                    Manager.edit(list, index, name, phone, email);
                    System.out.println("Запись успешно изменена");
                } else {
                    System.out.println("Неверно указан индекс");
                }
                break;
            case 6:
                System.out.println("Спасибо за использование!");
                break;
            default:

        }
    }
}
