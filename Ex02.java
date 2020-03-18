import javax.swing.*;
public class Ex02
{
    public static void main(String... args)
    {
        int num1, num2;
        int soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero"));
        soma = num1 + num2;
        
        if(soma<=20)
        {
            soma = soma - 5;
            JOptionPane.showMessageDialog(null, soma);
        }
    }
}