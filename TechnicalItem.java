public class TechnicalItem extends GenericItem implements Cloneable {
    public short warrantyTime;

    TechnicalItem(int IDObj, String nameObj, float priceObj, short warTime) {
        super(IDObj, nameObj, priceObj);
        warrantyTime = warTime;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , days of warranty: %s \n",
                ID, name, price, warrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        TechnicalItem otherObj = (TechnicalItem) o;
        return (this.ID == otherObj.ID && this.name.equals(otherObj.name)
                && this.price == otherObj.price && this.category == otherObj.category
                && this.warrantyTime == otherObj.warrantyTime);
    }

    @Override
    public TechnicalItem clone() {
        return (TechnicalItem) super.clone();
    }

    @Override
    public String toString() {
        return this.name + " {" +
                "ID=" + ID +
                ", price=" + price +
                ", category=" + category +
                ", time of warranty=" + warrantyTime +
                '}';
    }
}
