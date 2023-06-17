
package Ejercicio1_Guia12_Extra;

import Ejercicio1_Guia12_Extra_entidades.Alquiler;
import Ejercicio1_Guia12_Extra_entidades.Barco;
import Ejercicio1_Guia12_Extra_entidades.BarcoMotor;
import Ejercicio1_Guia12_Extra_entidades.Velero;
import Ejercicio1_Guia12_Extra_entidades.Yate;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Barcos_Main_JobOptions {

    
    public static void main(String[] args) {
        Barco barco = new Barco("X1234", 20.2, 2001);
        Velero velero = new Velero("V1234", 15.5, 2000, 3);
        BarcoMotor barcom = new BarcoMotor("Y1234", 25.5, 2010,500);
        Yate yate = new Yate("Z1234", 35.3, 2015, 500,5);
          
        Alquiler alq = new Alquiler("Jose Gomez", "12345678", LocalDate.of(2023, 6, 15),
                LocalDate.of(2023, 6, 20), 1, barco);
        Alquiler alq1 = new Alquiler("Jose Guzman", "34567890", LocalDate.of(2023, 6, 16),
                LocalDate.of(2023, 7, 30), 3, barcom);
        Alquiler alq2 = new Alquiler("Jose Garcia", "23456789", LocalDate.of(2023, 6, 16),
                LocalDate.of(2023, 6, 24), 2, velero);
        Alquiler alq3 = new Alquiler("Jose Esteves", "45678901", LocalDate.of(2023, 6, 20),
                LocalDate.of(2023, 7, 30), 4, yate);
        
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        
        do {
            String opc = JOptionPane.showInputDialog(null, "Que tipo de barco desea alquilar?\n"
                    + "1. Barco Comun " + "\n"
                    + "2. Barco a Motor " + "\n"
                    + "3. Yate " + "\n"
                    + "4. Velero " + "\n"
                    + "5. Salir " + "\n", "MENU", JOptionPane.PLAIN_MESSAGE);

            int num = Integer.parseInt(opc);
        switch (num) {

                case 1:
                    JOptionPane.showMessageDialog(null, barco.toString()+"\n> Precio final del alquiler: $  " + alq.calcularPrecioAlquiler(), "Informacion ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, barcom.toString()+"\n> Precio final del alquiler: $  " + alq1.calcularPrecioAlquiler(), "Informacion ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, yate.toString()+"\n> Precio final del alquiler: $  " + alq2.calcularPrecioAlquiler(), "Informacion ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, velero.toString()+"\n> Precio final del alquiler: $  " + alq3.calcularPrecioAlquiler(), "Informacion ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Hasta Luego !! ", "Informacion ", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta. Vuelva a intentarlo !! ", "Error", JOptionPane.INFORMATION_MESSAGE);
                    break;

            }

        } while (true);

    }
    
}