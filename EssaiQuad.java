import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class EssaiQuad extends JPanel
{
    public BufferedImage chateauBleu;


    public EssaiQuad(){
	this.setBackground(Color.GREEN);
    try {
        chateauBleu = ImageIO.read(new File("Assets\\img\\chateauBleu.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
//quadrillage du terrain
        for(int i=0 ; i< 1450; i = i+50){
            for(int j = 0 ; j<900; j = j+50){
                g.drawLine(i-2, j, i+2, j);
            }
        }
        for(int k=0 ; k< 1450; k = k+50){
            for(int l = 0 ; l<900; l = l+50){
                g.drawLine(k, l-2, k, l+2);
            }
        }
        g.drawImage(chateauBleu, 0, 0, null);
    }
}



/*public class ImagePanel extends JPanel{
private BufferedImage image;
public ImagePanel() {
image = ImageIO.read(new File(monFichierImage));
}
protected void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawImage(image, 0, 0, null);
}
} */