public class Printer {

    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages <= this.sheets) {
            this.sheets -= totalPages;
        }

    }

}
