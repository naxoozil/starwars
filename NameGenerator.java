
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    /**
     * Metodo para crear un nombre de Star Wars a partir de lo pedido
     * 
     */
    public void generateStarWarsName(String tuPrimerApellido, String nombre, String primerApellidoMadre, String nombreCiudadNacimiento)
    {
        String nombreStarWars = tuPrimerApellido.substring(0,3) + nombre.substring(0,3);
        String apellidoStarWars = primerApellidoMadre.substring(0,2) + nombreCiudadNacimiento.substring(0,3);
        System.out.println(nombreStarWars + " " + apellidoStarWars);
    }
}
