package ordering;

public abstract class TableOccupationStatus {

    private boolean tableOccupied;

    public TableOccupationStatus() {
        tableOccupied = false;
    }

    public boolean isTableOccupied(){
        return tableOccupied;
    }

    public void isBookedTable(){

        tableOccupied = true;
    }

    public void isRealiseTable(){

        tableOccupied = false;
    }
}
