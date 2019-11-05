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
        if (calculateTotalPages(pages, copies) <= this.sheets) {
            this.sheets -= calculateTotalPages(pages, copies);
            useToner(pages, copies);
        }
    }

    public void useToner(int pages, int copies) {
        for (int i = calculateTotalPages(pages, copies); i > 0; i -= 1 ) {
            this.tonerVolume -= 1;
        }
    }

    public int calculateTotalPages(int pages, int copies) {
        return pages * copies;
    }


}
