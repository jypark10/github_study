package project;

import java.util.Random;
import java.util.Arrays;

public class Main {
    private Random random = new Random(System.nanoTime());
    
    public int[] generator() {
        int[] result = new int[6];
        
        for(int i=0; i<6; i++) {
            result[i] = random.nextInt(45);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] result = new Main().generator();
        System.out.println(Arrays.toString(result));
    }

}


