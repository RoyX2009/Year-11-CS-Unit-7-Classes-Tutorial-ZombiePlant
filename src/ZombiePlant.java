public class ZombiePlant {
    private int maxPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int treatmentsNeeded) {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }
    public int getPotency() {
        return maxPotency;
    }
    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }
    public boolean isDangerous() {
        if (treatmentsNeeded >= 1) {
            return true;
        }
        return false;
    }
    public void treat(int potency) {
        if (potency <= 0) {
            return;
        }

        if (potency <= maxPotency) {
            if (treatmentsNeeded > 0) {
                treatmentsNeeded--;
            }
        } else {
            treatmentsNeeded++;
        }
    }
}
