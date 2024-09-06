public class Main {
    public static void main(String[] args) {
        //Task 1
        {
            printTaskTitle(1);

            int[] weekPayments = {12895, 11225, 56489, 12245, 988};
            int sumPayments = 0;
            for (int weekPayment : weekPayments) {
                sumPayments += weekPayment;
            }
            System.out.printf("Сумма трат за месяц составила %d рублей\n", sumPayments);
        }

        // Task 2
        {
            printTaskTitle(2);

            int[] weekPayments = {12895, 11225, 56489, 12245, 988};
            int maxPayment = -1;
            int minPayment = Integer.MAX_VALUE;

            for (int weekPayment : weekPayments) {
                if (minPayment > weekPayment)
                    minPayment = weekPayment;
                if (maxPayment < weekPayment)
                    maxPayment = weekPayment;
            }

            System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей\n", minPayment, maxPayment);
        }

        // Task 3
        {
            printTaskTitle(3);

            int[] weekPayments = {12895, 11225, 56489, 12245, 988};
            int sumPayments = 0;
            float avgPayment = 0f;

            for (int weekPayment : weekPayments)
                sumPayments += weekPayment;

            if (weekPayments.length > 0)
                avgPayment = (float) sumPayments / weekPayments.length;

            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", avgPayment);
        }

        //Task 4
        {
            printTaskTitle(4);

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

            for (int i = 0; i < reverseFullName.length / 2; i++) {
                char temp = reverseFullName[i];
                reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
                reverseFullName[reverseFullName.length - i - 1] = temp;
            }

            for (char c : reverseFullName) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void printTaskTitle(int taskNumber) {

        System.out.printf("\n    Task %2d\n", taskNumber);
        System.out.println("---------------");

    }

}