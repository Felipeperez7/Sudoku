/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontema04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase conendrá los métodos necesarios para ejecutar el programa
 * @author Felipe
 */
public class Principal {
    private Sudoku sudoku;
    private int opcion;
    private Scanner teclado;
    
    /**
     * Constructor por defecto
     */
    public Principal() 
    {
        sudoku = new Sudoku();
        opcion = 0;
        teclado = new Scanner(System.in);
    }
    
    /**
     * Mostrará el menú
     */
    private void mostrarMenu()
    {
        System.out.println("1. Crear sudoku");
        System.out.println("2. Insertar elemento");
        System.out.println("3. Eliminar elemento");
        System.out.println("0. Salir");
    }
    
    /**
     * Gestiona cada una de las opciones del menú
     * @throws SudokuException Lanza la excepción SudokuException
     */
    private void gestionarOpciones() throws SudokuException
    {
        switch (opcion)
        {
            case 0:
                System.out.println("Gracias por jugar");
                break;
            case 1:
                this.opcion1();
                break;
            case 2:
                this.opcion2();
                break;
            case 3:
                this.opcion3();
                break;
            default:
                System.out.println("Esa opción no está contemplada en el meú");
                break;
        }
    }
    
    /**
     * Gestiona la opción 1
     */
    private void opcion1()
    {
        sudoku.inicializar();
    }
    
    /**
     * Gestiona la opción 2
     * @throws SudokuException Lanza la excepción SudokuException
     */
    private void opcion2() throws SudokuException
    {
        System.out.println("Indica la fila");
        int fila = teclado.nextInt();
        System.out.println("Indica la columna");
        int columna = teclado.nextInt();
        System.out.println("Indica el elemento que vas a introducir");
        int elemento = teclado.nextInt();
        
        sudoku.modificarElemento(fila, columna, elemento);
    }
    
    /**
     * Gestiona la opción 3
     */
    private void opcion3()
    {
        System.out.println("Indica la fila");
        int fila = teclado.nextInt();
        System.out.println("Indica la columna");
        int columna = teclado.nextInt();
        
        sudoku.vaciarElemento(fila, columna);
    }
    
    /**
     * Ejecuta la clase
     * @throws SudokuException Lanza la excepción SudokuException 
     */
    public void ejecutar() throws SudokuException 
    {
        do
        {
            try
            {
                this.mostrarMenu();
                System.out.println("Elige una opción");
                opcion = teclado.nextInt();
                this.gestionarOpciones();
            }
            catch (InputMismatchException e)
            {
                System.out.println("La opción debe ser un número");
            }
        } while (opcion != 0);
    }
}
