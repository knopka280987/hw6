

public class Main {
    static int[] arr = generateRandomArray();

    //task1

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] costs = new int[30];
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            sum += arr[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

            //task2
        }
        int arrTwo = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");

                System.out.println();

            }

        }
    }
}



