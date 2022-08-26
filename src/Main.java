public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        var salaries  = generateRandomArray();
        int sum = 0;
        for (var salary : salaries) {
            sum += salary;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
        System.out.println(salaries);
    }

    public static void task1() {

        var salaries = generateRandomArray();
        int sum = 0;
        for (var salary : salaries){
        sum += salary;
    }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
    }
    public static void task2() {

        var salaries = generateRandomArray();
        int max = salaries[0];
        int min = salaries[0];

        for (var salary : salaries) {
            if (max < salary) {
                max = salary;
            }
            if (min > salary) {
                min = salary;
            }
        }
        System.out.printf("Минимальная сумма трат за день %d рублей. Максимальная сумма трат за день составила");
    }

    public static void task3() {
        var salaries = generateRandomArray();
        int sum = 0;
        for (var salary : salaries) {
            sum += salary;
        }
        var result = (double) sum / salaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %2f рублей", result);
    }
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        for (int reverseIndex = reverseFullName.length-1, index=0; reverseIndex >=0; reverseIndex --, index++) {
            System.out.print(reverseFullName[reverseIndex]);
            fullName[index] = reverseFullName[reverseIndex];
        }
        System.out.printf("Итоговая строка - %5", String.valueOf(fullName));

        }

            }


