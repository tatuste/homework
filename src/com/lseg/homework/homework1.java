package com.lseg.homework;


public class homework1 {
    public static void main(String[] args){
        int[] sampleArray = new int[]{1,2,3,4,5,6,7,8};
        int numOfRotations = 4;
        for(int i = 0; i < numOfRotations; i++){
            int firstElement = sampleArray[0];
            for(int j = 0; j < sampleArray.length-1; j++){
                sampleArray[j] = sampleArray[j+1];
            }
            sampleArray[sampleArray.length-1]=firstElement;
        }

        for(int k = 0; k <= sampleArray.length-1; k++){
            System.out.println(sampleArray[k]);
        }

        System.out.println("--------------");

        int[] rotatedArray = rotLeft((new int[]{1,2,3,4,5,6,7,8,9}), 5);
        for(int k = 0; k <= rotatedArray.length-1; k++){
            System.out.println(rotatedArray[k]);
        }
    }

    // Rezolvare cu metoda

    public static int[] rotLeft(int[] sampleArray1, int numOfRotations1){
        int firstElement1=sampleArray1[0];
        for(int i = 0; i < numOfRotations1; i++){
            int firstElement = sampleArray1[0];
            for(int j = 0; j < sampleArray1.length-1; j++){
                sampleArray1[j] = sampleArray1[j+1];
            }
            sampleArray1[sampleArray1.length-1]=firstElement;
        }
        return sampleArray1;
    }


}
