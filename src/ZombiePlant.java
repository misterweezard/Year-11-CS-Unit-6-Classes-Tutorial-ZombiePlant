public class ZombiePlant {
    private final int potency;
    private int treatments;
    public ZombiePlant(int x, int y) {
        potency = x;
        treatments = y;
    }
    public int treatmentsNeeded(){
        return treatments;
    }

    public boolean isDangerous(){
        if(treatments > 0){
            return true;
        }
        else
            return false;
    }
    public void treat(int treat){

        if(treat <= potency && treat > 0 && treatments > 0){
            treatments--;
        }
        if(treat > potency){
            treatments++;
        }
    }
    public int getPotencyRequired(){
        return potency;
    }
}