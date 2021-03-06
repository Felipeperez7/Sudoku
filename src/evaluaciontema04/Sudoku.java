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
        sudoku.get(0).set(0, 5);
        sudoku.get(0).set(5, 3);
        sudoku.get(0).set(7, 1);
        sudoku.get(1).set(4, 7);
        sudoku.get(1).set(6, 3);
        sudoku.get(2).set(2, 8);
        sudoku.get(2).set(3, 4);
        sudoku.get(2).set(7, 2);
        sudoku.get(3).set(2, 9);
        sudoku.get(4).set(3, 9);
        sudoku.get(4).set(4, 3);
        sudoku.get(5).set(0, 4);
        sudoku.get(5).set(1, 7);
        sudoku.get(5).set(4, 1);
        sudoku.get(5).set(6, 6);
        sudoku.get(5).set(7, 8);
        sudoku.get(6).set(6, 2);
        sudoku.get(6).set(7, 3);
        sudoku.get(7).set(2, 2);
        sudoku.get(7).set(8, 6);
        sudoku.get(8).set(1, 3);
        sudoku.get(8).set(4, 8);
        sudoku.get(8).set(6, 7);
        sudoku.get(8).set(8, 4);
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
        if(!this.puedoInsertar(fila, columna, elemento))
            throw new SudokuException ("No puedes introducir ese elemento");
        else
            sudoku.get(fila).set(columna, elemento);
        
    }

    /**
     * Elimina un elemento del Sudoku, si se puede
     * @param fila Indica la fila del Sudoku
     * @param columna Indica la columna del Sudoku
     */
    public void vaciarElemento(int fila, int columna)
    {
        sudoku.get(fila).set(columna, 0);
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
        for (int i = 0; i < 9; i++) 
        {
            if (sudoku.get(fila).get(i).equals(elemento))
                resultado = false;
        }
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
        for (int i = 0; i < 9; i++) 
        {
            if (sudoku.get(i).get(columna).equals(elemento))
                resultado = false;
        }
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
        boolean resultado = true;
        if(this.comprobarColumna(columna, elemento) && this.comprobarFila(fila, elemento) && this.comprobarCuadrante(fila, columna, elemento))
            resultado = false;
        return resultado;
    }
}
