import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾을 값을 입력하세요: ");
        int value = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == value) {
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("존재합니다");
        }else{
            System.out.println("존재하지않습니다.");
        }

        }
    }

