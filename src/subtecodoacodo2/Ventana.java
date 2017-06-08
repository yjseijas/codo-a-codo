//yjseijas 02-06-2017   -    04-02-2017
package subtecodoacodo2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

//import SubteCodoaCodo.SubteCodoaCodo;
public class Ventana extends JFrame implements ActionListener{
    public Botones estaciones;
    public SubteCodoaCodo2 comenzar; 
    public JPanel panelmensaje;
    public JPanel panelmensaje02 = new JPanel(); 
public Ventana(){
    estaciones = new Botones();
    panelmensaje = new JPanel();
    panelmensaje.setSize(150,70);
    panelmensaje02.setSize(150,70);
    setLayout(new GridLayout(3,0));
    add(panelmensaje);
    add(panelmensaje02); 
    panelmensaje.add(new JLabel("Por Favor Indique Estación en la que se Encuentra",
            JLabel.CENTER));
    add(estaciones);
    pack();
    setLocation(100,100);
    estaciones.lasheras.addActionListener(this);
    estaciones.santafe.addActionListener(this);
    estaciones.cordoba.addActionListener(this);
    estaciones.corrientes.addActionListener(this);
    estaciones.once.addActionListener(this);
    estaciones.venezuela.addActionListener(this);
    estaciones.humberto.addActionListener(this);
    estaciones.inclan.addActionListener(this);
    estaciones.caseros.addActionListener(this);
    estaciones.parquepatricios.addActionListener(this);
    estaciones.hospitales.addActionListener(this);
    comenzar = new SubteCodoaCodo2();
    setSize(1020,250);
    setVisible(true);
    setLocationRelativeTo(null);
    
    }
public void actionPerformed(ActionEvent evt){
    comenzar.acciones(this, evt);
}

}
