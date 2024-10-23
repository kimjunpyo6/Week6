public class Question10 {
    public static void main(String[] args) {
        int[] array = {20, 30, 50, 70, 90};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double average = sum / array.length;
        System.out.println("평균 값은" + average);
    }
}
