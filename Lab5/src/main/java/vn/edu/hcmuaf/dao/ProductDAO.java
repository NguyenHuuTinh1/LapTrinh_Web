package vn.edu.hcmuaf.dao;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import vn.edu.hcmuaf.db.Query;
import vn.edu.hcmuaf.model.Product;

import java.util.List;

@RegisterBeanMapper(Product.class)
public interface ProductDAO {
    @SqlQuery(Query.SELECT_ALL_PRODUCT)
    List<Product> getAllProduct();
}
