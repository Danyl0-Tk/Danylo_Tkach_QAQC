
public class z2 {

    static double div(double first_num, double second_num){
        return first_num/second_num;
    }

    public static void main(String args[]) {
        
        double num_1 = 10.5;
        double num_2 = 0;


        try{

            double num = 10/0;

        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("end of the program");

    }
}