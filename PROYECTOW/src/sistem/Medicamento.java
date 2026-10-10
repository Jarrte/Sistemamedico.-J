/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

public class Medicamento {

    private String nombre;
    private String codigo;
    private int cantidad;
    private int stockMinimo;

    public Medicamento(String nombre, String codigo, int cantidad, int stockMinimo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.stockMinimo = 10;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public boolean stockBajo() {
        return cantidad <= stockMinimo;
    }

    public void mostrarMedicamento() {
        System.out.println("--- MEDICAMENTO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Cantidad disponible: " + cantidad);
        System.out.println("Stock minimo: " + stockMinimo);

        if (stockBajo()) {
            System.out.println("ALERTA, EL STOCK ESTA BAJO");
        } else {
            System.out.println("Stock suficiente");
        }
    }
}
