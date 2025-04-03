import javax.swing.JOptionPane;//Importando paquete
public class Servicio {//Creando clase
    public static void main (String [] Ejercicio1){//metodo principal
        System.out.println("Ingresa tus creditos acumulados 1 semestre");
        long b;
        b=Long.parseLong(JOptionPane.showInputDialog ("semestre 1"));
        if (b>17 && b<35) {
            System.out.println("ingresa tus creditos acumulados 2 semestre");
            long c;
            c=Long.parseLong (JOptionPane.showInputDialog ("semestre 2"));
            if (c>17 && c<35) {
                System.out.println("ingresa tus creditos acumulados 3 semestre");
                long d;
                d=Long.parseLong (JOptionPane.showInputDialog ("semestre 3"));
                if (d>17 && d<35){
                    System.out.println("ingresa tus creditos acumulados 4 semestre");
                    long e;
                    e=Long.parseLong (JOptionPane.showInputDialog ("semestre 4"));
                    if (e>17 && e<35){
                        System.out.println("ingresa tus creditos acumulados 5 semestre");
                        long f;
                        f=Long.parseLong (JOptionPane.showInputDialog ("semestre 5"));
                        if (f>17 && f<35){
                            System.out.println("ingresa tus creditos acumulados 6 semestre");
                            long g;
                            g=Long.parseLong (JOptionPane.showInputDialog ("semestre 6"));
                            if (g>17 && g<35){
                                short suma;
                                suma= (short)(b+c+d+e+f+g);
                                byte porcentaje;
                                porcentaje=(byte) ((suma*100)/264);
                                System.out.println("creditos obtenidos: "+suma+"/264");
                                System.out.println("porcentaje de creditos:%"+porcentaje);
                                if(porcentaje>=60){
                                    System.out.println("puedes hacer servicio social");
                                }else{
                                    System.out.println("no cumples con los creditos suficientes por lo tanto no puedes realizar servicio");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}