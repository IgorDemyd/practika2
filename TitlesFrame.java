import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {

   public TitlesFrame() {
      this.initUI();
   }
//metod dlja sozdanija osnovnogo okna programi
   private void initUI() { 
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(91));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }
//otsida peredautsa znachenija dla vibora v shapefactory
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}
