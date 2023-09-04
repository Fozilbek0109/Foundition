package lesson12massive;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] massive = {2,10,1,8,15,11,0,102,88};
        System.out.println(Arrays.toString(massive));
        int temp;
        for (int i = 0; i < massive.length ; i++) {
            for (int j = i+1; j < massive.length; j++) {
                if (massive[i] < massive[j]) {
                    temp = massive[i]; // temp = 2;
                    massive[i] = massive[j]; // massive[i] = [1,10,1
                    massive[j] = temp;      // massive[j] = [1,10,2
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
