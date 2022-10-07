/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
                               Taller 2
1. Te Elabore un algoritmo que permita calcular la base de un triángulo. Como datos de entrada se tiene el área y la altura.
2. Elaborar un algoritmo que le muestre al usuario el dinero que pude ahorrar en un año. El usuario ingresará su salario mensual, el monto de los ingresos extras mensuales y el valor de los gastos mensuales.
3. En un lavadero de vehículos se relacionan al final del día la cantidad de taxis que se lavaron, la cantidad de buses, la cantidad de particulares y la cantidad de motos.
Se desea un programa que muestre el dinero realizado por cada tipo de vehículo (taxis, buses, particulares y motos) y el total realizado en el lavadero. El precio de los taxis es de $3.000, los buses a $10.000, los particulares a $5.000 y las motos a $2.000.
4. Elaborar un algoritmo que le permita al usuario ingresar los nombres y las edades de 3 hermanos y el computador le muestre los 3 nombres y el promedio de edad de ellos.
5. Elaborar un algoritmo que le permita al usuario ingresar la altura y la base de un triángulo y el radio de un círculo y le muestre en la pantalla el área de estas dos figuras.
6. Crear un algoritmo que le pida al usuario los datos de un trabajador así: El número de horas trabajadas en el mes, el salario básico hora, la cantidad de años que tiene de laborar en la empresa y el valor que le deducen mensualmente. El algoritmo le debe mostrar: El salario bruto, el valor de la bonificación ($30.000 por cada año laborado), el valor de las deducciones y el salario neto
7. Una persona posee dos buses, al final del día desea conocer el producido por cada bus y el total del producido. Por cada bus se digita el número de pasajeros transportados y el valor del pasaje.
8. Elaborar un algoritmo que le permita al usuario ingresar la distancia recorrida por un vehículo y el tiempo que se demoró en recorrerlo y el computador le muestre la velocidad con que la recorrió.
9. Crear un algoritmo donde el usuario pueda ingresar la cantidad de unidades vendidas de un artículo, el valor unitario de ese artículo y el porcentaje de IVA, y el computador le muestre: el valor bruto de la venta, el valor que debe pagar por IVA y el valor neto de la venta.
10. Crear un algoritmo que le permita al usuario ingresar el nombre de un estudiante, la cantidad de materias que matriculó y el valor de cada materia y el computador le imprima el valor neto de la matrícula sabiendo que al valor de las materias se le debe sumar la papelería que tiene un costo fijo de $20.000 y el carné un valor de $8.000. el estudiante tiene un descuento del 20 % sobre el costo de las materias.
11. Elaborar un algoritmo que le permita al usuario ingresar los nombres y las edades de 3 hermanos y el computador le muestre los 3 nombres y el promedio de edad de ellos.
12. Elaborar un algoritmo que calcule el valor que le puede prestar un banco a una persona, sabiendo que el monto del préstamo es 50 veces el dinero disponible que tiene. El dinero disponible es igual al salario mensual más los ingresos adicionales menos los gastos. Se debe mostrar el dinero disponible y el monto del préstamo.
13. Elaborar un algoritmo que calcule el valor que le puede prestar un banco a una persona, sabiendo que el monto del préstamo es 50 veces el dinero disponible que tiene. El dinero disponible es igual al
salario mensual más los ingresos adicionales menos los gastos. Se debe mostrar el dinero disponible y el monto del préstamo.
14. Elaborar un algoritmo que le permita al usuario ingresar los datos de la factura de servicios públicos y el computador le muestre el total que debe pagar. El usuario ingresará el total de KV de energía y el valor del K, el total de M3 de agua y el valor del M3, el total de impulsos telefónicos y el valor del impulso.
15. Con los mismos datos del ejercicio anterior se pide que además le imprima la diferencia con el mes anterior, sabiendo que el usuario ingresa también el total que pagó por todos los servicios en el mes anterior.
16. Elabore un algoritmo que le muestre al usuario el total de dinero que tiene sabiendo que el algoritmo le pide que digite: el número de billetes de $1000, de $2000, de $5000, de $10.000, de 20.000 y de 50.000 que posee.
17. Escriba un algoritmo que le permita al propietario de un bus ingresar el número de pasajeros transportados en un día, el valor del pasaje y el valor pagado por combustible. El programa le debe mostrar el total producido por el bus, el valor pagado al conductor (que es el 10% del total producido) y la ganancia neta (producido menos los gastos).
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author FX6300
 * 
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*------------------------------------Menu-------------------------------------------------------------
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un número del taller o digita 0(cero)para salir");
        int i = sc.nextInt();
        /*------------------------------------Menu-------------------------------------------------------------
         */
        /*------------------------------------1)punto------------------------------------------------------------
         */
        if (i == 1) {
            System.out.print(i + ") "
                    + "Elabore un algoritmo que permita calcular la base de un triángulo. Como datos de entrada se tiene el área y la altura1.");
            Scanner a = new Scanner(System.in);
            System.out.println("\n Digita el area del triangulo");
            int area = a.nextInt();

            Scanner h = new Scanner(System.in);
            System.out.println("\n Digita la altura del triangulo");
            int altura = h.nextInt();

            double base = (area * altura / 2);

            System.out.print("\n Area:" + area);
            System.out.print("\n Altura:" + altura);
            System.out.print("\n Base:" + base + "\n\n");

            Taller2.main(null);

        }
        /*------------------------------------1)punto------------------------------------------------------------
         */
        /*------------------------------------2)punto------------------------------------------------------------
         */
        if (i == 2) {
            System.out.print(i + ") "
                    + "Elaborar un algoritmo que le muestre al usuario el dinero que pude ahorrar en un año. El usuario ingresará su salario mensual, el monto de los ingresos extras mensuales y el valor de los gastos mensuales.");

            Scanner a = new Scanner(System.in);
            System.out.println("\n Digita tu salario mensual");
            double sm = a.nextDouble();

            Scanner b = new Scanner(System.in);
            System.out.println("\n Digita tus ingresos extra");
            double se = b.nextDouble();

            Scanner c = new Scanner(System.in);
            System.out.println("\n Digita tus gastos mensuales");
            double gm = c.nextDouble();

            double ahn = (sm + se - gm) * 12;

            System.out.print("\n Salario Mensual:" + sm);
            System.out.print("\n Salario Extra:" + se);
            System.out.print("\n Gastos mensuales:" + gm);
            System.out.print("\n Ganacias Anuales:" + ahn + "\n\n");

            Taller2.main(null);
        }
        /*------------------------------------2)punto------------------------------------------------------------
         */
        /*------------------------------------3)punto------------------------------------------------------------
         */
        if (i == 3) {
            System.out.print(i + ") "
                    + "En un lavadero de vehículos se relacionan al final del día la cantidad de taxis que se lavaron, la cantidad de buses, la cantidad de particulares y la cantidad de motos.");

            Scanner a = new Scanner(System.in);
            System.out.println("\n Digita la cantidad de taxis lavados");
            int tax = a.nextInt();

            Scanner b = new Scanner(System.in);
            System.out.println("\n Digita la cantidad de buses lavados");
            int bus = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\n Digita la cantidad de particulares lavados");
            int par = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\n Digita la cantidad de motos lavadas");
            int moto = d.nextInt();

            int total = (tax + bus + par + moto);

            System.out.print("\n Taxi:" + tax);
            System.out.print("\n Buses:" + bus);
            System.out.print("\n Particulares:" + par);
            System.out.print("\n Motos:" + moto);
            System.out.print("\n total:" + total + "\n\n");

            Taller2.main(null);
        }

        /*------------------------------------3)punto------------------------------------------------------------
         */
        if (i == 4) {
            System.out.print(i + ") "
                    + "4. Elaborar un algoritmo que le permita al usuario ingresar los nombres y las edades de 3 hermanos y el computador le muestre los 3 nombres y el promedio de edad de ellos.");

            Scanner a = new Scanner(System.in);
            System.out.println("\n Digita nombre hermano 1");
            String he = a.next();

            Scanner aa = new Scanner(System.in);
            System.out.println("\n Digita la edad");
            int e = aa.nextInt();

            Scanner b = new Scanner(System.in);
            System.out.println("\n Digita nombre hermano 2");
            String her = b.next();

            Scanner bb = new Scanner(System.in);
            System.out.println("\n Digita la edad");
            int ed = bb.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\n Digita nombre hermano 3");
            String herm = c.next();

            Scanner cc = new Scanner(System.in);
            System.out.println("\n Digita la edad");
            int eda = cc.nextInt();

            int promedio = (e + ed + eda) / 3;

            System.out.print("\n hermano1:" + he);
            System.out.print("\n edad:" + e);
            System.out.print("\n hermano2:" + her);
            System.out.print("\n edad:" + ed);
            System.out.print("\n hermano3:" + herm);
            System.out.print("\n edad:" + eda);

            System.out.print("\n\n Promedio:" + promedio + "\n\n");

            Taller2.main(null);
        }
        if (i == 5) {
            System.out.print(i + ") "
                    + "Elaborar un algoritmo que le permita al usuario ingresar la altura y la base de un triángulo y el radio de un círculo y le muestre en la pantalla el área de estas dos figuras.");

            Scanner a = new Scanner(System.in);
            System.out.println("\n Digita el base del triangulo");
            int base = a.nextInt();

            Scanner h = new Scanner(System.in);
            System.out.println("\n Digita la altura del triangulo");
            int altura = h.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\n Digita el radio del circulo");
            int radio = c.nextInt();

            int areat = (base * altura) / 2;
            double areac = (radio ^ 2) * 3.14;

            System.out.print("\n Base:" + base);
            System.out.print("\n Altura:" + altura);
            System.out.print("\n Area del triangulo:" + areat);

            System.out.print("\n Area del circulo:" + areac + "\n\n");

            Taller2.main(null);
        }
        if (i == 6) {
            System.out.print(i + ") "
                    + "Crear un algoritmo que le pida al usuario los datos de un trabajador así: El número de horas trabajadas en el mes, el salario básico hora, la cantidad de años que tiene de laborar en la empresa y el valor que le deducen mensualmente. El algoritmo le debe mostrar: El salario bruto, el valor de la bonificación ($30.000 por cada año laborado), el valor de las deducciones y el salario neto");
            Scanner a = new Scanner(System.in);
            System.out.println("\n Digita nombre del usuario");
            String he = a.next();

            Scanner aa = new Scanner(System.in);
            System.out.println("\n el numero de horas trabajadas");
            int e = aa.nextInt();

            Scanner bb = new Scanner(System.in);
            System.out.println("\n salario basico hora");
            double ed = bb.nextDouble();

            Scanner c = new Scanner(System.in);
            System.out.println("\n deducciones");
            int d = c.nextInt();

            Scanner cc = new Scanner(System.in);
            System.out.println("\n cantidad de años trabajando en la empresa");
            int eda = cc.nextInt();

            int promedio = 3;

            System.out.print("\n empleado:" + he);
            System.out.print("\n horas trabajadas:" + e);
            System.out.print("\n salario basico:" + ed);
            System.out.print("\n deducciones:" + d);
            System.out.print("\n años en la empresa:" + eda);

            System.out.print("\n\n Promedio:" + promedio + "\n\n");

            Taller2.main(null);
        }
        if (i == 7) {
            System.out.print(i + ") "
                    + "Te Elabore un algoritmo que permita calcular la base de un triángulo. Como datos de entrada se tiene el área y la altura.");
        }
        if (i == 8) {
            System.out.print(i + ") "
                    + "Te Elabore un algoritmo que permita calcular la base de un triángulo. Como datos de entrada se tiene el área y la altura.");
        }
        if (i == 9) {
            System.out.print(i + ") "
                    + "Te Elabore un algoritmo que permita calcular la base de un triángulo. Como datos de entrada se tiene el área y la altura.");
        }
        if (i == 10) {
            System.out.print(i + ") "
                    + "Te Elabore un algoritmo que permita calcular la base de un triángulo. Como datos de entrada se tiene el área y la altura.");
        }
        if (i == 0) {
            System.out.print("Cerrando...");
            System.exit(0);
        }
    }

}
