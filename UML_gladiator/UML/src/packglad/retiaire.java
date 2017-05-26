package packglad;

public class retiaire extends gladiateur {
    /**
     * @attribute
     */
    private static String c_type = "retiaire";

    /**
     * @attribute
     */
    private static Integer c_force = 30;

    /**
     * @attribute
     */
    private Integer agilité;

    public retiaire(String nom_gladiateur, Integer agilité, Integer idg, Integer vie) {
        super(idg, nom_gladiateur, c_type, c_force, vie);
        this.agilité = agilité;
    }

    public void modifInit(Integer agilité, Integer force) {
        this.agilité = agilité;
        packglad.retiaire.c_force = force;
    }

    public String Rapport() {
        
    }
}
