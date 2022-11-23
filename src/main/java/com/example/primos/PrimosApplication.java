package com.example.primos;

import com.example.primos.Operation.Operation;
import com.example.primos.Operation.Palindrome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimosApplication {

  public static void main(String[] args) {
    SpringApplication.run(PrimosApplication.class, args);


    Operation po = new Operation();
    po.printNumbers();

    Palindrome pa = new Palindrome();
    pa.readText();

  }

}
