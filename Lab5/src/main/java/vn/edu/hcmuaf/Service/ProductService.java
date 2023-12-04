package vn.edu.hcmuaf.Service;

import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import vn.edu.hcmuaf.dao.ProductDAO;
import vn.edu.hcmuaf.db.JDBIConnector;
import vn.edu.hcmuaf.model.Product;

import java.awt.*;
import java.util.List;

public class ProductService {
    private static ProductService instance;
    private static ProductDAO productDAO;

    public static ProductService getInstance() {
        if (instance == null) {
            productDAO = JDBIConnector.get().installPlugin(new SqlObjectPlugin()).onDemand(ProductDAO.class);
            instance = new ProductService(productDAO);

        }
        return instance;
    }
    private ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
    public List<Product> findAllProduct() {
        return productDAO.getAllProduct();
    }

    public static void main(String[] args) {
        ProductService productService = ProductService.getInstance();
        List<Product> products = productService.findAllProduct();
        System.out.println(products);
    }

}
