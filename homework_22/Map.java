package homework_22;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class Map<K, V> extends MyEntry<K, V> {

    private LinkedHashMap<K, V> map = new LinkedHashMap<K, V>();

    public Map(K k, V v) {
        super(k, v);
        this.map = new LinkedHashMap<K, V>();
        this.map.put(k, v);
    }

    public void addEl(K k, V v) {
        map.put(k, v);
    }
    
    public void remove_by_key(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ключ, за яким видалити елемент: ");
        int q = scan.nextInt();
        V remove = map.remove(q);
        if (remove == null)
            System.out.println("Такого ключа не інує");
        else
            System.out.println("Видалений елемент: ключ - " + q + ", значення - " + remove);
    }
    
    public void remove_by_value(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть значення, за яким видалити елемент: ");
        int q = scan.nextInt();
        boolean w = false;
        Iterator<Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Entry<K, V> next = it.next();
            if(next.getValue().equals(q)){
                System.out.println("Видалений елемент: ключ - " + next.getKey() + ", значення - " + q);
                it.remove();
                w = true;
            }
        }
        if(!w)
            System.out.println("Такого значення не інує");
    }
    
    public void show_set_key(){
        System.out.println("Ключі:");
        Iterator<Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next().getKey());
        }
    }
    
    public void show_list_value(){
        System.out.println("Значення:");
        Iterator<Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next().getValue());
        }
    }
    
    public void show() {
        Set<Entry<K, V>> ent = map.entrySet();
        for (Entry<K, V> elem : ent) {
            System.out.println(elem.getKey() + " - " + elem.getValue());
        }
    }
    
}
