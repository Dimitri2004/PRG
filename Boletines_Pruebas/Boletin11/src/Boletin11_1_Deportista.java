public class Boletin11_1_Deportista extends Boletin11_1_Persoa {
private String deporte;
private String club;
private int licencia;
public Boletin11_1_Deportista(String nome, String direcccion, String Dni, String deporte, String club, int licencia) {
    super(nome, direcccion, Dni);
    setDeporte(deporte);
    setClub(club);
    setLicencia(licencia);
}

    public String getDeporte() {

    setDeporte(deporte);
        return deporte;
    }

    public void setDeporte(String deporte) {

        String[] deportes = deporte.split(",");
        for (int i = 0; i < deportes.length; i++) {
            deporte=deportes[i].substring(0,3);
        }
        try {
            if (deporte.length() != 3) {
                throw new Exception("O deporte ten que ter 3 caracteres");
            } else {
                this.deporte = deporte;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        //Comprobar que cumpla el formato aaaadddnnnnnn siendo aaaa el año, ddd el deporte y nnnnnn el número de licencia

        try {
            if(String.valueOf(licencia).length() != 6) {
                throw new Exception("A licencia ten que ter 6 caracteres");
            }
            if(licencia<0) {
                throw new Exception("A licencia ten que ser maior que 0");
            }else if (licencia > 999999) {
                throw new Exception("A licencia ten que ser menor que 999999");
            }else {
                this.licencia = licencia;
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String aCadena() {
        return super.aCadena()+"\nDeporte: " + getDeporte() + "\nClub: " + getClub() + "\nLicencia: " + getLicencia();

    }


}
