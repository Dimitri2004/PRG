import java.util.Scanner;

public class media_notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("cuantos examenes hiciste:");
        n = sc.nextInt();
        int s;
        s=2;
        int p;
        p=3;

        do {
            float media;
            float n_exam;
            n_exam = 1;
            float s_exam;
            s_exam = 1;
            float p_exam;
            p_exam = 1;
            for (n =+1; n <=(n+1); n++) {

                System.out.println("Dame la "+(n++)+"º nota: ");
                n_exam = sc.nextFloat();

                System.out.println("Dame la " + (s++) + "º nota: ");
                s_exam = sc.nextFloat();
                System.out.println("Dame la " + (p++) + "º nota: ");
                p_exam = sc.nextFloat();
                float suma = (n_exam + s_exam + p_exam);
                System.out.println("La suma total de tus notas es: " + suma);
            }
            media = (n_exam + s_exam + p_exam) / n;
            System.out.println("Tu media es: " + media);


        }while(n!=-1);

    }
}
