class FruitProduct extends Product{
    FruitProduct(String name, double price){
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return 0;
    }
}