package proyect;

public class empleado {
    public string nombre;
    public string cargo;
    
    private String nombre;
    private String cargo;

 
    public empleado (string nombre,string cargo){
        this.nombre=nombre
                this.cargo=cargo;
      
    }
    public string getNombre(){
    public String getcargo() { return cargo; }
        
    }

public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }
    
}
