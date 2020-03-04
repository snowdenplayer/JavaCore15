import java.util.Scanner;

public class Application {
    static void menu(){
        System.out.println("Press 1 to add user");
        System.out.println("Press 2 to add animal to club");
        System.out.println("Press 3 to remove animal with club");
        System.out.println("Press 4 to remove user with club");
        System.out.println("Press 5 to remove a specific animal");
        System.out.println("Press 6 to vizualization club");
        System.out.println("Press 9 to exit");
    }
    public static void main(String[] args) {

        ZooClub zoo = new ZooClub();
        Scanner in = new Scanner(System.in);

        boolean flag = false;
        while(!flag){
            menu();

            switch (in.nextLine()){
                case "1":{
                    zoo.addUser(new Person());
                    break;
                }
                case "2":{
                    zoo.addPet(new Animal());
                    break;
                }
                case "3":{
                    zoo.dellPet();
                    break;
                }
                case "4":{
                    zoo.dellUser();
                    break;
                }
                case "5":{
                    zoo.deleteAnimal();
                    break;
                }

                case "6":{
                    zoo.show();
                    break;
                }
                case"9":
                    System.exit(0);


            }
        }

    }
}
