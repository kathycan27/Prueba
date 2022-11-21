import java.util.Scanner;

public class Cuenta {
    String nombre;
    int numeroC=0;
    double dinero=20;
    double deposito=0;
    double total;
    double retiro=0;
    Cuenta cuenta[] = new Cuenta[1];


    Scanner sc=new Scanner(System.in);
    public void ingresar()
    {
        System.out.println("Ingrese su numero de cuenta: ");
        cuenta[0]=new Cuenta();
        numeroC= sc.readLine();
        cuenta[0].setNumeroC(numeroC);
        System.out.println("Ingrese su nombre: ");
        nombre=sc.nextLine();
        cuenta[0].setNombre(nombre);
        System.out.println("Numero de cuenta: "+getNumeroC());
        System.out.println("Nombre: "+getNombre());
    }
    public void depositar()
    {
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        deposito=sc.nextDouble();
        total=getDinero()+getDeposito();
        System.out.println("Su dinero total es: "+getTotal());


    }
    public void retirar()
    {
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        retiro=sc.nextDouble();
        if(getTotal()>getRetiro()&getTotal()>0) {
            total = getDinero() - getRetiro();
            System.out.println("Su dinero total es: " + getTotal());
        }else {
            System.out.println("La cantidad de dinero que desea retirar es mayor a la disponible");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }



    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
}
