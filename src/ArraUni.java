import javax.swing.*;

public class ArraUni extends methods {
    // operaciones
    //orden: DECLARACION, RELLENADO,
    // MOSTRAR ARREGLO, MOSTRAR DATO,
    // MODIFICAR ELEMENTO, ELIMINAR ELEMENTO,
    // CANTIDAD DE ELEMENTOS, ORDENAR, SUMAR, RELLENAR
    // MOSTRAR ORDENADOS, MOSTRAR RELLENADOS

    // Declaracion del Arreglo
    private int unidimensional[] = new int[10];
    private int i;
    private int index;
    private int modified;
    private int remove = 0;

    // Rellenado
    @Override
    public void RellenadoManual() {
        i = 0;
        while (i < 10) {
            unidimensional[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingresa los valores del arreglo"));
            i++;
        }
    }

    // Mostrar arreglo
    @Override
    public void MostrarDatos() {
        System.out.print("Los datos del arreglo sin ordenar son: \n");
        // ciclo para mostrar arreglo
        for (i = 0; i < 10; i++) {
            System.out.print(unidimensional[i] + "-");
        }
    }

    // Acceder a un valor del arreglo
    @Override
    public void AccederValor() {
        index = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa la posision del dato que quieres conocer:"));

        System.out.println("\n El valor es: " + unidimensional[index - 1]);
    }

    // Modificar Elemento
    @Override
    public void ModificarValor() {
        index = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese la posision del dato que quiere modificar;"));
        modified = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el dato nuevo"));
        System.out.println("\n Posision modificada: " + index + "\n Dato nuevo: " + modified);
        unidimensional[index-1] = modified;
        System.out.println("Arreglo Modificado: ");
        // ciclo para mostrar arreglo
        for (i = 0; i < 10; i++) {
            System.out.print(unidimensional[i] + "-");
        }
    }

    // Eliminar Elemento (no recorre posision, solo deja en blanco)
    @Override
    public void EliminarElemento() {
        index = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa la posision que quieres eliminar"));
        unidimensional[index-1] = remove;

        System.out.println("\n Arreglo con valor eliminado");
        // ciclo para mostrar arreglo
        for (i = 0; i < 10; i++) {
            System.out.print(unidimensional[i] + "-");
        }
    }
    // Eliminar Elemento (En posision con recorrido)


    @Override
    public void EliminarElementoRecorrido() {
        index = Parse
    }
}
