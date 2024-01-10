/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorprogram;
/**
 *
 * @author LENOVO
 */
public class CalculatorProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Kalkulator().setVisible(true);
        }
    });

    try {
        // Menambahkan penundaan selama beberapa detik (untuk pengujian)
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
    
}
