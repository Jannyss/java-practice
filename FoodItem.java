import java.util.Date;

class FoodItem extends GenericItem implements Cloneable {
    public Date dateOfIncome;
    public short expires;

    FoodItem(int IDObj, String nameObj, float priceObj, Date dateInc, short exp) {
        super(IDObj, nameObj, priceObj);
        dateOfIncome = dateInc;
        expires = exp;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , date of income:%s , days to expire:%s \n",
                ID, name, price, dateOfIncome, expires);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        FoodItem otherObj = (FoodItem) o;
        return (this.ID == otherObj.ID && this.name.equals(otherObj.name)
                && this.price == otherObj.price && this.category == otherObj.category
                && this.dateOfIncome == otherObj.dateOfIncome && this.expires == otherObj.expires);
    }

    @Override
    public FoodItem clone() {
        return (FoodItem) super.clone();
    }

    @Override
    public String toString() {
        return this.name + " {" +
                "ID=" + ID +
                ", price=" + price +
                ", category=" + category +
                ", date of income=" + dateOfIncome +
                ", expires=" + expires +
                '}';
    }
}
