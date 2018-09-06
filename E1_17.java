import javax.swing.JOptionPane;
public class E1_17
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.println(name);
      System.out.println("Hello " + name + "!");
      String action = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
      System.out.println("Sorry " + name + ", I'm afraid I can't do that.");

   }
}