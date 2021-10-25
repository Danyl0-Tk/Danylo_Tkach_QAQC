import java.util.Scanner;

public class z3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float n1 = sc.nextFloat();
        System.out.println("Enter second number: ");
        float n2 = sc.nextFloat();
        System.out.println("Enter third number: ");
        float n3 = sc.nextFloat();

        int counter = 0;

        if(5 > Math.abs(n1)){
            counter++;
        }

        if(5 > Math.abs(n2)){
            counter++;
        }

        if(5 > Math.abs(n3)){
            counter++;
        }

        if(counter == 3)
            System.out.println("Three numbers belong to range -5 < number < 5!");
        else
            System.out.println("Not all numbers belong to range -5 < number < 5!");


        System.out.println("Enter first number: ");
        int n4 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n5 = sc.nextInt();
        System.out.println("Enter third number: ");
        int n6 = sc.nextInt();

        if(n4 > n5 && n4 > n6){
            System.out.println("First number is the largest!");
        }
        else if(n5 > n4 && n5 > n6){
            System.out.println("Second number is the largest!");
        }
        else if(n6 > n4 && n6 > n5){
            System.out.println("Third number is the largest!");
        }

        if(n4 < n5 && n4 < n6){
            System.out.println("First number is the smallest!");
        }
        else if(n5 < n4 && n5 < n6){
            System.out.println("Second number is the smallest!");
        }
        else if(n6 < n4 && n6 < n5){
            System.out.println("Third number is the smallest!");
        }


        System.out.println("Please, enter error number: ");
        int err_num = sc.nextInt();

        switch(err_num){
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;
        }


        Dog dog_1 = new Dog(Dog.breed.PUG, 5);
        Dog dog_2 = new Dog(Dog.breed.BULLDOG, 8);
        Dog dog_3 = new Dog(Dog.breed.TERRIER, 2);


    }
}