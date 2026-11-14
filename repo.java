import java.util.*;

public class TAKE {

    public static void main(String[] args){
    List<Integer> a = Arrays.asList(4,8,14, 16, 19, 21, 4, 3, 1, 5, 4, 1, 10, 11, 11) ;
    
    Map<Integer, Integer> M = new LinkedHashMap<>();
    for(int n: a){
     M.put(n, M.getOrDefault(n, 0)+1);
    }
    
    System.out.println(M);

    int second_highest_num = M.values().stream()
              .distinct()
              .sorted(Comparator.reverseOrder())
              .skip(1)
              .findFirst()
              .get();
              
    List<Integer> second_repeated_element =M.entrySet().stream()
                .filter(n->n.getValue()==second_highest_num)
                .map(o-> o.getKey())
                .toList();

                System.out.println(second_repeated_element + " Printed from streams");
                List<Integer> SECOND_FROM_LOOP = new ArrayList<>();

for (Map.Entry<Integer, Integer> entry : M.entrySet()) {
    if (entry.getValue() == second_highest_num){
        SECOND_FROM_LOOP.add(entry.getKey());
    };
    
}
                 System.out.println(SECOND_FROM_LOOP + " Printed from loop");
              

        
}
}

