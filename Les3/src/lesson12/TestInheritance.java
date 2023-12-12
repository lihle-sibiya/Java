/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson12;

/**
 *
 * @author Lihle
 */
public class TestInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Clothing c1 = new Trousers(1, "Trousers", 'B', 100.99, 'S', 'F');
        c1.getItemID();
        c1.display();

        if (c1 instanceof Trousers) {
            System.out.println("Fit is " + ((Trousers)c1).getFit() );
        }
    }

    }
    

