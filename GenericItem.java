class GenericItem implements Cloneable {
    public int ID;
    public String name;
    public float price;
    public Category category;
    public GenericItem analog = null;

    GenericItem(int IDObj, String nameObj, float priceObj) {
        this.ID = IDObj;
        this.name = nameObj;
        this.price = priceObj;
        this.category = Category.GENERAL;
    }

    GenericItem(int IDObj, String nameObj, float priceObj, Category categoryObj) {
        ID = IDObj;
        name = nameObj;
        price = priceObj;
        category = categoryObj;
    }


    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category:%s \n", ID, name, price, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        GenericItem otherObj = (GenericItem) o;
        return (this.ID == otherObj.ID && this.name.equals(otherObj.name)
                && this.price == otherObj.price && this.category == otherObj.category);
    }

    @Override
    public GenericItem clone() {
        try {
            if (this.analog != null) {
                this.analog.clone();
            }
            return (GenericItem) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }

    @Override
    public String toString() {
        return this.name + " {" +
                "ID=" + ID +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
