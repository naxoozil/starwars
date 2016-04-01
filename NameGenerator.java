
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    public static final int VALOR_INICIAL = 0;
    public static final int VALOR_FINAL_TU_PRIMER_APELLIDO =3;
    public static final int VALOR_FINAL_NOMBRE =3;
    public static final int VALOR_FINAL_PRIMER_APELLIDO_MADRE =2;
    public static final int VALOR_FINAL_NOMBRE_CIUDAD =3;
    
    /**
     * Metodo para crear un nombre de Star Wars a partir de lo pedido
     * 
     */
    public void generateStarWarsName(String tuPrimerApellido, String nombre, String primerApellidoMadre, String nombreCiudadNacimiento)
    {
        
        String nombreStarWars = tuPrimerApellido.substring(NameGenerator.VALOR_INICIAL,NameGenerator.VALOR_FINAL_TU_PRIMER_APELLIDO) + nombre.substring(NameGenerator.VALOR_INICIAL,NameGenerator.VALOR_FINAL_NOMBRE);
        String apellidoStarWars = primerApellidoMadre.substring(NameGenerator.VALOR_INICIAL,NameGenerator.VALOR_FINAL_PRIMER_APELLIDO_MADRE) + nombreCiudadNacimiento.substring(NameGenerator.VALOR_INICIAL,NameGenerator.VALOR_FINAL_NOMBRE_CIUDAD);
        System.out.println(nombreStarWars + " " + apellidoStarWars);
    }
}
