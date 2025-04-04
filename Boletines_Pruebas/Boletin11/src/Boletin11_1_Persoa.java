public class Boletin11_1_Persoa {
    public static class Persoa{
        private String nome;
        private String direcccion;
        private String Dni;

        public Persoa(String nome, String direcccion, String Dni) {
            setNome(nome);
            setDirecccion(direcccion);
            setDni(Dni);
        }

        public String getDni() {
            return Dni;
        }

        public void setDni(String dni) {
            //Excepcion
            try {
                if (dni.length() != 9) {
                    throw new Exception("O DNI ten que ter 9 caracteres");
                }else {

                    this.Dni = dni;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        public String getDirecccion() {
            return direcccion;
        }

        public void setDirecccion(String direcccion) {
            this.direcccion = direcccion;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
}
