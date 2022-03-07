import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        Input_User input_user = new Input_User();
        System.out.println("Для входа по имени введите 1");
        System.out.println("Для регистрации введите 2");
        Scanner sc = new Scanner(System.in);

        int user_input = sc.nextInt();
        input_user.start(user_input);
//        switch (input_user){
//            case 1:
//                System.out.println("Вход по имени");
//                break;
//            case 2: db.reg_user();
//                System.out.println("Регистрация успешно выполнена");
//                break;
//            default:
//                System.out.println("Введена не корректно цифра");
//        }
        System.out.println("Введите данные для входа");
        db.check_input_user();
    }
}
