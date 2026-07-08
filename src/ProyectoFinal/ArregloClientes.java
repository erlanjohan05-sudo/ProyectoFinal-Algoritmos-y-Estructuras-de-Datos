package ProyectoFinal;

public class ArregloClientes {
    
    private Cliente[] lista;
    private int contador;

    public ArregloClientes() {
        lista = new Cliente[50];
        contador = 0;
    }

    public void agregar(Cliente c) {
        if (contador == lista.length) {
            aumentarCapacidad();
        }

        lista[contador] = c;
        contador++;
    }

    private void aumentarCapacidad() {
        Cliente[] nuevaLista = new Cliente[lista.length * 2];

        for (int i = 0; i < lista.length; i++) {
            nuevaLista[i] = lista[i];
        }

        lista = nuevaLista;
    }

    public int tamaño() {
        return contador;
    }

    public Cliente obtener(int i) {
        return lista[i];
    }

    public Cliente buscarPorDni(String dniBusqueda) {
        for (int i = 0; i < contador; i++) {
            Cliente c = lista[i];

            if (c.getDni().equals(dniBusqueda)) {
                return c;
            }
        }

        return null;
    }

    public boolean eliminarPorDni(String dniBusqueda) {
        for (int i = 0; i < contador; i++) {
            Cliente c = lista[i];

            if (c.getDni().equals(dniBusqueda)) {

                for (int j = i; j < contador - 1; j++) {
                    lista[j] = lista[j + 1];
                }

                lista[contador - 1] = null;
                contador--;

                return true;
            }
        }

        return false;
    }

    public boolean actualizarCliente(String dniBusqueda, String nombres, String apellidos, String telefono, String direccion) {
        Cliente c = buscarPorDni(dniBusqueda);

        if (c != null) {
            c.setNombres(nombres);
            c.setApellidos(apellidos);
            c.setTelefono(telefono);
            c.setDireccion(direccion);
            return true;
        }

        return false;
    }

    public boolean existeDni(String dniBusqueda) {
        return buscarPorDni(dniBusqueda) != null;
    }
}