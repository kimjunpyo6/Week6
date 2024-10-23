public class Question9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        System.out.println("복사된 배열 출력:");
        for (int i = 0; i < copyArray.length; i++) {
            System.out.println(copyArray[i]);
        }
    }
}
