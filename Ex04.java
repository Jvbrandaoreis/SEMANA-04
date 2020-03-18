import javax.swing.*;

public class Ex04
{
    public static void main(String... args)
    {
        int num1, num2, num3;
        int pos1 = 0, pos2 = 0, pos3 = 0 ;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1º numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2º numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 3º numero"));

        if(num1 > num2 && num1 > num3)
        {
            pos1 = num1;
            if(num2 > num3)
            {
                pos2 = num2;
                pos3 = num3;
            }
            else
            {
                pos2 = num3;
                pos3 = num2;
            }
        }

        else if (num1 > num2 && num1 < num3)
        {
            pos1 = num3;
            pos2 = num1;
            pos3 = num2;
        }

        else if (num1 < num2 && num1 > num3)
        {
            pos1 = num2;
            pos2 = num1;
            pos3 = num3;
        }

        else if(num3 > num1 && num3 < num2)
        {
            pos1 = num2;
            pos2 = num3;
            pos3 = num1;
        }

        else if(num2 > num1 && num2 < num3)
        {
            pos1 = num3;
            pos2 = num2;
            pos3 = num1;

        }
        

        JOptionPane.showMessageDialog(null, pos3 + "," + pos2 + "," + pos1 );
    }
}