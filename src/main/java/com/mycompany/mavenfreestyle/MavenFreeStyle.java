/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenfreestyle;

/**
 *
 * @author olivert
 */
public class MavenFreeStyle {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
public static int fibonacci(int a){	
	if (a <= 1){
            return a;
	} else {
        
		return fibonacci(a - 1) + fibonacci(a - 2);
    }
}
}
