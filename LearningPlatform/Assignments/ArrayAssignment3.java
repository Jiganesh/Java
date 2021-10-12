class ArrayAssignment3 {

    public static int[] findLeapYears(int year) {
        int i = 0;
        int[] result = new int[15];

        while (i < 15) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                result[i] = year;
                i++;
            }
            year++;
        }
        return result;
    }

    public static void main(String[] args) {
        int year = 2000;
        int[] leapYears;
        leapYears = findLeapYears(year);
        for (int index = 0; index < leapYears.length; index++) {
            System.out.println(leapYears[index]);
        }
    }
}