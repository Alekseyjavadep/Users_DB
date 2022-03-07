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

        System.out.println("Введите данные для входа");
        db.check_input_user();
    }
}
