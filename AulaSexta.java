/*
   Data:01/03/2019
 Aula 01
   Calcular a �rea de um ret�ngulo.
   Para isso:
   - solicitar, via teclado, a base e a altura do ret�ngulo.
   - O programa dever� calcular a �rea e mostr�-la na tela.
*/

import javax.swing.JOptionPane;   //importar o gerenciador de janelas JOptionPane

public class BaseTriangulo {
   //Declara��o de Variaveis
      private double altura;
      private double base;
      private double area;
   //Construtores
   public AulaSexta(){            //Por hora n�o tem utilidade, apenas treino
   }
   //M�todos                      //� possivel mesclar essa etapa com a declara��o de vari�veis como fizemos nas aulas anteriores
   public void calcularArea(){
      //1�.Pedir para o usu�rio inserir o valor da base e altura
      base = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Digite o valor da base: ")
      );
      
      altura = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Digite o valor da altura: ")
      );
      
      //2�.Calcular a �rea
      area = base * altura;
      
      //3�.Exibir o resultado
      JOptionPane.showMessageDialog(null, "O valor da �rea �: " + area);
      
   }
}

/*
A Aula de hoje n�o usamos o main, mas usamos o Java Workbench (bot�o azul do JGrasp)
clicamos em create, botao direito e em usamos o invoke
*/