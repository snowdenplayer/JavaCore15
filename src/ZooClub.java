import java.util.*;

public class ZooClub {
    Map<Person, List<Animal>> map = new HashMap<>();
    Scanner in = new Scanner(System.in);

    public Map<Person, List<Animal>> getMap() {
        return map;
    }

    public void setMap(Map<Person, List<Animal>> map) {
        this.map = map;
    }

    public void addUser(Person per) {
        map.put(per, per.getAnimal());
        System.out.println("User " + per.getName() + " has been aded");
    }

    public void addPet(Animal pet) {
        System.out.println("Enter name of user ");
        String imie = in.nextLine();
        for (Person person : map.keySet()) {
            if (person.getName().equalsIgnoreCase(imie)) {
                person.animal.add(pet);
            }

        }
        System.out.println("Pet " + pet.getNameAnimal() + " was aded");


    }

    public void dellPet() {
        System.out.println("Enter name of user ");
        String imie = in.nextLine();
        System.out.println("Enter name of pet ");
        String name = in.nextLine();
        for (Person person : map.keySet()) {
            if (person.getName().equalsIgnoreCase(imie)) {
                Iterator<Animal> pet = person.animal.iterator();
                while (pet.hasNext()) {
                    if (pet.next().getNameAnimal().equalsIgnoreCase(name)) {
                        pet.remove();
                    }
                }
            }

        }


        System.out.println("Pet " + name + " was deleted");
    }

    public void dellUser() {
        System.out.println("Enter name ");
        String str = in.nextLine();
        Iterator<Person> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            if(iterator.next().getName().equalsIgnoreCase(str)){
                iterator.remove();
                System.out.println("User" + " was deleted");
            }
        }

    }

    public void deleteAnimal() {
        System.out.println("Enter name ");
        String str = in.nextLine();

        for(Person person: map.keySet()){
            Iterator<Animal> iterator = person.animal.iterator();
            while(iterator.hasNext()){
                if(iterator.next().getNameAnimal().equalsIgnoreCase(str)){
                    iterator.remove();
                }
            }
        }

    }
    public void show() {
        Collection<Map.Entry<Person, List<Animal>>> entrySet = map.entrySet();
        for (Map.Entry<Person, List<Animal>> entry : entrySet) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }


}
