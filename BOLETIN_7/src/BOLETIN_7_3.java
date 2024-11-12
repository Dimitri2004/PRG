public class BOLETIN_7_3 {
    public static void main(String[] args) {

        String[] alumno = {
                "Manolo", "Sabela", "Carlos", "Juan", "Damian", "Pablo", "Diego"
                , "Oscar", "Samuel", "Oliver", "Jose", "Nuria", "Antonio"
                , "Miguel", "Carmen", "Ana", "Uxia", "Gabriel", "Luis", "Luisito"
                , "Maria", "Pedro", "Pablo.P", "Sandra", "Carmelita", "Sabelita",
                "Omil", "Federico", "Camelia"
        };

        int[] nota = new int[30];
        int num = 0;
        int res = 0;
            for (int i = 1; i < alumno.length; ++i) {
                nota[i] = (int) Math.floor(Math.random() * 10.0) + 1;
                if (nota[i] < 5) {
                    System.out.println("El alumno " + alumno[i] + " suspendio con " + nota[i]);

                } else if (nota[i]==10) {

                    System.out.println("El alumno " + alumno[i] + " saco la max nota con " + nota[i]);
                }else if(nota[i]>=5){
                    System.out.println("El alumno " + alumno[i] + " aprobo con " + nota[i]);

                }
                num = nota[i];
                res += num;

            }

        System.out.println("La media total es:" + res);

    }
}

