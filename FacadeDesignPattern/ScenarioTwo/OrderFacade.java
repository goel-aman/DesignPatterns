package FacadeDesignPattern.ScenarioTwo;

public class OrderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade() {
        productDao = new ProductDao();
        invoice = new Invoice();
        payment = new Payment();
        sendNotification = new SendNotification();
    }

    public void placeOrder() {
        Product product = productDao.getProduct(12);
        invoice.generateInvoice();
        boolean paymentStatus = payment.makePayment();
        sendNotification.sendNotification();
        // order creation successful..
    }
}
