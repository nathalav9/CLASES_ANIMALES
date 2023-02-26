/**
 *
 * @author nataj
 */
public class principal {

    
    public static void main(String[] args) {
        
        
        Domesticos domesticos = new Domesticos ("Gato","Felino","Felis catus/Doméstico","Siamés","Maullido","Carnívoro","habilidades para cazar","Acicalamiento");
        System.out.println("EJEMPLO ANIMALES DOMÉSTICOS");
        System.out.println("1");
        domesticos.mostrarDatos();
        
        
        Domesticos caballo = new Domesticos ("Caballo","Equino","mamífero perisodáctilo","Caballo árabe","Relinchar","Hervívoros","Cargar objetos pesados","Correr altas velocidades");
        System.out.println("2");
        caballo.mostrarCaballo();
        
        Domesticos Gallina = new Domesticos ("Gallina","faisánidos","Gallus","Gallina Leghorn","cacareo","Dirunas","","Baño de polvo");
        System.out.println("3");
        Gallina.mostrarGallina();
        
        
   
        Salvajes salvajes = new Salvajes ("Jirafa","Jiráfidos","Mamífero","Jirafa africana","Resoplidos, bufidos, sonidos de baja frecuencia","Hervívoro","Instinto supervivencia","Adaptación al entorno");
        System.out.println("EJEMPLOS DE ANIMALES SALVAJES");
        System.out.println("1");
        salvajes.mostrarDatosSalvajes();

        Salvajes Elefante = new Salvajes ("Elefante","paquidermos","Mamífero","Elefantes africanos","Barritar  ","Hervívoro","Instinto protector","Bañarse en lagos");
        System.out.println("2");
        Elefante.mostrarElefantes();
        
        
        Salvajes Lobo = new Salvajes ("Lobo","Cánidos","Mamífero","Lobo Gris"," Aullar","Carnívoros","Comunicacion corporal"," Sentido de olfato de audiocion");
        System.out.println("3");
        Lobo.mostrarLobo();
        
    }
    
}
