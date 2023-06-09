package shopping;

import java.util.Set;

public class ClothingProduct extends Product implements Discountable {

    private int size;
    private String material;
    private Season season;

    public ClothingProduct() {
        super();
    }

    public ClothingProduct(String name, int price, Category category, int size, String material, Season season) {
        super(name, price, category);
        this.size = size;
        this.material = material;
        this.season = season;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public double calculateDiscountPrice() {
        return getPrice() * 0.9;
    }

    @Override
    public String getData() {
        return getName() + " prepared from " + getMaterial() + ", for "
                + getSeason().getName() + " season, with size "
                + getSize() + " that costs " + getPrice() + " USD";
    }
}
