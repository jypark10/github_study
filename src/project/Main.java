package project;

import java.util.Random;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
    private Random random = new Random(System.nanoTime());
    
    public int[] generator() {
        int[] result = new int[6];
        int index = 0;
        Set<Integer> generated = new HashSet<>();
        
        
        while(generated.size() < 6) {
            int num = random.nextInt(45)+1;
        
            if(!contains(generated, num)) {
                result[index++] = num;
                generated.add(num);
            }
        }
        
        return result;
    }

    boolean contains(Set<Integer> generated, int num) {
        return generated.contains(num);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] result = new Main().generator();
        System.out.println(Arrays.toString(result));
    }

}


