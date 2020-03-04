import java.util.Scanner;

public class Animal {
    private String typAnimal;
    private String nameAnimal;
    Scanner in = new Scanner(System.in);

    public Animal() {
        System.out.println("Enter type");
        typAnimal = in.nextLine();
        System.out.println("Enter name");
        nameAnimal = in.nextLine();

    }

    public String getTypAnimal() {
        return typAnimal;
    }

    public void setTypAnimal(String typAnimal) {
        this.typAnimal = typAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typAnimal='" + typAnimal + '\'' +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
