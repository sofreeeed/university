package grokaem_algorithms.binary;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.ArrayDeque;
import java.util.Queue;
public class HashTable {
    public static void main(String[] args) {
        Map<String, List<String>> hash = new HashMap<>();
        Queue<String> queue = new ArrayDeque<>();
        hash.put("sosat", new ArrayList<>(List.of("sosq", "atw")));
        hash.put("sosq", new ArrayList<>(List.of("sy", "st", "se")));
        hash.put("atw", new ArrayList<>(List.of("at", "wq","ert")));
        System.out.println(hash.get("sosat"));
        queue.addAll(hash.get("sosat"));
        System.out.println(queue);
        hash.forEach((k,v) -> System.out.println(k+"   "+v));
        String person;
        while(queue!=null){
            person = queue.poll();
            if(person.charAt(person.length()-1)=='y'){
                System.out.println(person+"     |"+queue);
                break;
            }
            else{
                queue.addAll(hash.get(person));
            }
        }
    }
}
