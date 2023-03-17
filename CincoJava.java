package SCI;

import javax.swing.*;

public class CincoJava {
    public static void main(String[] args) {

        String[][] Nomes = new String[3][5];
        double[] Medias = new double[3];
        double Soma = 0, maiorMedia = 0, menorMedia = 10;
        String nMaiorMedia = "", nMenorMedia = "";

        for (int i = 0;i<3;i++)
        {
            Nomes[i][0] = JOptionPane.showInputDialog("Informe o Nome do Aluno: ");
            for (int j = 1;j<5;j++)
            {
                Nomes[i][j] = (JOptionPane.showInputDialog("Informe a "+j+"° Nota:"));
                Soma += Double.parseDouble(Nomes[i][j]);
            }
            Medias[i] = Soma/4;

            if(Medias[i] > maiorMedia) {
                maiorMedia = Medias[i];
                nMaiorMedia = Nomes[i][0];
            }

            if (Medias[i] < menorMedia) {
                menorMedia = Medias[i];
                nMenorMedia = Nomes[i][0];
            }
        }
        String mensagem = "";
        for (int i = 0; i < 3; i++) {
            mensagem += "Aluno: " + Nomes[i][0] + "\nMédia: " + Medias[i] + "\n\n";
        }
        mensagem += "Aluno com maior média: " + nMaiorMedia + "\nMédia: " + maiorMedia + "\n";
        mensagem += "Aluno com menor média: " + nMenorMedia + "\nMédia: " + menorMedia;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
