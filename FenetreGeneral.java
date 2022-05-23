import javax.swing.JFrame;

public class FenetreGeneral extends JFrame
{


    public FenetreGeneral()
    {
        this.setTitle("jeudeGuerre");
        this.setSize(1400,840);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(50, 50);
        this.setResizable(false);
        this.setAlwaysOnTop(false);
        this.setUndecorated(false);

            // création menu
    BarreDeMenu menu = new BarreDeMenu() ;
    this.setJMenuBar(menu);
    
    this.setVisible(true);
    }



}