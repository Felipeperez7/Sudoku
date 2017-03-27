/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontema04;

/**
 * Esta clase ejecutará el programa
 * @author Felipe
 * @version 1.0
 */
public class EvaluacionTema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Sudoku sudoku = new Sudoku();
        sudoku.inicializar();
        System.out.println(sudoku.toString());
    }
    
}
