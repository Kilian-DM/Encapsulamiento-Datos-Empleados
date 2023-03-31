package ejercicio1;

//@author Kilian Diaz
public class Ejercicio1 {

    private int empleados;
    private String nombre;
    private String apellido;
    private int cedula;
    private int sueldo;

    public Ejercicio1(int em, String no, String ap, int ce, int su) {
        this.empleados = em;
        this.nombre = no;
        this.apellido = ap;
        this.cedula = ce;
        this.sueldo = su;

    }

    public static void main(String[] args) {
        Ejercicio1 empleado1 = new Ejercicio1(1, "juan", "diaz ortiz", 92133199, 2000000);
        empleado1.verdatos();
        Ejercicio1 empleado2 = new Ejercicio1(2, "miguel", "antonio lopez", 92243679, 1200000);
        empleado2.verdatos();
        Ejercicio1 empleado3 = new Ejercicio1(3, "juliana", "camargo ortiz", 86353199, 1500000);
        empleado3.verdatos();
        Ejercicio1 empleado4 = new Ejercicio1(4, "manuel", "rodriguez montero", 92796724, 1200000);
        empleado4.verdatos();
        Ejercicio1 empleado5 = new Ejercicio1(5, "teresa", "quintero serna", 93143597, 1200000);
        empleado5.verdatos();

    }

    public void verdatos() {
        System.out.println("\nEmpleado Numero: " + getempleados());
        System.out.println("Nombre: " + getnombre());
        System.out.println("Apellido: " + getapellido());
        System.out.println("Cedula: " + getcedula());
        System.out.println("Sueldo: " + getsueldo());
    }

    void setempleados(int empleados) {
        this.empleados = empleados;
    }

    int getempleados() {
        return empleados;
    }

    void setnombre(String nombre) {
        this.nombre = nombre;
    }

    String getnombre() {
        return nombre;
    }

    void setapellido(String apellido) {
        this.apellido = apellido;
    }

    String getapellido() {
        return apellido;
    }

    void setcedula(int cedula) {
        this.cedula = cedula;
    }

    int getcedula() {
        return cedula;
    }

    void setsueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    int getsueldo() {
        return sueldo;
    }
}
