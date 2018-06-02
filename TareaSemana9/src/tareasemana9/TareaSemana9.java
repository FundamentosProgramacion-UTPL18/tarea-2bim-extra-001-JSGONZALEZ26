/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasemana9;

/**
 *
 * @author Jairo
 */
public class TareaSemana9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String meses[] = {"Agosto", "Octubre", "Diciembre"};
        String sucursales[] = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double ventas_mes_1[] = {4500.2, 5500.2, 6500.2, 2500.1};
        double ventas_mes_2[] = {1500.2, 2500.2, 3500.2, 1500.1};
        double ventas_mes_3[] = {2300.2, 1200.2, 4700.2, 3200.1};
        double venta_total_sucursal[] = new double[4];
        double venta_promedio_sucursal[] = new double[4];
        double ventas_Totales_Sucursales = 0;

        for (int i = 0; i < venta_promedio_sucursal.length; i++) {
            venta_total_sucursal[i] = ventas_mes_1[i] + ventas_mes_2[i] + ventas_mes_3[i];
            venta_promedio_sucursal[i] = venta_total_sucursal[i] / 3;
            ventas_Totales_Sucursales += venta_total_sucursal[i];
        }
        System.out.println("Reporte\n");
        for (int i = 0; i <= 0; i++) {
            System.out.printf("\t\t%s\t\t%s\t\t%s\tTotal\t\tPromedio\n\n", meses[i], meses[i + 1], meses[i + 2]);
        }
        for (int i = 0; i < venta_promedio_sucursal.length; i++) {
            System.out.printf("%s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n", sucursales[i], ventas_mes_1[i], ventas_mes_2[i], ventas_mes_3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]);
        }
        System.out.printf("\nTotales de ventas de todas las sucursales es: %.1f\n",ventas_Totales_Sucursales);
    }

}
