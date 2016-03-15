/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
import java.util.Scanner;
import java.util.ArrayList;
public class MainOlimpicos {




    public static Scanner leer=new Scanner (System.in);
    public static void main(String[] args) {
        
        ArrayList<Delegacion> olim =new ArrayList<>();
        
        int cambio;
        String w="";
        String nombre="";
        String apellido="";
        String deporte="";
        Delegacion e= new Delegacion(w);
        Grupo b =new Grupo (w);
        
        while (true){

            System.out.println("1= Ingresar una nueva Delegaciaion");
            System.out.println("2= Consultar Delegacion.");
            System.out.println("3= Cambiar Cantidad Medallas y delegacion con mas medallas");
            System.out.println("= para acabar proceso digite cualquier otro numero");
            int eleccion=leer.nextInt();
            switch(eleccion) {          
                
                case 1:
                    System.out.println("CREAR DELEGACION");
                    System.out.println("Ingrese el pais ");
                    String p=leer.next(); 
                    Delegacion d= new Delegacion(p);
                    
                    System.out.println("INFORMACION DE GRUPOS (5 grupos)");

                    for (int i=0;i<5;i++){
                        
                        System.out.println("Ingrese el nombre del Deporte"+ (i+1));
                        deporte=leer.next();
                        Grupo de =new Grupo (deporte);
                       
                        System.out.println("Digite el numero de integrantes (2-10)");
                        int numIntegran =leer.nextInt();
                        
                            for (int cont=0;cont<numIntegran;cont++) {
                                
                                System.out.println("Ingrese el NOMBRE del jugador " +(cont+1));
                                String nombrejugador=leer.next();
                                System.out.println("Ingrese el APELLIDO del jugador " +(cont+1));
                                String apellidojugador=leer.next();
                                Integrante c=new Integrante(nombrejugador,apellidojugador);
                                System.out.println(c.toString());
                                System.out.println(c.getApellido() + ' ' + c.getNombre());
                                
                                de.addIntegrante(c);
                            }
                        d.addGrupo(de);
                    }
                    olim.add(d);
                    break;
                
                case 2:
                    System.out.println("CONSULTAR UNA DELEGACION");
                    System.out.println("ingrese nombre del deporte");
                    String nomdeporte=leer.next();
                    for (int i=0;i<olim.size();i++){
                        ArrayList<Grupo> a = olim.get(i).getGrupo();
                        for(int j = 0; j < a.size(); j++) {
                            if(a.get(j).getDeporte().equals(nomdeporte)){
                                ArrayList dep = a.get(j).getIntegrantes();
                                System.out.print("Los jugadores que juegan ese deporte en cualquier delegacion son ");
                                a.get(j).showall();                                
                            }
                        }
                    }
                    if(nomdeporte.equals(b.getDeporte())){
                    e.printAll();
                    }
                    break;
                    
                case 3:
                   
                    System.out.println("CAMBIO DE MEDALLAS");
                    System.out.println("Que pais desea Modificar");
                    String paismedalla=leer.next();
                    int mayor=0;
                    int ganador=0;
                    for (int j=0; j<olim.size();j++){
                       
                        Delegacion del = olim.get(j);
                        if (del.getPais().equals(paismedalla)){
                            System.out.println("Medalla a modificar: 1= Oro; 2= Plata; 3= Bronce");
                            int medalla=leer.nextInt();

                            if (medalla==1){
                                System.out.println("Ingrese el total de medallas de ORO para modificar el valor actual");
                                cambio=leer.nextInt();
                                del.setMedOro(cambio);
                                System.out.println("Hay "+ cambio+ " medallas de oro");

                            }

                            if (medalla==2){
                                System.out.println("Ingrese el total de medallas de PLATA para modificar el valor actual");
                                cambio=leer.nextInt();
                                del.setMedOro(cambio);
                                System.out.println("Hay "+ cambio+ " medallas de plata");
                            }

                            if (medalla==3){
                                System.out.println("Ingrese el total de medallas de BRONCE para modificar el valor actual");
                                cambio=leer.nextInt();
                                del.setMedOro(cambio);
                                System.out.println("Hay "+ cambio+ " medallas de bronce");
                            }
                        }
                        //delegacion con mas medallas
                        int [] arreglo=new int[1000000];
                            arreglo[j]=del.getMedTotal();
                            if(mayor<arreglo[j]){
                            mayor=arreglo[j];
                            ganador=j;
                            }
                    } 
                    System.out.println("la delegacion con mas medallas es la numero "+(ganador+1));
                break;
                
                default:
                  System.out.println("proceso terminado");  
                  break;
                    
            }
        }         
    }  
}     