import javax.swing.JOptionPane;

public class Ex1{
   public static void main(String[] args){
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
            
      System.out.println("O resultado e " + (num1 + num2));
   }

}