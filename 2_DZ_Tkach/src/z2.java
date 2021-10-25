import java.util.Scanner;

public class z2 {

    public static void main(String[] args) {

      Person p_1 = new Person("Dan", 2002);
      Person p_2 = new Person("Stepan", 1900);
      Person p_3 = new Person("Jack", 1990);
      Person p_4 = new Person("Andrew", 1985);
      Person p_5 = new Person();
      p_1.output_info();
      p_5.output_info();
      p_3.output_info();
      p_3.calculate_age();
      p_3.change_name("Not Jack");
      p_3.output_info();
    }
}




