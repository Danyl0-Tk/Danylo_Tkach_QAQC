public class Student {

    private String name;
    private int age;
    private int course;

    public Student(){
        this.name = "-";
        this.age = 0;
        this.course = 0;
    }

    public Student(String name, int age, int course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String get_name(){
        return this.name;
    }

    public int get_age(){
        return this.age;
    }

    public int get_course(){
        return this.course;
    }

    public void set_name(String name){
        this.name = name;
    }

    public void set_age(int age){
        this.age = age;
    }

    public void set_course(int coursee){
        this.course = course;
    }

    @Override
    public String toString() {
        return name;
    }

}
