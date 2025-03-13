import Asociacion.Asalariados2;
import Asociacion.Socios2;
import Asociacion.Traballadores2;
import Asociacion.Voluntarios2;
import DataHora.Data;
import DataHora.Hora;

public class Runer2 {
    public static void main(String[] args) {
        Socios2 socios2 = new Socios2("Juan", "4058662", "Calle 123", "Buenos Aires", 2021, 1000);
        System.out.println(socios2.toString());
        Traballadores2 trabajador2 = new Traballadores2("Pedro", "12345678", new Data(1, 1, 2021));
        System.out.println(trabajador2.toString());


        //calcuñlar el ingreso del trabajador
        System.out.println("Ingreso del trabajador: " + trabajador2.calculargastosIngresos());

        //calcular el ingreso del socio
        System.out.println("Ingreso del socio: " + socios2.calculargastosIngresos());

        //calcular el ingreso del voluntario
        Voluntarios2 voluntario = new Voluntarios2("Maria", "12345678", new Data(1, 1, 2021), 20, new Hora(10, 0), "Estudiante", "Limpieza");
        System.out.println(voluntario.toString());
        System.out.println("Ingreso del voluntario: " + voluntario.calculargastosIngresos());
//asalariado
        Asalariados2 asalariado = new Asalariados2("Luis", "12345645", new Data(1, 1, 2021), 1000, "Administrador");
        System.out.println(asalariado.toString());
        System.out.println("Ingreso del asalariado: " + asalariado.calculargastosIngresos());

    }
}
