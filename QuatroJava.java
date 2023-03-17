package SCI;

import javax.swing.*;

public class QuatroJava {
    public static void main(String[] args) {

        float[] Valor = new float[5];

        for (int i = 0;i<Valor.length;i++)
        {
            Valor[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe "+(i+1)+"° valor:"));
        }
        JOptionPane.showMessageDialog(null, "O terceiro valor escrito foi: "+Valor[3]);
    }
}
