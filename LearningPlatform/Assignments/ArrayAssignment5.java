class ArrayAssignment5 {

    public static int[] findNumbers(int num1, int num2) {
        int[] numbers = new int[6];
        int j = 0;
        if (num1 < num2) {
            for (int i = num1; i <= num2 && j < numbers.length; i++) {
                if (i > 0 && i % 15 == 0 && i / 100 == 0) {
                    numbers[j] = i;
                    j++;
                }
            }
        }

        return numbers;
    }


    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int[] numbers = findNumbers(num1, num2);
        if (numbers[0] == 0) {
            System.out.println("There is no such number!");
        } else {
            for (int index = 0; index <= numbers.length - 1; index++) {
                if (numbers[index] == 0) {
                    break;
                }
                System.out.println(numbers[index]);
            }
        }

    }
}