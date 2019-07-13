
package tarea3;


public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona=new Persona();///Instanci de la clase Persona
        Doctor doctor=new Doctor();///Instanci de la clase Doctor
        persona.setNombre("Maria");
        persona.setApellido("Perez");
        persona.setEdad(30);
        persona.setSexo("Femenino");
        persona.setDireccion("La ceiba");
        doctor.setTrabajo("Doctor");
        
        
        
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Sexo: "+persona.getSexo());
        System.out.println("Direccion: "+persona.getDireccion());
        System.out.println("Trabajo: "+doctor.getTrabajo());
        
        
    }
    public static class Persona{///Clase Persona
    ///atributos 
        private String nombre;
        private String apellido;
        private int edad ;
        private String sexo;
        private String trabajo;
        private String direccion;
        
        ///Metodos publicos
        public String getNombre(){
        return nombre;
        }
        public String getApellido(){
        return apellido;
        }
        public int getEdad(){
        return edad;
        }
        public String getSexo(){
        return sexo;
        }
        
        public String getDireccion(){
        return direccion;
        }
        ///Metodos privados de la clase 
        private void setNombre(String nombre) {
            this.nombre=nombre;   
        }
        private void setApellido(String apellido) {
            this.apellido=apellido;   
        }
        private void setEdad(int edad) {
            this.edad=edad;
            
        }
        private void setSexo(String sexo) {
            this.sexo=sexo;   
        }
      
        private void setDireccion(String direccion) {
            this.direccion=direccion;   
        }
        
    }
    public static class Doctor{////clase doctor
    private String trabajo;///atributo
    ///metodo publico
    public String getTrabajo(){
        return trabajo;
    }
    ///Metodo privado
    private void setTrabajo(String trabajo) {
            this.trabajo=trabajo;   
    }
    
}
}
