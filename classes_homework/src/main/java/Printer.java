public class Printer {

    private int sheets;
    private int tonerVolume;

    public Printer(int sheets, int tonerVolume) {
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner() {
        return this.tonerVolume;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages <= this.sheets) {
            this.sheets -= totalPages;
            for (int i = totalPages; i > 0; i -= 1 ) {
                useToner();
            }
        }
    }

    public void useToner() {
        this.tonerVolume -= 1;
    }
}
