public class GameSpinner {
	private int sectorNum;
    private int prevSpin;
    private int combo;
    
    public GameSpinner(int sectorNum) {
    	this.sectorNum = sectorNum;
        prevSpin = 0;
        combo = 0;
    }
    
    public int spin() {
    	int num = (int) (Math.random() * sectorNum) + 1;
        if (num == prevSpin) {
            combo++;
        } else {
            prevSpin = num;
            combo = 1;
        }
        return num;
    }
    
    public int currentRun() {
    	return combo;
    }
}