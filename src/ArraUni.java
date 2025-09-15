import javax.swing.*;
import java.util.Arrays;

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
    private int suma;
    private int Rellenado;

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
        System.out.println(Arrays.toString(unidimensional));
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
        // Muestra el arreglo
        System.out.println(Arrays.toString(unidimensional));
    }

    // Eliminar Elemento (no recorre posision, solo deja en blanco)
    @Override
    public void EliminarElemento() {
        index = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingresa la posision que quieres eliminar"));
        unidimensional[index-1] = remove;

        System.out.println("\n Arreglo con valor eliminado");
        System.out.println(Arrays.toString(unidimensional));
    }

    // Eliminar Elemento (En posision con recorrido)
    @Override
    public void EliminarElementoRecorrido() {
        index = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "Ingresa la posision del elemento que quieres eliminar"));
        int unidimensionalNew[] = new int[unidimensional.length - 1];
        System.arraycopy(unidimensional, 0, unidimensionalNew, 0, index - 1);
        System.arraycopy(unidimensional, index , unidimensionalNew , index - 1, unidimensional.length - index);
        System.out.println(Arrays.toString(unidimensionalNew));
    }

    // Cantidad de de elementos del array
    @Override
    public void CantidadElementos() {
        System.out.println(Arrays.toString(unidimensional));
        System.out.println("La cantidad de elementos del array es: " + unidimensional.length);
    }

    // ordenar y mostrar ordenados
    @Override
    public void Ordenar() {
        Arrays.sort(unidimensional);
        System.out.println("Array ordenado: ");
        System.out.print(Arrays.toString(unidimensional));
    }

    // Sumar array
    @Override
    public void Suma() {
        suma = Arrays.stream(unidimensional).sum();
        System.out.println("La suma es: " + suma);
    }

    // Rellenado automatico con fill
    @Override
    public void RellenadoAutomatico() {
        Rellenado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor con que lo quieres rellenar;"));
        Arrays.fill(unidimensional, Rellenado);
        System.out.println(Arrays.toString(unidimensional));
    }
}
