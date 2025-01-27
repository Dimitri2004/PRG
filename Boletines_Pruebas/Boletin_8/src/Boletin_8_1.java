public class Boletin_8_1 {
    public static void main(String[] args){
        String[] cadena="recta".split("");
        System.out.println(cadena[0]+cadena[1]);
        System.out.println(cadena[2]+cadena[3]+cadena[4]);
        String[] cadena1="reflexo".split("");
        //colocar reflexo escrita de izquierda a derecha junto conn otra escrita de derecha a izquierda
        String correcto=cadena1[0]+cadena1[1]+cadena1[2]+cadena1[3]+cadena1[4]+cadena1[5]+cadena1[6];
        String invertido=cadena1[6]+cadena1[5]+cadena1[4]+cadena1[3]+cadena1[2]+cadena1[1]+cadena1[0];
        System.out.println(correcto+invertido);

        String clave="1540";
        //queremos colocar comas entre cada mumero del string
        String separado=clave.replace("",",");
        System.out.println(separado.substring(1,8));



        System.out.println("A sua clave é: "+clave.replace("1540","XXXX"));

    }
}
