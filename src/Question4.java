public class Question4 {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 4};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // 최대값 찾기
            }
        }
        System.out.println("가장 큰 값: " + max); // 최대값 출력
    }
}
