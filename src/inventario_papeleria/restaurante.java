/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario_papeleria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Corredor
 */
public class restaurante {

    /**
     * private int arrozde_pollo , chicharron , polloasado , asado ,
     * pescadofrito , gaseosa,agua,postre , jugo_demora ,adicionde_papas ,
     * adicciode_patacones; private int total ;
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a, c, p, asad, pes, agu, pos, ju, jugi, adici, adipata, pr = 0;
        Scanner xd = new Scanner(System.in);
        int domicilio = 4000;
        po xc = new po();

        System.out.println(" presiones 0  o cualquiere numero para que le muestre el menu");
        a = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto arroz de pollo desea ");

        c = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto porciones de chicharrones");

        p = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto porciones de polle asado");
        asad = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto porciones de carne asado desea");

        agu = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto botellas de agua desea");
        pes = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto porciones de pescado desea algo");
        pos = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto porciones de postre desea");
        ju = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto refresco desea");
        jugi = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto jugos de moras");

        adici = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto adiciones de papa desea");
        adici = Integer.parseInt(xd.nextLine());
        System.out.println("cuanto adiciones patacon");
        adipata = Integer.parseInt(xd.nextLine());
        System.out.println("cuanta adiciones papa desea");

        // private int arrozde_pollo , chicharron , polloasado , asado , pescadofrito , gaseosa,agua,postre , jugo_demora ,adicionde_papas , adicciode_patacones;   
        //a , c , p , asad , pes ,agu,pos , ju ,adici , adipata;
        xc.setArrozde_pollo(a);
        xc.setChicharron(c);
        xc.setPolloasado(p);
        xc.setAsado(asad);
        xc.setPescadofrito(pes);
        xc.setGaseosa(ju);
        xc.setJugo_demora(jugi);
        xc.setAdicionde_papas(adici);
        xc.setAdicciode_patacones(adipata);

        System.out.println(" restaurante el espectaculo comidas ");

        System.out.println("el total del costos de la comida es mas el domicilio es igual" + domicilio + xc.dato());

        System.out.println(" digite el numero de estrellas del servicio presione los numeros de 1 al 5 para calificar que tal fue tu expreciencia\"");
        pr = Integer.parseInt(xd.nextLine());

        if (pr == 1) {

            System.out.println(" el servicio fue malo");
        } else if (pr == 2) {

            System.out.println(" el servicio fue insatisfactorio ");

        } else if (pr == 3) {
            System.out.println("el servio fue regular");

        } else if (pr == 4) {
            pr = Integer.parseInt(xd.nextLine());
            System.out.println("el servio fue bueno ");

        } else if (pr == 5) {

            System.out.println("el servio fue excelente");
        }

    }

}
