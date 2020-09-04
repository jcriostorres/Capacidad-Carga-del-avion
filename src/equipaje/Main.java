/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipaje;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.ArrayList;


/**
 *
 * @author catalina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        int id = 0;
        String nombrePropietario = " ";
        double peso = 0;
        double costo = 0;
 //pido los datos de entrada
 
        ArrayList<Equipaje> lista = new ArrayList();

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("ingrese id de bulto" + i + ": ");
                id = Integer.parseInt(in.readLine());

                System.out.println("Ingrese nombre de propietario del bulto"+i+ ": ");
                nombrePropietario = in.readLine();

                System.out.println( "Ingrese peso del bulto: "+ i + ": ");
                peso = Double.parseDouble(in.readLine());

                System.out.println("Ingrese costo del bulto: "+ i + ": ");
                costo = Double.parseDouble(in.readLine());

                lista.add(new Equipaje(id, nombrePropietario, peso, costo));

            }
        } catch (Exception e) {
        }
        for (Equipaje e1 : lista) {
            System.out.println("id: " + e1.getId() + " \nNombre: " + e1.getNombrePropietario() + "\nPeso: " + e1.getPeso() + "\nCosto: " + e1.getCosto());
            System.out.println("************************");

           //metodos a calcular
        if(peso< 25){
            costo = 0;
        } else if (peso >=25 && peso <300){
            costo = 1500;
        } else{
                costo = 2500;
                }
           
        }

    }
}
