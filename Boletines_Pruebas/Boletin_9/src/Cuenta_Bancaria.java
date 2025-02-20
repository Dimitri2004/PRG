public class Cuenta_Bancaria {
    private String numeroConta;
    private String nif;
    private String nometitular;
    private double saldo;
    private static int  contadorCorriente;

    public Cuenta_Bancaria(String numeroConta, String nif, String nomeTit){
        this.numeroConta = numeroConta;
        setNIF(nif);
        this.nometitular = nomeTit;
        setSaldo(saldo);
        contadorCorriente++;
    }
    public void setNIF(String nif){
        if(nif.matches("[0-9]{9}[A-Z]")){
            this.nif = nif;
        }else{
            System.out.println("NIF incorrecto. Debe contener 9 dígitos seguidos de una letra mayúscula.");
        }
    }
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        } else{
            System.out.println("Saldo negativo no válido.");
        }
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public String getNIF() {
        return nif;
    }
    public String getNomeTitular() {
        return nometitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public static int getContadorCorriente() {
        return contadorCorriente;
    }
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else{
            System.out.println("Valor de depósito incorrecto.");
        }
    }






}
