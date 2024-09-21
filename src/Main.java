public class Main {
    public static void main(String[] args) {

        Hero[] hero ={new Warrior(),new Magic(),new Medic()};
        for(HavingSuperAbility hv : hero){
            hv.applySuperAbility();
            if (hv instanceof Medic){
                ((Medic) hv).increaseExperience();
            }

        }

    }
}