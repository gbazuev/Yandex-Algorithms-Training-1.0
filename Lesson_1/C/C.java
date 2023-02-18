import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String general = reformat(scanner.nextLine());

        String[] numbers = new String[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = reformat(scanner.nextLine());
            if (numbers[i].equals(general)) {
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }

    }

    static String reformat(String phoneNumber) {
        StringBuilder builder = new StringBuilder(phoneNumber);

        //Удаляем
        if (phoneNumber.contains("-")) {
            for (int i = 0; i < builder.length(); i++) {
                char symbol = builder.charAt(i);
                if (symbol == '-') {
                    builder.deleteCharAt(i);
                }
            }
        }
        if (phoneNumber.contains("("))  {
            builder.deleteCharAt(builder.lastIndexOf("("));
            builder.deleteCharAt(builder.lastIndexOf(")"));
        }
        if (phoneNumber.charAt(0) == '+')   {
            builder.delete(0, 2);
            builder.insert(0, '8');
        }
        if (builder.length() == 8)  {
            builder.insert(1, "495");
        }
        if (builder.length() == 7)  {
            builder.insert(0, "8495");
        }
        return builder.toString();
    }
}
