/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontema04;

/**
 * Clase que crea la excepción SudokuException
 * Esta clase hereda de la clase Exception
 * @author Felipe
 * @version 1.0
 * @see Exception
 */
public class SudokuException extends Exception
{
    /**
     * Constructor por parámetros 
     * @param mensaje Mensaje que mostrará la excepción
     */
    public SudokuException (String mensaje)
    {
        super(mensaje);
    }
}
