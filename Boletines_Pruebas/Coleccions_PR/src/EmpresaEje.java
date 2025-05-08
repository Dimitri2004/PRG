import java.util.*;


public class EmpresaEje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear un mapa que recoge productos con sus respectivas cantidades
        Map<String, Integer> productos = new HashMap<>();
        //Añadir productos al mapa
        Set<Map.Entry<String, Integer>> entradas = productos.entrySet();
        Iterator<Map.Entry<String, Integer>> it;

        String pregunta="Escribe el numero de la opcion que quieras";


        System.out.println("Que escoges (dame el numero)");
        System.out.println("Menu: \n");
        System.out.println("(cualquier numero distinto de 5)Entrar \n");
        System.out.println("5.Salir \n");

        int op = sc.nextInt();

        while (op!=5){
            System.out.println("Menu: \n");
            System.out.println("1.Añadir nuevo producto \n");
            System.out.println("2.Vender producto : \n");
            System.out.println("3.Mostrar producto: \n");
            System.out.println("4.Actualizar producto: \n");
            System.out.println(pregunta);
            int a=sc.nextInt();


            switch (a){
            case 1:
                System.out.println("Que producto quieres comprar :");
                String o1 = sc.next().replaceAll(" ","_");


                System.out.println("Cuantos quieres comprar:");
                int p1 = sc.nextInt();
                productos.put(o1, p1);
                break;

            case 2:
                System.out.println("Que producto quieres vender: ");
                String o2 = sc.next().replaceAll(" ","_");


                System.out.println("Cuantos quieres vender: ");
                int p2 =sc.nextInt();
                productos.remove(o2, p2);
                break;

            case 4:
                it = entradas.iterator();
                Map.Entry<String, Integer> elemento = it.next();
                System.out.println("Que producto quieres actualizar su cantidad");
                String o3 = sc.next().toLowerCase();


                System.out.println("Cual es su nuevo valor:");
                int p3 = Math.abs(sc.nextInt());
                if (entradas.contains(o3) == entradas.contains(productos)) {
                    productos.replace(o3, p3);
                   String p=elemento.getKey()+elemento.getValue();
                    System.out.println("Producto "+p+" cambiado");
                }
                break;
            case 3:
                 System.out.println(productos);
                 break;
                default:
                    op=5;
            }
        }
        System.out.println("Saliendo...");
    }
}
