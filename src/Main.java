import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        ArraUni ArrayUnidimensional = new ArraUni();
        ArraBid ArrayBidimensional = new ArraBid();
        int opcionArreglo;
        int menu;
        String opciones[] = {"Unidimensional", "Multidimensional"};

        /* try {
        }
        catch (Exception e){
            System.out.println("Intentalo de nuevo, Solo ingresa uno de los valores solicitados disponibles");
            return;
        } */

        try {
            menu = JOptionPane.showOptionDialog(
                    null,
                    "Selecciona el tipo de arreglo:",
                    "Arreglos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (menu == 0){
                ArrayUnidimensional.RellenadoManual();
                JOptionPane.showMessageDialog(null, "Arreglo llenado correctamente");
                String opcionesUnidimensional[] = {"1","2","3","4","5","6","7","8","9"};
                int menu2 = JOptionPane.showOptionDialog(
                        null,
                        "Selecciona el tipo de arreglo: \n" +
                                "1. Mostrar Arreglo\n" +
                                "2. Acceder a un valor\n" +
                                "3. Modificar un Valor\n" +
                                "4. Eliminar un elemento (0)\n" +
                                "5. Eliminar Elemento(Recorrido)\n" +
                                "6. Cantidad de elementos del Arreglo\n" +
                                "7. Ordenar Arreglo\n" +
                                "8. Sumar arreglo\n" +
                                "9. Llenado automático",
                        "Arreglos",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesUnidimensional,
                        opcionesUnidimensional[0]
                );
            switch (menu2){
                case 0: //mostrar arreglo
                    ArrayUnidimensional.MostrarDatos();
                    break;
                case 1: // acceder a valor
                    ArrayUnidimensional.AccederValor();
                    break;
                case 2: // modificar valor
                    ArrayUnidimensional.ModificarValor();
                    break;
                case 3: // eliminar elemento con 0
                    ArrayUnidimensional.EliminarElemento();
                    break;
                case 4: // eliminar elemento con recorrido
                    ArrayUnidimensional.EliminarElementoRecorrido();
                    break;
                case 5: //cantidad de elementos
                    ArrayUnidimensional.CantidadElementos();
                    break;
                case 6: // ordenar arreglo
                    ArrayUnidimensional.Ordenar();
                    break;
                case 7: // Sumar arreglo
                    ArrayUnidimensional.Suma();
                    break;
                case 8: // llenado automatico
                    ArrayUnidimensional.RellenadoAutomatico();
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                break;
            }

            } else{
                ArrayBidimensional.RellenadoManual();
                JOptionPane.showMessageDialog(null, "Arreglo llenado correctamente");
                String opcionesMultidimensional[] = {"1","2","3","4","5","6","7","8","9"};
                int menu2 = JOptionPane.showOptionDialog(
                        null,
                        "Selecciona el tipo de arreglo:" +
                                "1. Mostrar Arreglo\n" +
                                "2. Acceder a un valor\n" +
                                "3. Modificar un Valor\n" +
                                "4. Eliminar un elemento (0)\n" +
                                "5. Eliminar Elemento(Recorrido)\n" +
                                "6. Cantidad de elementos del Arreglo\n" +
                                "7. Ordenar Arreglo\n" +
                                "8. Sumar arreglo\n" +
                                "9. Llenado automático",
                        "Arreglos",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcionesMultidimensional,
                        opcionesMultidimensional[0]
                );
                switch (menu2){
                    case 0: //mostrar arreglo
                        ArrayBidimensional.MostrarDatos();
                        break;
                    case 1: // acceder a valor
                        ArrayBidimensional.AccederValor();
                        break;
                    case 2: // modificar valor
                        ArrayBidimensional.ModificarValor();
                        break;
                    case 3: // eliminar elemento con 0
                        ArrayBidimensional.EliminarElemento();
                        break;
                    case 4: // eliminar elemento con recorrido
                        ArrayBidimensional.EliminarElementoRecorrido();
                        break;
                    case 5: //cantidad de elementos
                        ArrayBidimensional.CantidadElementos();
                        break;
                    case 6: // ordenar arreglo
                        ArrayBidimensional.Ordenar();
                        break;
                    case 7: // Sumar arreglo
                        ArrayBidimensional.Suma();
                        break;
                    case 8: // llenado automatico
                        ArrayBidimensional.RellenadoAutomatico();
                        break;
                    default:
                        System.out.println("Ingresa una opcion valida");
                        break;
                }

            }
        }
        catch (Exception e){
            System.out.println("Intentalo de nuevo, Solo ingresa uno de los valores solicitados disponibles");
            return;
        }
        //ArrayUnidimensional.RellenadoManual();
        //ArrayUnidimensional.MostrarDatos();
        //ArrayUnidimensional.AccederValor();
        //ArrayUnidimensional.ModificarValor();
        //ArrayUnidimensional.EliminarElemento();
        //ArrayUnidimensional.EliminarElementoRecorrido();
        //ArrayUnidimensional.CantidadElementos();
        //ArrayUnidimensional.Ordenar();
        //ArrayUnidimensional.Suma();
        //ArrayUnidimensional.RellenadoAutomatico();

        //ArrayBidimensional.RellenadoManual();
        //ArrayBidimensional.MostrarDatos();
        //ArrayBidimensional.AccederValor();
        //ArrayBidimensional.ModificarValor();
        //ArrayBidimensional.EliminarElemento();
        //ArrayBidimensional.EliminarElementoRecorrido();
        //ArrayBidimensional.CantidadElementos();
        //ArrayBidimensional.Ordenar();
        //ArrayBidimensional.Suma();
        //ArrayBidimensional.RellenadoAutomatico();
    }
}