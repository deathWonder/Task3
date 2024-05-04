package org.programm;

import java.util.ArrayList;

public class Task3 {

    public int[] getPrimeNumbers(int[] range){
        int firstIndex = range[0];
        int lastIndex = range[1];
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for(int i = firstIndex; i < lastIndex; i++){

            if(i==2||i==3||i==5||i==7) {
                primeNumbers.add(i);
            }else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                if(i==1) continue;
                primeNumbers.add(i);
            }
        }

        return primeNumbers.stream().mapToInt(i -> i).toArray();
    }
}
