/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontema04;

import java.util.ArrayList;

/**
 * Esta clase contiene los métodos necesarios para el Sudoku
 * @author Felipe
 * @version 2.1
 */
public class Sudoku 
{
    private ArrayList<ArrayList<Integer>> sudoku;
    
    /**
     * Constructor por defecto
     */
    public Sudoku()
    {
        sudoku = new ArrayList<>();
    }
    
    /**
     * Inicializa un Sudoku
     */
    public void inicializar()
    {
        for (int i = 0; i < 9; i++) 
        {
            ArrayList<Integer> filas = new ArrayList<>();
            for (int j = 0; j < 9; j++) 
            {
                filas.add(0);
            }
            sudoku.add(filas);
            
        }
        sudoku.get(0).set(3, 8);
        System.out.println(sudoku.get(0));
        System.out.println(sudoku.get(0).get(3));
    }
    
    /**
     * Formatea el Sudoku para mostrarlo por pantalla
     * @return Muestra por pantalla el Sudoku
     */
    @Override
    public String toString()
    {
        String resultadoFinal = "";
    
        for (int i = 0; i < 9; i++) 
        {
            switch (i)
            {
                case 0:
                    resultadoFinal +="-----------------" + "\n";
                    break;
                case 3:
                    resultadoFinal +="\n" + "-----------------" + "\n";
                    break;
                case 6:
                    resultadoFinal +="\n" + "-----------------" + "\n";
                    break;
                default:
                    resultadoFinal += "\n";
                    break;
            }
            for (int j = 0; j < 9; j++) 
            {
                String numeros = "";
                
                if (sudoku.get(i).get(j) == 0)
                    numeros = "-";
                else
                    numeros = String.valueOf(sudoku.get(i).get(j));
                
                switch (j)
                {
                    case 0:
                        resultadoFinal += "||" + numeros;
                        break;
                    case 2:
                        resultadoFinal += numeros + "||";
                        break;
                    case 5:
                        resultadoFinal += numeros + "||";
                        break;
                    case 8:
                        resultadoFinal += numeros + "||";
                        break;
                    default:
                        resultadoFinal += numeros;
                        break;
                }
            }
        }
        resultadoFinal +="\n" + "-----------------" + "\n";
        return resultadoFinal;
    }
    
    /**
     * Modifica un elemento del Sudoku, si se puede
     * @param fila Indica la fila del Sudoku
     * @param columna Indica la columna del Sudoku
     * @param elemento Indica el número que queremos poner
     * @throws SudokuException Lanza la exzepción SudokuException
     */
    public void modificarElemento(int fila, int columna, int elemento) throws SudokuException
    {

    }

    /**
     * Elimina un elemento del Sudoku, si se puede
     * @param fila Indica la fila del Sudoku
     * @param columna Indica la columna del Sudoku
     */
    public void vaciarElemento(int fila, int columna)
    {

    }
    
    /**
     * Comprobará si un elemento no está repetido en una fila del Sudoku
     * @param fila Indica la fila del Sudoku
     * @param elemento Indica el número a comprobar
     * @return Debuelve false si el elemento está repetido y true si no lo está
     */
    private boolean comprobarFila(int fila, int elemento)
    {
        boolean resultado = true;
        return resultado;
    }
    
    /**
     * Comprueba si un elemento no está repetido en una columna des Sudoku
     * @param columna Indica la columna del Sudoku
     * @param elemento Indica el número a comprobar
     * @return Debuelve flase si el elemento está repetido y true si no lo está
     */
    private boolean comprobarColumna(int columna, int elemento)
    {
        boolean resultado = true;
        return resultado;
    }
    
    /**
     * Comprueba si un elemento no está repetido en el cuadrante del Sudoku al que pertenece
     * @param fila Indica la fila del Sudoku
     * @param columna Indica la columna del Sudoku
     * @param elemento Indica el número a comprobar
     * @return Debuelve flase si el elemento está repetido y true si no lo está
     */
    private boolean comprobarCuadrante(int fila, int columna, int elemento)
    {
        boolean resultado = true;

        return resultado;
    }
    
    /**
     * Comprobará si se puede insertar un elemento en una posición del Sudoku
     * @param fila Indica la fila de Sudoku
     * @param columna Indica la columna del Sudoku
     * @param elemento Indica el número a comprobar
     * @return Debuelve flase si el elemento está repetido y true si no lo está
     */
    private boolean puedoInsertar(int fila, int columna, int elemento)
    {
    boolean resultado = false;
    return resultado;
    }
}
