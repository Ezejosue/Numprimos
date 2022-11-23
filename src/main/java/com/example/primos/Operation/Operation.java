package com.example.primos.Operation;

public class Operation {

  public static boolean isPrime(int number){
    if (number == 0 || number==1||number==4){
      return false;
    }
    for (int x=2; x<number/2;x++){
      if (number%x==0)
        return false;
    }
    return true;
  }


  public void printNumbers(){
    for (int x = 0; x<25; x++){
      if (isPrime(x)){
        System.out.println("Los números son: " + String.valueOf(x)+" ,");

      }
    }
  }
}
