import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String gender;
        Queue NU = new LinkedList<>();
        Queue NAM = new LinkedList<>();
        System.out.println("Enter size");
        int size;
        size = scanner.nextInt();scanner.nextLine();
        Person[] people = new Person[size];
        for (int i=0;i<size;i++){
            System.out.printf("Location %s \n",i);
            System.out.println("Enter name");
            name = scanner.nextLine();
            System.out.println("\t");
            System.out.println("Enter gender");
            gender = scanner.nextLine();
            people[i] = new Person(gender,name);
            if(Objects.equals(gender, "male")){
                NAM.add(people[i]);
            }else{
                NU.add(people[i]);
            }
        }
        System.out.println("Female: ");
        System.out.println(NU);
        System.out.println("Male: ");
        System.out.println(NAM);
    }
}