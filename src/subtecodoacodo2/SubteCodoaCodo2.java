//yjseijas 02-06-2017   -    04-02-2017
package subtecodoacodo2;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class SubteCodoaCodo2 {
   public int estado01 = 0,veces = 0,estado03 = 0,estacionini = 0,
           estacionfin = 0;
   public String[] VectorEstaciones = {"Las Heras","Santa Fe","Córdoba","Corrientes",
       "Once","Venezuela","Humberto","Inclán","Caseros","Parque Patricios","Hospitales" };
   //   public Ventana paraelpanel = new Ventana();
   public SubteCodoaCodo2(){
     }
   public void acciones(Ventana visor,ActionEvent evt){
   //     int seleccion = 0;
        String estacion = "",respuesta = "";
        boolean continuar = true;
        Object clicado = evt.getSource();
        veces = veces + 1;
        if(clicado == visor.estaciones.lasheras) {
            if (estado01 == 0) {
                estacionini = 0;
                visor.estaciones.lasheras.setEnabled(false);
            } else {
                estado01 = 2;
                estacionfin = 0;                
                visor.estaciones.lasheras.setBackground(java.awt.Color.yellow);
            }
            estacion = "Las heras";      
        }
         if(clicado == visor.estaciones.santafe) {
            if (estado01 == 0) {
                estacionini = 1;
                visor.estaciones.santafe.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 1;        
                visor.estaciones.santafe.setBackground(java.awt.Color.yellow);

            }
            estacion = "Santa fe";
        }
         if(clicado == visor.estaciones.cordoba) {
            if (estado01 == 0) {
                estacionini = 2;
                visor.estaciones.cordoba.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 2;        
                visor.estaciones.cordoba.setBackground(java.awt.Color.yellow);
            }
            estacion = "Córdoba";
        }
         if(clicado == visor.estaciones.corrientes) {
            if (estado01 == 0) {
                estacionini = 3;
                visor.estaciones.corrientes.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 3;        
                visor.estaciones.corrientes.setBackground(java.awt.Color.yellow);
            }
            estacion = "Corrientes";
        }
         if(clicado == visor.estaciones.once) {
            if (estado01 == 0) {
                estacionini = 4;
                visor.estaciones.once.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 4;        
                visor.estaciones.once.setBackground(java.awt.Color.yellow);
            }
           estacion = "Once";
         }
         if(clicado == visor.estaciones.venezuela) {
            if (estado01 == 0) {
                estacionini = 5;
                visor.estaciones.venezuela.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 5;
                visor.estaciones.venezuela.setBackground(java.awt.Color.yellow);
            }
           estacion = "Venezuela";
         }
         if(clicado == visor.estaciones.humberto) {
            if (estado01 == 0) {
                estacionini = 6;
                visor.estaciones.humberto.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 6;
                visor.estaciones.humberto.setBackground(java.awt.Color.yellow);
            }
           estacion = "Humberto";
         }
         if(clicado == visor.estaciones.inclan) {
            if (estado01 == 0) {
                estacionini = 7;
                visor.estaciones.inclan.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 7;
                visor.estaciones.inclan.setBackground(java.awt.Color.yellow);
            }
            estacion = "Inclán";
         }
         if(clicado == visor.estaciones.caseros) {
            if (estado01 == 0) {
                estacionini = 8;
                visor.estaciones.caseros.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 8;  
                visor.estaciones.caseros.setBackground(java.awt.Color.yellow);
            }
            estacion = "Caseros";
        }
         if(clicado == visor.estaciones.parquepatricios) {
            if (estado01 == 0) {
                estacionini = 9;
                visor.estaciones.parquepatricios.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 9;
                visor.estaciones.parquepatricios.setBackground(java.awt.Color.yellow);
            }
           estacion = "parquepatricios";
         }
         if(clicado == visor.estaciones.hospitales) {
            if (estado01 == 0) {
                estacionini = 10;
                visor.estaciones.hospitales.setEnabled(false);
            }else {
                estado01 = 2;
                estacionfin = 10; 
                visor.estaciones.hospitales.setBackground(java.awt.Color.yellow); 
            }
           estacion = "Hospitales";
         }
         if (estado01 == 0) {
           visor.panelmensaje.setVisible(false);
 //          visor.panelmensaje.repaint();
 //          visor.panelmensaje.setSize(80,70);
  //          visor.add(panelmensaje02);
            visor.panelmensaje02.add(new JLabel("Por Favor Indique Estación a la que se Dirije.",
                  JLabel.CENTER));      
           estado01 = 1;
        } 
        if (estado01 == 2 && veces == 2) {
             visor.panelmensaje02.setVisible(false);
            while(continuar) {
                 try{
                  Thread.sleep(1200);
                 }catch(InterruptedException e){}   
                respuesta = 
                 JOptionPane.showInputDialog(null,"El tren ha llegado, las puertas se han abierto. Desea subir al vagón?");
            if (respuesta.equalsIgnoreCase("S")){
                continuar = false;
                }else{
                    JOptionPane.showMessageDialog(null,"Las puertas se han cerrado. Espere otro tren.");
                }
            }
            if(estacionini < estacionfin){
                for(int repetir = estacionini; repetir <= estacionfin;repetir++){ 
                    JOptionPane.showMessageDialog(null,"Ud se encuentra en la estación " +
                       VectorEstaciones[repetir]); 
                try{
                  Thread.sleep(1000);   
                  }catch(InterruptedException e){} 
                }
            } else {
               for(int repetir = estacionini; repetir >= estacionfin;repetir--){                   
                    JOptionPane.showMessageDialog(null,"Ud se encuentra en la estación " +
                       VectorEstaciones[repetir]); 
                try{
                  Thread.sleep(1000);   
                  }catch(InterruptedException e){}   
                }
            }
         JOptionPane.showMessageDialog(null,"Ud ha llegado a su destino, Gracias por viajar con Codo a Codo!"   );             
         System.exit(0);
         } 
       
}
    public static void main(String[] args) {
        new Ventana();
    }
    
}
 