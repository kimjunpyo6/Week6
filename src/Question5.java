public class Question5 {
    public static void main(String[] args) {
        int[] array = {12,3,19,7,5};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("가장 작은값: "+min);
    }
}
