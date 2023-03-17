package SCI;

import javax.swing.*;

public class UmJava {
    public static void main(String[] args) {

        int[] Valor = new int[5];
        int Soma = 0, Media = 0;
        int n = 1;
        StringBuilder Pares = new StringBuilder();
        StringBuilder Impares = new StringBuilder();

        for(int i = 0;i<Valor.length;i++)
        {
            Valor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe "+n+"° valor: "));

            if (Valor[i]%2 == 0)
            {
                Pares.append(Valor[i]).append(", ");
            }
            else {
                Impares.append(Valor[i]).append(", ");
            }
            n+=1;
            Soma = Valor[i]+Soma;
        }
        Media = Soma/5;

        JOptionPane.showMessageDialog(null,"Os valores Pares: " +Pares+
                "\nOs valores Impares: "+Impares+
                "\nMédia Geral é: "+Media);
    }
}
