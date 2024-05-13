import java.util.Scanner;

public class th3 {

        public static void main(String[] args) {
          int[] number={1,5,7,45,47,2,8,54};
          int max = number[0];
            for(int i = 0;i <=number.length -1;i++){
                if (number[i] > max){
                    max = number[i];
                }
            }
            System.out.println(max);

            }
        }



