/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shippingcontainerscalculator;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class ShippingContainersCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare variables
        Scanner stdIn = new Scanner(System.in);
        int shippingContainers, items, leftoverItems, itemsPerContainer;
        //prompt user input
        System.out.print("How many items do you need to ship? ");
        items = stdIn.nextInt();
        System.out.print("How many items does one container hold? ");
        itemsPerContainer = stdIn.nextInt();
        //do the work
        shippingContainers = items / itemsPerContainer;
        leftoverItems = items % itemsPerContainer;
        //output
        System.out.println("Shipping Container Calculator by Kevin Bell");
        System.out.println("Number of shipping containers: " + shippingContainers);
        System.out.println("Number of items not packed: " + leftoverItems);
    }

}
