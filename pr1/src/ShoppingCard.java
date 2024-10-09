import java.util.ArrayList;

class ShoppingCard {
    ArrayList <Product> productList = new ArrayList<Product>();
    double totalAmount = 0;
    double discount = 0;
    
    void addProduct(Product product){
        productList.add(product);
        totalAmount += product.price;
        discount += product.calculateDiscount();
    }
    
    
    

    void showProducts(){
        System.err.println("Aviable products");
        for(Product product : productList){
            System.err.println(product.name + " $" + product.price + " discount: " + product.calculateDiscount() + "$");
        }
        System.out.println("Total amount without discount: $" + totalAmount);
        double totalprice = totalAmount - discount;
        System.out.println("Total amount with discount: $" + totalprice);
    }
}