package ISO;

import java.awt.EventQueue;
import java.io.FileNotFoundException;

import org.EnvioDeMensajes.Presentacion.*;
public class Ejecutar {
	
	
	
		public static void main(String[]args) throws FileNotFoundException {
	    
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						EnviarMensaje window = new EnviarMensaje();
						window.getFrame().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}


