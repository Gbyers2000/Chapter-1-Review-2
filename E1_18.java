import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class E1_18

{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL(
            "https://www.codercrunch.com/content/skill/images/java-8-f.png");
      JOptionPane.showMessageDialog(null, "Greetings", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
   }
}