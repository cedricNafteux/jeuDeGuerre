import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.*;

public class BarreDeMenu extends JMenuBar{


    JMenu menJeu = new JMenu("jeu"); 
    JMenu menStat = new JMenu("statistique");
    JMenu menAPro = new JMenu("a propos");
    JMenu menRes = new JMenu("ressource");

    JMenuItem menIteChar = new JMenuItem("charger");
    JMenuItem menIteSvg = new JMenuItem("sauvegarder");
    JMenuItem menIteNew = new JMenuItem("nouvelle partie");
    JMenuItem menIteQuit = new JMenuItem("quitter");
    JMenuItem menIteTime = new JMenuItem("temps de jeu");
    JMenuItem menIteMin = new JMenuItem("mineraux");
    JMenuItem menIteNou = new JMenuItem("nourriture");
    JMenuItem menIteBois = new JMenuItem("bois");
    JMenuItem menIteDuJeu = new JMenuItem("du jeu");
    JMenuItem menIteDuCre = new JMenuItem("du créateur");

    public BarreDeMenu(){
                this.menJeu.add(menIteNew);
                this.menJeu.add(menIteChar);
                this.menJeu.add(menIteSvg);
                this.menJeu.add(menIteQuit);
        
                this.menStat.add(menIteTime);
                this.menStat.add(menRes);
        
                this.menRes.add(menIteBois);
                this.menRes.add(menIteMin);
                this.menRes.add(menIteNou);
        
                this.menAPro.add(menIteDuJeu);
                this.menAPro.add(menIteDuCre);
        
                this.add(menJeu);
                this.add(menStat);
                this.add(menAPro);
        
                menIteChar.setAccelerator( KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK) );
                menIteQuit.addActionListener( new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    System.exit(0);
                    }
                }) ;
                this.setVisible(true);
            }
}
