/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica02;

/**
 *
 * @author 326125536
 */
import java.util.Scanner;

public class Pratica02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite o valor de n: ");
        int n = sc.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n * 2];
        int k = 0;
        
        System.out.println("elementos de x:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            z[k] = x[i];
            k++;
        }
        
        System.out.println("elementos de y:");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
            
            boolean existe = false;
            for (int j = 0; j < k; j++) {
                if (y[i] == z[j]) {
                    existe = true;
                    break;
                }
            }
            
            if (existe == false) {
                z[k] = y[i];
                k++;
            }
        }
        
        System.out.println("vetor uniao z:");
        for (int i = 0; i < k; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
    
