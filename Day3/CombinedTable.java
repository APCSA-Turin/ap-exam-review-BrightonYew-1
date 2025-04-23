public class CombinedTable {
	SingleTable tab1;
	SingleTable tab2;
	public CombinedTable(SingleTable tab1, SingleTable tab2) {

	this.tab1 = tab1;
	this.tab2 = tab2;

}

    public double getDesirability() {
            if (tab1.getHeight() == tab2.getHeight()) {
                return (tab1.getViewQuality() + tab2.getViewQuality()) / 2;
            } else {
                return (tab1.getViewQuality() + tab2.getViewQuality()) / 2 - 10;
            }
        }

    public boolean canSeat(int num) {
    int numseats = tab1.getNumSeats() + tab2.getNumSeats() - 2;
    if (numseats >= num) {
        return true;
    } else {
        return false;
    }
    }
}

