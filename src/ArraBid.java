import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

// Array bidimensional
public class ArraBid extends methods{

    // operaciones
    //orden: DECLARACION, RELLENADO,
    // MOSTRAR ARREGLO, MOSTRAR DATO,
    // MODIFICAR ELEMENTO, ELIMINAR ELEMENTO,
    // CANTIDAD DE ELEMENTOS, ORDENAR, SUMAR, RELLENAR
    // MOSTRAR ORDENADOS, MOSTRAR RELLENADOS

    private int bidimensional[][] = new int[3][3];
    private int i;
    private int j;
    private int indexFila;
    private int indexColumna;
    private int modified;
    private int remove = 0;
    private int suma;
    private int Rellenado;

    // Rellenado
    @Override
    public void RellenadoManual() {
        i = 0; // fila
        while (i < 3) {
            j = 0; // columna
            while (j < 3) {
                bidimensional[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa los datos: "));
                j++;
            }
            i++;
        }
    }


    //Mostrar datos de la matriz
    @Override
    public void MostrarDatos() {
        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("La matriz es la siguiente: ");
        // ciclo para mostrar la matriz
        for ( i = 0; i < bidimensional.length; i++) {
            System.out.println(Arrays.toString(bidimensional[i]));
        }
    }

    // Acceder a un valor del arreglo
    @Override
    public void AccederValor() {
        indexFila = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingrese el numero de fila para acceder al valor"));
        indexColumna = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingresa la columna de la fila para acceder al valor"));

        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("El valor es: " + bidimensional[indexFila-1][indexColumna-1]);
    }

    // Modificar Elemento

    @Override
    public void ModificarValor() {
        indexFila = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingrese el numero de fila para modificar"));
        indexColumna = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingresa la columna de la fila para modificar"));
        modified = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo valor"));

        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("Posision Modificada: " + "\n Fila: " + indexFila
                + " Columna: " + indexColumna + " \n Nuevo valor: " + modified);
        bidimensional[indexFila-1][indexColumna-1] = modified;

        for ( i = 0; i < bidimensional.length; i++) {
            System.out.println(Arrays.toString(bidimensional[i]));
        }
    }

    //Eliminar elemento
    @Override
    public void EliminarElemento() {
        indexFila = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingrese el numero de fila que quieres eliminar"));
        indexColumna = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingresa la columna de la fila que quieres eliminar"));
        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("Arreglo con valor eliminado");
        bidimensional[indexFila-1][indexColumna-1] = remove;
        for ( i = 0; i < bidimensional.length; i++) {
            System.out.println(Arrays.toString(bidimensional[i]));
        }
    }

    //Eliminar elemento ( Posision con recorrido )


    @Override
    public void EliminarElementoRecorrido() {
        indexFila = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingrese el numero de fila que quieres eliminar"));
        indexColumna = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Ingresa la columna de la fila que quieres eliminar"));
        int bidimensionalNew[][] = new int[3][3];

        for ( i = 0; i < bidimensional.length; i++) {
            int k = 0; // índice para el nuevo arreglo
            for ( j = 0; j < bidimensional[i].length; j++) {
                if (!(i == indexFila && j == indexColumna)) { // saltamos el elemento a eliminar
                    bidimensionalNew[i][k] = bidimensional[i][j];
                    k++;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("\n Arreglo con valor eliminado");
        for ( i = 0; i < bidimensional.length; i++) {
            System.out.println(Arrays.toString(bidimensionalNew[i]));
        }
    }

    // Cantidad de elementos del array
    @Override
    public void CantidadElementos() {
        for ( i = 0; i < bidimensional.length; i++) {
            System.out.println(Arrays.toString(bidimensional[i]));
        }
        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("La cantidad de elementos de la matriz es: " + bidimensional.length * bidimensional.length);
    }

    // ordenar y mostrar ordenados

    @Override
    public void Ordenar() {
        int ordenado[] = new int[bidimensional.length * bidimensional.length];
        int ordenarValores = 0;
        for(i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                ordenado[ordenarValores++] = bidimensional[i][j];
            }
        }

        Arrays.sort(ordenado);
        ordenarValores = 0;
        for(i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                bidimensional[i][j] = ordenado[ordenarValores++];
            }
        }
        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("Matriz Ordenada");
        for ( i = 0; i < bidimensional.length; i++) {
            System.out.println(Arrays.toString(bidimensional[i]));
        }
    }

    // Sumar array


    @Override
    public void Suma() {
        int arregloPlanoSumar[] = new int[bidimensional.length * bidimensional.length];
        int ordenarValores = 0;
        for(i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                arregloPlanoSumar[ordenarValores++] = bidimensional[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        suma = Arrays.stream(arregloPlanoSumar).sum();
        System.out.println("La suma es: " + suma);
    }

    @Override
    public void RellenadoAutomatico() {
        Rellenado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor con el que la quieres rellenar: "));
        i = 0; // fila
        while (i < 3) {
            j = 0; // columna
            while (j < 3) {
                bidimensional[i][j] = Rellenado;
                j++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Resultado mostrado en consola" );
        System.out.println("Matriz Rellenada");
        for ( i = 0; i < bidimensional.length; i++) {
            System.out.println(Arrays.toString(bidimensional[i]));
        }
    }
}
