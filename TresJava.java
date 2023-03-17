package SCI;

import javax.swing.*;

public class TresJava {
    public static void main(String[] args) {

        double[] Notas = new double[4];
        double Soma = 0, Media = 0;
        boolean Continuar = true;
        String Nome;

        while (Continuar) {
            Nome = JOptionPane.showInputDialog("Digite o nome do aluno:");

            for (int i = 0; i < 4; i++) {
                Notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " +(i+1)+"ª nota:"));
                Soma += Notas[i];
            }
            Media = Soma / 4;

            if (Media < 6) {
                JOptionPane.showMessageDialog(null, "Aluno: "+Nome+ "\nMédia: "+Media+"\nReprovado");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno: "+Nome+ "\nMédia: "+Media+"\nAprovado");
            }
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (opcao == JOptionPane.NO_OPTION || opcao == JOptionPane.CLOSED_OPTION) {
                Continuar = false;
            }
        }
    }
}
