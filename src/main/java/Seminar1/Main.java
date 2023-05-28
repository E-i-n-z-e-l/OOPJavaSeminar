/*
Запуск автомата
 */

package Seminar1;

import Seminar1.Cheese;
import Seminar1.Chocolate;

public class Main {
    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Chocolate("Alpen gold", 10, "темный",
                        "с орехом", 100))
                .addProduct(new Product("яблоко", 30))
                .addProduct(new Product("Кола", 15))
                .addProduct(new Cheese("Российский", 10, "вкусный", 1000));


            Product saledProduct = apparat.saleProduct("яблоко");
            System.out.println(saledProduct);
            Product saledProduct2 = apparat.saleProduct("Кола");
            System.out.println(saledProduct2);

            System.out.println("__________________________________________");

            System.out.println(apparat);


    }
}


