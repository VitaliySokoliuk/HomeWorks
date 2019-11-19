package homework_19;
import java.util.*;

public class Zoo_club {
    
    private Map<Person, List<Animal>> map = new HashMap<>();
    
    public void add_member(){
        System.out.println("Додамо нового учасника: ");
        map.put(Person.input_person(), new ArrayList<>());
    }
    
    public void add_animal_to_person(){
        boolean q = false;
        System.out.println("Введіть дані людини, до якої хочете додати тварину:");
        Person pers = Person.input_person();
        if(map.containsKey(pers)){
            map.get(pers).add(Animal.input_animal());
            q = true;
        }
        if(!q)
            System.out.println("Такої людини не існує");
    }
    
    public void delete_animal_from_person(){
        boolean q = false;
        System.out.println("Введіть дані людини, в якої хочете видалити тварину:");
        Person pers = Person.input_person();
        if(map.containsKey(pers)){
            Animal am = Animal.input_animal();
            map.get(pers).remove(am);
            q = true;
            if(!map.get(pers).contains(am))
                System.out.println("Ця людина не має такої тварини");
        }
        if(!q)
            System.out.println("Такої людини не існує");
    }
    
    public void delete_person(){
        boolean q = false;
        System.out.println("Введіть дані людини, яку хочете видалити:");
        Person pers = Person.input_person();
        if(map.containsKey(pers)){
            map.remove(pers);
            q = true;
        }
        if(!q)
            System.out.println("Такої людини не існує");
    }
    
    public void delete_all_animal(){
        System.out.println("Введіть дані тварини, яку хочете видалити в усіх учасників клубу");
        Animal am = Animal.input_animal();
        Set<Map.Entry<Person, List<Animal>>> entry = map.entrySet();
        Iterator<Map.Entry<Person, List<Animal>>> it = entry.iterator();
        while (it.hasNext()) {
            Map.Entry<Person, List<Animal>> next = it.next();
            next.getValue().remove(am);
        }
    }
    
    
    
    public void show_zoo_club(){
        Set<Map.Entry<Person, List<Animal>>> entry = map.entrySet();
        Iterator<Map.Entry<Person, List<Animal>>> it = entry.iterator();
        while (it.hasNext()){
            Map.Entry<Person, List<Animal>> next = it.next();
            System.out.println(next.getKey() + " pets - " + next.getValue());
        }
    }
    
}
