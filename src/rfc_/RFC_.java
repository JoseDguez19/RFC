
package rfc_;

import java.util.Scanner;

/**
 *
 * @author JOSE DOMINGUEZ 226Z0175; ap550120@gmail.com
 */
public class RFC_ {

    public static void main(String[] args) {
   System.out.println("CALCULA RFC");
                    Scanner tec=new Scanner(System.in);
         String nom,app,apm,año,mes,dia,rfc;
         System.out.println("INGRESE SU NOMBRE(S):");
         nom=tec.nextLine();
         System.out.println("INGRESE SU APELLIDO PATERNO:");
         app=tec.nextLine();
         System.out.println("INGRESE SU APELLIDO MATERNO:");
         apm=tec.nextLine();
         System.out.println("INGRESE SU DIA DE NACIMIENTO:");
         dia=tec.nextLine();
         switch(dia){
             case "1" -> dia="01";
                 case "2" -> dia="02";
                 case "3" -> dia="03";
                 case "4" -> dia="04";
                 case "5" -> dia="05";
                 case "6" -> dia="06";
                 case "7" -> dia="07";
                 case "8" -> dia="08";
                 case "9" -> dia="09";
         }
         System.out.println("INGRESE SU MES DE NACIMIENTO:");
         System.out.println("""
                            1.-Enero
                            2.-Febrero
                            3.-Marzo
                            4.-Abril
                            5.-Mayo
                            6.-Junio
                            7.-Julio
                            8.-Agosto
                            9.-Septiembre
                            10.-Octubre
                            11.-Noviembre
                            12.-Diciembre""");
         mes=tec.nextLine();
         switch(mes){
             case "1" -> mes="01";
                 case "2" -> mes="02";
                 case "3" -> mes="03";
                 case "4" -> mes="04";
                 case "5" -> mes="05";
                 case "6" -> mes="06";
                 case "7" -> mes="07";
                 case "8" -> mes="08";
                 case "9" -> mes="09";
                 case "10" -> mes="10";
                 case "11" -> mes="11";
                 case "12" -> mes="12";
                 
         }
         System.out.println("INGRESE SU AÑO DE NACIMIENTO:");
         año=tec.nextLine();
         rfc=app.trim().substring(0, 2);
         rfc=rfc.concat(apm.trim().substring(0, 1));
         rfc=rfc.concat(nom.trim().substring(0, 1));
         rfc=rfc.concat(año.trim().substring(2, 4));
         rfc=rfc.concat(mes);
         rfc=rfc.concat(dia);
        
         System.out.println("SU RFC ES: "+rfc.toUpperCase());
    }
    
}
