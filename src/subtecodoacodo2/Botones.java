//yjseijas 02-06-2017   -    04-02-2017
package subtecodoacodo2;
/** 
 * yjseijas 02062017
 */
import javax.swing.JPanel;
import javax.swing.JButton;

public class Botones extends JPanel{
    public JButton lasheras,santafe,cordoba,corrientes,once,
            venezuela,humberto,inclan,caseros,
            parquepatricios,hospitales;
    public Botones(){
        inicia();
        agrega();
        //setVisible(true);
    }
     private void inicia(){
         lasheras = new JButton("L. Heras");
         santafe = new JButton("Santa Fe");
         cordoba = new JButton("Córdoba");
         corrientes = new JButton("Corrientes");
         once = new JButton("Once");
         venezuela = new JButton("Venezuela");
         humberto = new JButton("Humberto");
         inclan = new JButton("Inclán");
         caseros = new JButton("Caseros");
         parquepatricios = new JButton("P. Patricios");
         hospitales = new JButton("Hospitales");
     }
     private void agrega(){
        add(lasheras);
        add(santafe);
        add(cordoba);
        add(corrientes);
        add(once);
        add(venezuela);
        add(humberto);
        add(inclan);
        add(caseros);
        add(parquepatricios);
        add(hospitales);
    } 
}
