import javax.swing.*;

public class Ex03
{
    public static void main(String... args)
    {
        
        int num1;
        double raiz, quad;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if(num1 >= 0)
        {
          raiz = Math.sqrt(num1);
          JOptionPane.showMessageDialog(null,"Raiz quadrada (Arredondanda) é " +  raiz%2f %n);  
                
        }

        else
        {
            quad = Math.pow(num1,2);
            JOptionPane.showMessageDialog(null, "Ao quadrado é " + quad);
        }

    }

}