import Asociacion.Asalariados;
import Asociacion.Socios;
import Asociacion.Traballadores;
import Asociacion.Voluntarios;
import DataHora.Data;
import DataHora.Hora;

public class Runer {
    public static void main(String[] args) {
        Socios socio = new Socios("Juan", "4058662", "Calle 123", "Buenos Aires", 2021, 1000);
        System.out.println(socio.toString());
        Traballadores trabajador = new Traballadores("Pedro", "87654321", new Data(1, 1, 2021));
        System.out.println(trabajador.toString());


        //calcuñlar el ingreso del trabajador
        System.out.println("Ingreso del trabajador: " + trabajador.calcularGastosIngresos());

        //calcular el ingreso del socio
        System.out.println("Ingreso del socio: " + socio.calcularGastosIngresos());

        //calcular el ingreso del voluntario
        Voluntarios voluntario = new Voluntarios("Maria", "12345678", new Data(1, 1, 2021), 20, new Hora(10, 0), "Estudiante", "Limpieza");
        System.out.println(voluntario.toString());
        System.out.println("Ingreso del voluntario: " + voluntario.calcularGastosIngresos());
//asalariado
        Asalariados asalariado = new Asalariados("Luis", "123456", new Data(1, 1, 2021), 1000, "Administrador");
        System.out.println(asalariado.toString());
        System.out.println("Ingreso del asalariado: " + asalariado.calcularGastosIngresos());

    }
}
