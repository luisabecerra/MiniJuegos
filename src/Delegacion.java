/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author RUBEN
 */
public class Delegacion {
    private String pais;
    private int numDeportistas;
    private int medOro=0;
    private int medPlata=0;
    private int medBronce=0;
    private ArrayList<Grupo> grupos;
    
    public Delegacion(String pais){
        this.pais=pais;
        grupos = new ArrayList<>();
    }

    public void addGrupo(Grupo e){
        grupos.add(e);
        
     }

    public void printAll() {
        for(int i=0; i<grupos.size(); i++) {
            Grupo g = grupos.get(i);
            System.out.println(g.getDeporte());
            g.showall();
        }
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumDeportistas() {
        return numDeportistas;
    }

    public void setNumDeportistas(int numDeportistas) {
        this.numDeportistas = numDeportistas;
    }

    public int getMedOro() {
        return medOro;
    }

    public void setMedOro(int medOro) {
        this.medOro = medOro;
    }

    public int getMedPlata() {
        return medPlata;
    }

    public void setMedPlata(int medPlata) {
        this.medPlata = medPlata;
    }

    public int getMedBronce() {
        return medBronce;
    }

    public void setMedBronce(int medBronce) {
        this.medBronce = medBronce;
    }
    
    public int getMedTotal() {
       return  medOro+medPlata+medBronce;
    }
    
    public ArrayList<Grupo> getGrupo() {
        return grupos;
    }
    
    
}
