import javax.swing.JOptionPane;

public class RaizQuadrada {
   public static void main (String args[]) {
      //declara vari�veis
      int numero;
      double raiz;
      //entrada
      numero = Integer.parseInt(
               JOptionPane.showInputDialog("Digite um n�mero positivo"));
      //processamento         
      raiz = Math.sqrt(numero);
      //saida 
      JOptionPane.showMessageDialog (null, "raiz quadrada de " + numero + 
                                           " = " + raiz);
      
   }
}