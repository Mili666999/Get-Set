import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = read.nextLine();
        System.out.print("Input age: ");
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        //set the age via Setter
        student.setAge(age);

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    public String name;
    private int age;

    public int getAge() {
        //complete Getter
        return age;
    }
    public void setAge(int age){
        //complete Setter
        if(age<0){
            System.out.println("Invalid age");
            this.age = 0;
        }
        else
            this.age = age;

    }
}