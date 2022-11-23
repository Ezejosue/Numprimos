package com.example.primos.Operation;

import java.util.Scanner;

public class Palindrome {


  public static void esPalindromo(String text) {
    int inc = 0;
    int des = text.length()-1;
    boolean error = false;

    while ((inc<des) && (!error)){

      if (text.charAt(inc)==text.charAt(des)){
          inc++;
          des--;
      } else {
        error = true;
      }
    }


    if (!error) {
      System.out.println(text + " es un palindormo");
    }
    else{
      System.out.println(text + " NO es un palindromo");
    }

  }

  public void readText(){
    String word="";
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.println("");
    System.out.println("Ingrese el texto deseado: ");
    word =sc.next();
    esPalindromo(word);
  }
}
