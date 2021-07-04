class ArrayAssignment2 {
    public static void main(String[] args) {
        {
            double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
            double[] details = findDetails(salary);

            System.out.println("Average salary: " + details[0]);
            System.out.println("Number of salaries greater than the average salary: " + details[1]);
            System.out.println("Number of salaries lesser than the average salary: " + details[2]);
        }
    }

    public static double[] findDetails(double[] salary) {
        // Implement your code here and change the return value accordingly
        double[] result = new double[3];
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }

        result[0] = sum / salary.length;

        double noOfSalarygreater = 0, noOfSalarylesser = 0;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > result[0])
                noOfSalarygreater++;
            if (salary[i] < result[0])
                noOfSalarylesser++;
        }
        result[1] = noOfSalarygreater;
        result[2] = noOfSalarylesser;

        return result;
    }
}
