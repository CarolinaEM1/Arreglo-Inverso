/*
Leer 5 números, guaárdarlos en un arreglo y mostrarlos en el órden inverso al introducirlo
 */
package ejercicioa2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class EjercicioA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float[5];
      
        for (int i=0;i<numeros.length; i++){
            numeros[i]=Float.parseFloat(JOptionPane.showInputDialog("Digite el número: "+i));
        }
        JOptionPane.showMessageDialog(null,"\nImprimir los elementos del arreglo");
        for (int i=4;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
    
}
