/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario_papeleria;

/**
 *
 * @author Rafael Corredor
 */
public class po {
 private int arrozde_pollo , chicharron , polloasado , asado , pescadofrito , gaseosa,agua,postre , jugo_demora ,adicionde_papas , adicciode_patacones;   
private int total , pr =0;


    /**
     * @return the arrozde_pollo
     */
    public int getArrozde_pollo() {
        return arrozde_pollo;
    }

    /**
     * @param arrozde_pollo the arrozde_pollo to set
     */
    public void setArrozde_pollo(int arrozde_pollo) {
        this.arrozde_pollo = arrozde_pollo;
    }

    /**
     * @return the chicharron
     */
    public int getChicharron() {
        return chicharron;
    }

    /**
     * @param chicharron the chicharron to set
     */
    public void setChicharron(int chicharron) {
        this.chicharron = chicharron;
    }

    /**
     * @return the polloasado
     */
    public int getPolloasado() {
        return polloasado;
    }

    /**
     * @param polloasado the polloasado to set
     */
    public void setPolloasado(int polloasado) {
        this.polloasado = polloasado;
    }

    /**
     * @return the asado
     */
    public int getAsado() {
        return asado;
    }

    /**
     * @param asado the asado to set
     */
    public void setAsado(int asado) {
        this.asado = asado;
    }

    /**
     * @return the pescadofrito
     */
    public int getPescadofrito() {
        return pescadofrito;
    }

    /**
     * @param pescadofrito the pescadofrito to set
     */
    public void setPescadofrito(int pescadofrito) {
        this.pescadofrito = pescadofrito;
    }

    /**
     * @return the gaseosa
     */
    public int getGaseosa() {
        return gaseosa;
    }

    /**
     * @param gaseosa the gaseosa to set
     */
    public void setGaseosa(int gaseosa) {
        this.gaseosa = gaseosa;
    }

    /**
     * @return the agua
     */
    public int getAgua() {
        return agua;
    }

    /**
     * @param agua the agua to set
     */
    public void setAgua(int agua) {
        this.agua = agua;
    }

    /**
     * @return the postre
     */
    public int getPostre() {
        return postre;
    }

    /**
     * @param postre the postre to set
     */
    public void setPostre(int postre) {
        this.postre = postre;
    }

    /**
     * @return the jugo_demora
     */
    public int getJugo_demora() {
        return jugo_demora;
    }

    /**
     * @param jugo_demora the jugo_demora to set
     */
    public void setJugo_demora(int jugo_demora) {
        this.jugo_demora = jugo_demora;
    }

    /**
     * @return the adicionde_papas
     */
    public int getAdicionde_papas() {
        return adicionde_papas;
    }

    /**
     * @param adicionde_papas the adicionde_papas to set
     */
    public void setAdicionde_papas(int adicionde_papas) {
        this.adicionde_papas = adicionde_papas;
    }

    /**
     * @return the adicciode_patacones
     */
    public int getAdicciode_patacones() {
        return adicciode_patacones;
    }
 /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    /**
     * @param adicciode_patacones the adicciode_patacones to set
     */
    public void setAdicciode_patacones(int adicciode_patacones) {
        this.adicciode_patacones = adicciode_patacones;
    }
    public float dato(){
        return arrozde_pollo *100+ chicharron *200+ polloasado *400+ asado*560+  pescadofrito *356+ gaseosa*80+agua *65+postre *89+ jugo_demora *45+adicionde_papas*98 + adicciode_patacones*56;
   
    } public float impuesto_domicilio (){
        return dato()/1.19f -dato();
        
    } public float sigueimp(){
        return  impuesto_domicilio () +dato ();
  
    }
        }
    

     
