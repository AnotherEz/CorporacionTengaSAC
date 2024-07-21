package EstructurasDatos;

import Clases.Cliente;
import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private Cliente cliente;
    private List<Producto> productos;

    public CarritoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCodigo().equals(producto.getCodigo())) {
                p.setCantidad(p.getCantidad() + producto.getCantidad());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            productos.add(producto);
        }
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    public float calcularTotal() {
        float total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    // Getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "CarritoDeCompras{" +
                "cliente=" + cliente +
                ", productos=" + productos +
                '}';
    }
}
