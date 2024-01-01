package Ejercicio2;

import javax.swing.*;

public class DetalleDeFacturaDialog {
    public static void main(String[] args) {
        String nombreFactura = JOptionPane.showInputDialog("Ingrese el nombre de la factura:");

        double precio1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del primer producto:"));
        double precio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del segundo producto:"));

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;


        String mensaje = "La factura " + nombreFactura + " tiene un total bruto de " + totalBruto + ", con un " +
                "impuesto de " + impuesto + " y el monto después de impuesto es de " + totalNeto;

        JOptionPane.showMessageDialog(null, mensaje);


    }
}
