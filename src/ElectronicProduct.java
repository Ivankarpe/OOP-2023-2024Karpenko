class ElectronicProduct extends Product{
    ElectronicProduct(String name, double price){
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.15;
    }
}