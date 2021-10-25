import java.util.Scanner;
public class Person {

    private String name;
    private int birth_year;

    public Person(){
        this.name = "-";
        this.birth_year = 0;
    }

    public Person(String name, int birth_year){
        this.name = name;
        this.birth_year = birth_year;
    }

    public void calculate_age(){
        System.out.println(this.name+" is "+(2021 - this.birth_year)+" y. o.");
    }

    public void input_info(String name, int birth_year){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input name: ");
        name = sc.nextLine();

        System.out.println("Input year: ");
        birth_year = sc.nextInt();

        this.name = name;
        this.birth_year = birth_year;
    }

    public void output_info(){
        System.out.println("Name: "+name+". Birth year: "+birth_year);
    }

    public void change_name(String new_name){
        this.name = new_name;
    }

    public String get_name()
    {
        return name;
    }

    public int get_birth_year(){
        return birth_year;
    }

}
