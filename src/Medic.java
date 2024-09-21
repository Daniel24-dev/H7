public class Medic extends Hero{
    private double healPoints = 23;
    public void increaseExperience(){
        healPoints *= 1.1;
        System.out.println("Medic increase to"+healPoints+" points");
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic use healing");
    }
}
