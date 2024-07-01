package stage2;

public class Article {
    private String ean;
    private String name;
    private double currentPrice;
    private int itemsInStock;

    /*
     * Provided ean must be a fully valid European Article Number according to the official definition.
     */
    public Article(String ean, String name) {
        // prompt: implement constructor taking into consideration the comment above
        if (!isValidEAN(ean)) {
            throw new IllegalArgumentException("Invalid EAN");
        }
        this.ean = ean;
        this.name = name;
    }

    public String getEan() {
        return ean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    // added by Copilot:
    private boolean isValidEAN(String ean) {
        if (ean == null || ean.length() != 13) {
            return false;
        }

        try {
            int sum = 0;
            for (int i = 0; i < 12; i++) {
                int digit = Integer.parseInt(ean.substring(i, i + 1));
                sum += (i % 2 == 0) ? digit : digit * 3;
            }

            int checksum = 10 - (sum % 10);
            if (checksum == 10) {
                checksum = 0;
            }

            return checksum == Integer.parseInt(ean.substring(12));
        } catch (NumberFormatException nfe) {
            // EAN was not a number
            return false;
        }
    }
}