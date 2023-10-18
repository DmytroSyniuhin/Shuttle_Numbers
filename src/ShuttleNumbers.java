public class ShuttleNumbers {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Перші 100 можливих номерів шатлів без нещасливих цифр 4 або 9:");

        for (int i = 1; i != 0; i++) {
            if (i % 10 != 4 && i % 10 != 9 && i / 10 % 10 != 4 && i / 10 % 10 != 9) {

                System.out.println(i);
                count++;

                if (count == 100) {
                    break;
                }
            }
        }
    }
}
