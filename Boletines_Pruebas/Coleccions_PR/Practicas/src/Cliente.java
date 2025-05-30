import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Aprender a usar la clase LocalDate, DateTimeFormatter y la interfaz Comparable(en este caso utilizamos por ejemplo el compareTo)
 * @author Dima(Copiado de Oliver)
 */
public class Cliente implements Comparable<Cliente> {
    String dni;
    String nome;
    LocalDate dataNacemento; //clase para trabajar con datas

    //CONSTRUCTOR
    public Cliente(String dni, String nome, String dataNacemento){
        this.dni = dni;
        this.nome = nome;
        /*
        La clase DateTimeFormatter permite crear un formato de estructura para una data o fecha
        y utilizando el metodo ofPattern es como le damos un formato sencillo siguiendo cierto patrón(especificado en la documentación)
         */
        DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Proporciona un formato específico a la data que introduciremos
        /*
        El utilizar el metodo parse lo que hacemos es darle a la propiedad "dataNacemento" el formato creado anteriormente
         */
        this.dataNacemento = LocalDate.parse(dataNacemento,formatoDatas);//a la "dataNacemento" se le aplicará el forma creando anteriormente
    }//end constructor

    /**
     * Aquí se utiliza el metodo until de la clase LocalDate. Este metodo calcula la diferencia entre dos fechas,
     * la fecha de nacimiento (dataNacemento) y la fecha actual (LocalDate.now()), usando la unidad de tiempo especificada.
     * ChronoUnit.YEARS: Este es el tipo de unidad de tiempo que se pasa a until, lo que indica que queremos calcular la diferencia en años.
     *
     * Conversión a int: Aunque el metodo until devuelve un valor de tipo long, se hace un "cast" explícito a int porque
     * la edad suele representarse como un número entero.
     * @return la edad del cliente
     */
    int edade(){
        return (int) dataNacemento.until(LocalDate.now(),ChronoUnit.YEARS); //representa la edad del cliente, gracias a calcular la diferencia entre la data actual con la data de nacimiento
    }

    /**
     * Compara dos clientes, si por ejemplo el cliente anteriormente creado tiene una edad mayor mostrará una cosa con respecto a si tiene la misma edad
     * o una edad menor.
     * En coso de que sea un dni el compareTo lo verificará de manera distinta debido a que es un String
     * @param outro cliente nuevo con el que se comparará
     * @return
     */
    @Override
    public int compareTo(Cliente outro) {

        return this.edade()- outro.edade(); //si la edad de this.edad > outro.edad devuelve un valor positivo, en caso contrario negativo y en empate 0

        /*
       Otra Forma de hacerlo
       int res = 0;
       if(this.edade() > outro.edade()) res = 1;
       if(this.edade() < outro.edade()) res = -1;

       return res;
        */

    }

    /**
     * Muestra los datos por pantalla
     * @return todos los datos de la clase Cliente
     */
    public String toString(){
        return "DNI:"+ dni+" Nome:"+ nome + " Data de nacemento :"+ dataNacemento.toString();
        /*
        Usamos el toString predeterminado de dataNacemento que proviene de la clase LocalDate.
        Este mostrará la fecha en formato ISO 8601 (YYYY-MM-DD) porque el formato creado en el constructor
         solo se aplica al momento de inicializar la fecha y no afecta el comportamiento de este metodo.

         Otro forma de hacerlo para aplicarle el formato deseado:
         DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         return "DNI:" + dni + " Nome:" + nome + " Data de nacemento:" + dataNacemento.format(formatoDatas);

        */
    }

}//end class
