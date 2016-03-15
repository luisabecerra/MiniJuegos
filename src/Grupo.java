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
public class Grupo {
    private String deporte;
    private ArrayList<Integrante> integrantes;

    public Grupo(String deporte){
        this.deporte=deporte;
        integrantes = new ArrayList<>();
    }
    
   
    public String getDeporte() {
        return deporte;
    }
    
    public ArrayList<Integrante> getIntegrante() {
        return integrantes;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public void addIntegrante(Integrante e){
        integrantes.add(e);
    }

    public void showall(){
        for (int i=0;i<integrantes.size();i++){
            Integrante a = integrantes.get(i);
            System.out.println(a.getNombre() +" "+ a.getApellido());

        }
         
    }
}
