import javax.swing.*;
public class Ex01
{
    public static void main (String... args)
    {
        /*Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
        caso o resultado seja maior que 10, apresentá-lo. */
        int num1, num2;
        int soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1º numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 2º numero"));

        soma = num1 + num2;
        if(soma>10)
        {
            JOptionPane.showMessageDialog(null,"Sua soma foi: " + soma);         
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Sua soma não foi mais que 10" );
        }
    }    
}