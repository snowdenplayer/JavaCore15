import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int wiek;
    Scanner in = new Scanner(System.in);
   List<Animal> animal = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


    public Person() {
        System.out.println("Enter name");
        name = in.nextLine();
        System.out.println("Enter age");
        wiek = in.nextInt();

    }


    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
