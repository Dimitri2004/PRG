public abstract class Barcos{
    //van a heredar de Barcos
    private String orixe;
    private String nome;
    private int anoBoutanza;
    private String matricula;
    //general
    private int eslora;
    private double volumen;
    private int ntripulantes;
    private int millas;



    public Barcos(String orixe, String nome, int anoBoutanza, String matricula, int eslora, double volumen, int ntripulantes,int millas){
        this.orixe=orixe;
        this.nome=nome;
        this.anoBoutanza=anoBoutanza;
        this.matricula=matricula;
        this.eslora=eslora;
        this.volumen=volumen;
        setNtripulantes(ntripulantes);
        setMillas(millas);
    }
    public String getOrixe() {
        return orixe;
    }

    public void setOrixe(String orixe) {
        this.orixe = orixe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoBoutanza() {
        return anoBoutanza;
    }

    public void setAnoBoutanza(int anoBoutanza) {
        this.anoBoutanza = anoBoutanza;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getNtripulantes() {
        return ntripulantes;
    }

    public int getMillas() {
        return millas;
    }

    public void setMillas(int millas) {
        this.millas =Math.abs(millas);
    }


    public void setNtripulantes(int ntripulantes) {
        if (this.ntripulantes>ntripulantes) {
            this.ntripulantes=0;
            System.out.println("No podemos colocar mas tripulantes no hay chalecos suficientes");
        }else{
            this.ntripulantes=Math.abs(ntripulantes);
            }
        }
        public abstract String aCadea();
}
