/**
 * Created by ALEX on 16.10.2014.
 */
public class Manager {

    public static void add(Address[] list, String name, String phone, String email) {
        int count = 1;
        list[count].name = name;
        list[count].phone = phone;
        list[count].email = email;
        count++;
    }
    public static int[] find(Address[] list, String name) {
        int count = 0;
        int[] name1 = new int[count];
        for (int i = 0; i < list.length; i++) {
            if (!(list[i].name == null)) {
                Address a = list[i];
                if (a.name.equals(name)) {
                    name1[count] = i;
                    count++;
                }
            }
        }
        if (name1.length > 0) {
            return name1;
        } else {
            int[] b = new int[1];
            b[0] = -1;
            return b;
        }
    }
    public static void print (Address [] list) {
        System.out.println("  Имя  /   телефон  /  email");
        int count = 1;
        for (int i=1; i<list.length; i++) {
            System.out.println(i + "." + list[count].name + " / " + list[count].phone + " / " + list[count].email);
            count ++;
        }
    }

    public static void delete(Address[] list, int index) {
        list[index].name = null;
        list[index].phone = null;
        list[index].email = null;

        for (int i = index; i < list.length - 1; i++) {
            list[i].name = list[i + 1].name;
            list[i].phone = list[i + 1].phone;
            list[i].email = list[i + 1].email;
        }
    }

    public static void edit (Address [] book, int index, String name, String phone, String email){
        book[index].name=name;
        book[index].phone=phone;
        book[index].email=email;
    }

}