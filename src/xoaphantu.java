import java.util.Arrays;
import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] newnumber = new int[number.length - 1];
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so bn muon xoa");
        int delete = input.nextInt();
        for (int i = 0, n = 0; i < number.length; i++) {
            if (number[i] != delete) {
                newnumber[n] = number[i];
                n++;
            }
        }
        System.out.println("Mảng sau khi xóa " + Arrays.toString(newnumber));
    }
}
