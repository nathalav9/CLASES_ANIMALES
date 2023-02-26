public class Domesticos extends Animal {
    
   
    public String Sonido;
    public String Alimentacion;
    public String ComportamientoSimilar1;
    public String ComportamientoSimilar2;
    
    
   public Domesticos(String Nombre, String Familia, String Especie, String Raza, String Sonido, String Alimentacion, String ComportamientoSimilar1 , String ComportamientoSimilar2){
     super (Nombre,Familia,Especie,Raza);
     this.Sonido = Sonido;
     this.Alimentacion = Alimentacion;
     this.ComportamientoSimilar1 = ComportamientoSimilar1;
     this.ComportamientoSimilar2 = ComportamientoSimilar2;
   
   
   }
   public void mostrarDatos(){
       System.out.println("Nombre:"+getNombre()+
        "\nFamilia:"+getFamilia()+
        "\nEspecie:"+getEspecie()+
        "\nRaza:"+getRaza()+ 
        "\nsonido:"+Sonido+
        "\nalimentacion:"+Alimentacion+
         "\nsonido:"+ComportamientoSimilar1+
        "\nalimentacion:"+ComportamientoSimilar2
       
               );
   
   } 
   
    public void mostrarCaballo(){
       System.out.println("Nombre:"+getNombre()+
        "\nFamilia:"+getFamilia()+
        "\nEspecie:"+getEspecie()+
        "\nRaza:"+getRaza()+ 
        "\nsonido:"+Sonido+
        "\nalimentacion:"+Alimentacion+
         "\nsonido:"+ComportamientoSimilar1+
        "\nalimentacion:"+ComportamientoSimilar2
       
               );
   
   } 
    
    
     public void mostrarGallina(){
       System.out.println("Nombre:"+getNombre()+
        "\nFamilia:"+getFamilia()+
        "\nEspecie:"+getEspecie()+
        "\nRaza:"+getRaza()+ 
        "\nsonido:"+Sonido+
        "\nalimentacion:"+Alimentacion+
         "\nsonido:"+ComportamientoSimilar1+
        "\nalimentacion:"+ComportamientoSimilar2
       
               );
   
   } 
   
}

