/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesjava;

/**
 *
 * @author alae2
 */
public class Classesjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pneus p1 = new pneus(55,205,16,"été");
        Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500,p1);
        v1.afficherDescription();

        }
    
}
