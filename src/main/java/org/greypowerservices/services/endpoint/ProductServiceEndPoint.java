package org.greypowerservices.services.endpoint;

import org.greypowerservices.entities.Product;
import org.greypowerservices.services.ProductService;
import org.greypowerservices.webservices.ChemicalProduct;
import org.greypowerservices.webservices.productservice.ChemicalProductRequest;
import org.greypowerservices.webservices.productservice.ChemicalProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProductServiceEndPoint {

	private static final String TARGET_NAMESPACE = "http://org/greypowerservices/webservices/productservice";
	
	@Autowired
	private ProductService productService;
	
	@PayloadRoot(localPart = "ChemicalProductRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload ChemicalProductResponse getChemicalProduct(@RequestPayload ChemicalProductRequest chemicalProductRequest) {
		
		ChemicalProductResponse chemicalProductResponse = new ChemicalProductResponse();
		
		Product product = productService.getChemicalProduct(chemicalProductRequest.getId());
		
		ChemicalProduct chemicalProduct = new ChemicalProduct();
		chemicalProduct.setId(product.getId());
		chemicalProduct.setName(product.getName());
		chemicalProduct.setDescription(product.getDescription());
		
		return chemicalProductResponse;
		
	}
}