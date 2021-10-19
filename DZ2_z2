import java.util.Scanner;

public class z2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Write your number: ");
        int num = sc.nextInt();

        int num_input = num;

        int sqr_num = 0;
        sqr_num = num * num;

        int[] rev_sqr_num_arr = new int[10];

        int i = 0;
        int num_digit = 0;

        while (sqr_num > 0) {
            rev_sqr_num_arr[i] = sqr_num % 10;
            sqr_num = sqr_num / 10;
            i++;
            num_digit++;
        }

        int[] sqr_num_arr = new int[num_digit];
        int j = num_digit;

        for (i = 0; i < num_digit; i++, j--) {
            sqr_num_arr[i] = rev_sqr_num_arr[j-1];
        }

        System.out.println("Let's check whether there is number '3' in square number?");

        j = num_digit-1;
        int is_num_three = 0;

        while(j >= 0){
            if(sqr_num_arr[j] == 3) {
                is_num_three++;
            }
            j--;
        }

        if(is_num_three > 0){
            System.out.println("Your number include '3'!");
        }
        else{
            System.out.println("There aren't number '3'((");
        }

        int[] rev_num_arr = new int[10];

        i = 0;
        num_digit = 0;
        while (num > 0) {
            rev_num_arr[i] = num % 10;
            num = num / 10;
            i++;
            num_digit++;
        }

        System.out.println("Your reversed number looks like: ");
        for (int k = 0; k < num_digit; k++) {
            System.out.print(rev_num_arr[k]);
        }

        int[] flipped_first_second_num_arr = new int[num_digit];

        j = num_digit;

        for (i = 0; i < num_digit; i++, j--) {
            flipped_first_second_num_arr[i] = rev_num_arr[j-1];
        }

        int[] num_arr = new int[num_digit];
        j = num_digit;

        for (i = 0; i < num_digit; i++, j--) {
            num_arr[i] = rev_num_arr[j-1];
        }

        int temp = 0;

        temp = num_arr[num_digit-1];
        num_arr[num_digit-1] = flipped_first_second_num_arr[0];
        flipped_first_second_num_arr[0] = temp;

        temp = num_arr[0];
        num_arr[0] = flipped_first_second_num_arr[num_digit-1];
        flipped_first_second_num_arr[num_digit-1] = temp;

        System.out.println("\nYour number with changed first and last symbols looks like: ");
        for (int k = 0; k < num_digit; k++) {
            System.out.print(flipped_first_second_num_arr[k]);
        }


        System.out.println("\nYour number with added symbols looks like:");
        int one_num = 1;
        System.out.print(one_num);
        System.out.print(num_input);
        System.out.print(one_num);

    }
}
