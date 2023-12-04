package vn.edu.hcmuaf;

import vn.edu.hcmuaf.Service.ProductService;
import vn.edu.hcmuaf.dao.ProductDAO;
import vn.edu.hcmuaf.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product")
public class ProductController extends javax.servlet.http.HttpServlet {
    ProductService productService;

    public ProductController() {
        this.productService = ProductService.getInstance();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productService.findAllProduct();
        System.out.println(products);
        request.setAttribute("products", products);
        request.getRequestDispatcher("/views/task3/product.jsp").forward(request, response);
    }

}
