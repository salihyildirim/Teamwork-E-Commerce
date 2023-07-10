package com.core.model.product.sql;

public final class ProductQuery {
    public static final String FIND_BY_CODE = "SELECT * FROM products WHERE code = :code";
    public static final String FIND_ALL_BY_CATEGORY_ID = "SELECT p.* FROM products p JOIN categories c ON p.category_id = c.id WHERE c.id =?";
    public static final String FIND_ALL_BY_CATEGORY_NAME = "SELECT p.* FROM products p JOIN categories c ON p.category_id = c.id WHERE c.name =?";
    public static final String GET_COUNT_FOR_CATEGORY = "SELECT COUNT(p.*) FROM products p JOIN categories c ON p.category_id = c.id WHERE c.name =?";
}

