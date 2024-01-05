package com.santiagoarielv98.curso.e23proyectoAlmacen;

public class Almacen {
    Cliente[] clientes;
    Vendedor[] vendedores;

    public Almacen(){
        clientes = new Cliente[10];
        vendedores = new Vendedor[10];
    }

    public void agregarCliente(Cliente cliente){
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] == null){
                clientes[i] = cliente;
                break;
            }
        }
    }

    public void agregarVendedor(Vendedor vendedor){
        for(int i = 0; i < vendedores.length; i++){
            if(vendedores[i] == null){
                vendedores[i] = vendedor;
                break;
            }
        }
    }

    public void mostrarClientes(){
        for(Cliente cliente : clientes){
            if(cliente != null){
                System.out.println(cliente);
            }
        }
    }

    public void mostrarVendedores(){
        for(Vendedor vendedor : vendedores){
            if(vendedor != null){
                System.out.println(vendedor);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Almacén{");
        sb.append("clientes=[");
        this.mostrarClientes();
        sb.append("], vendedores=[");
        this.mostrarVendedores();
        sb.append("]}");
        return sb.toString();
    }
}
