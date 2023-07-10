package com.core.dao.product;

import com.core.model.product.Product;
import com.core.model.product.sql.ProductQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

   @Query(nativeQuery = true, value = ProductQuery.FIND_BY_CODE)
   List<Product> findByCode(@Param("code") String code);

    @Query(nativeQuery = true, value = ProductQuery.FIND_ALL_BY_CATEGORY_ID)
    List<Product> findAllByCategoryID(@Param("categoryID") long categoryID);

    @Query(nativeQuery = true, value = ProductQuery.FIND_ALL_BY_CATEGORY_NAME)
    List<Product> findAllByCategoryName(@Param("categoryID") String categoryName);

    @Query(nativeQuery = true, value = ProductQuery.GET_COUNT_FOR_CATEGORY)
    Integer getCountForCategory(String categoryName);
}
