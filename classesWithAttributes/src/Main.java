public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(2,"Laptop","MSİ  Laptop",18000,2);

        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(15000);
        product.setStockAmount(5);
        product.setId(1);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Ürün kodu: " + product.getKod());

        productManager.add(product1);
        System.out.println("Ürün kodu: " + product1.getKod());


    }
}