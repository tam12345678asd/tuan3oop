import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {
        int[] number = {1, 3, 5, 7, 9};
        int[] number1 = {2, 4, 6, 8, 0};
        int[] number2 =new int[number.length+number1.length];
        for (int i = 0; i < number.length; i++) {
            number2[i] = number[i];
        }
        for (int i = 0 ;i <number1.length ;i++){
            number2[i+number.length]=number1[i];

        }
        System.out.println( Arrays.toString(number2));




    }
}
