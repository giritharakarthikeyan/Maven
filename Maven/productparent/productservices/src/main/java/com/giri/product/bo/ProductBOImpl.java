package com.giri.product.bo;

import com.giri.product.dao.ProductDAO;
import com.giri.product.dao.ProductDAOImpl;
import com.giri.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
