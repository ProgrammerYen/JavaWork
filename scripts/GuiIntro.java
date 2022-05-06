import javax.swing.JOptionPane;

public class GuiIntro {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello there " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); 
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        float weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight (in kilograms)"));
        JOptionPane.showMessageDialog(null, "You weigh " + weight + " kg.");

    }
    
}
