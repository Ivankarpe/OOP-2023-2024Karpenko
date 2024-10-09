public class Main {
    public static void main(String[] args) {
        FruitProduct apple = new FruitProduct("Apple", 5);
        FruitProduct banana = new FruitProduct("Banana", 2);
        FruitProduct orange = new FruitProduct("Orange", 15);

        ElectronicProduct laptop = new ElectronicProduct("Laptop", 1500);
        ElectronicProduct tablet = new ElectronicProduct("Tablet", 500);
        ElectronicProduct smatphone = new ElectronicProduct("Smatphone", 1000);
        ElectronicProduct headPhones = new ElectronicProduct("HeadPhones", 100);

        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.addProduct(apple);
        shoppingCard.addProduct(orange);
        shoppingCard.addProduct(banana);
        shoppingCard.addProduct(tablet);
        shoppingCard.addProduct(tablet);
        shoppingCard.addProduct(headPhones);
        shoppingCard.addProduct(laptop);
        shoppingCard.addProduct(smatphone);
        shoppingCard.showProducts();
    }
}