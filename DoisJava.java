package SCI;

import javax.swing.*;

public class DoisJava {
    public static void main(String[] args) {

        float[] Valor = new float[5];
        float n = 0;

        for(int i = 0;i<Valor.length;i++) {
            Valor[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor: "));
        }
        float Maior = Valor[0], Menor = Valor[0];

        for (int i = 1;i<Valor.length;i++) {
            if(Valor[i] > Maior) {
                Maior = Valor[i];
            } else if (Valor[i] < Menor) {
                Menor = Valor[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Número Maior é: "+Maior
        +"\nNúmero Menor é: "+Menor);
    }
}
