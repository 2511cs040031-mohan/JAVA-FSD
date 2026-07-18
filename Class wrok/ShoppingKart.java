public class ShoppingKart {
    private product[] items = new Product[10];

    private List<Product> items = new ArrayList<>();

    public void addproduct(Product product) {
        items.add(product);
    }
}