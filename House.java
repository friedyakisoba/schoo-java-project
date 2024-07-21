public class House {
    private int mls;
    private int bedrooms;
    private double price;
    private String seller;

    public House(int mls, int bedrooms, double price, String seller) throws HouseException {
        if (mls <= 0 || bedrooms <= 0 || price <= 0 || seller == null || seller.isEmpty()) {
            throw new HouseException("Invalid house details");
        }
        this.mls = mls;
        this.bedrooms = bedrooms;
        this.price = price;
        this.seller = seller;
    }

    public int getMls() {
        return mls;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public double getPrice() {
        return price;
    }

    public String getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return "House{" +
                "mls=" + mls +
                ", bedrooms=" + bedrooms +
                ", price=" + price +
                ", seller='" + seller + '\'' +
                '}';
    }
}
