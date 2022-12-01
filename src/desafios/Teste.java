package desafios;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(vetorAcumulado(nums)));
    }

    public static int[] vetorAcumulado(int[] array){
        int acumulado = 0;
        for(int i=0; i < array.length; i++){
            acumulado += array[i];
            array[i] = acumulado;
        }
        return array;
    }
}
