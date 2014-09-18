package org.greypowerservices.services.endpoint;

import org.greypowerservices.entities.Product;
import org.greypowerservices.services.ProductService;
import org.greypowerservices.webservices.ChemicalProduct;
import org.greypowerservices.webservices.productservice.ChemicalProductRequest;
import org.greypowerservices.webservices.productservice.ChemicalProductResponse;
import org.greypowerservices.webservices.productservice.CreateChemicalProductRequest;
import org.greypowerservices.webservices.productservice.CreateChemicalProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProductServiceEndPoint {

	private static final String TARGET_NAMESPACE = "http://org/greypowerservices/webservices/productservice";
	
	@Autowired
	ProductService productService;
	
	@PayloadRoot(localPart = "ChemicalProductRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload ChemicalProductResponse getChemicalProduct(@RequestPayload ChemicalProductRequest chemicalProductRequest) {
		
		ChemicalProductResponse chemicalProductResponse = new ChemicalProductResponse();
		
		Product product = 
				productService.getChemicalProduct(1L);
		
		ChemicalProduct chemicalProduct = new ChemicalProduct();
		chemicalProduct.setId(product.getId());
		chemicalProduct.setName(product.getName());
		chemicalProduct.setDescription(product.getDescription());
		
		chemicalProductResponse.setChemicalProduct(chemicalProduct);
		
		return chemicalProductResponse;
		
	}
	
	@PayloadRoot(localPart = "CreateChemicalProductRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload CreateChemicalProductResponse createChemicalProduct(@RequestPayload CreateChemicalProductRequest createChemicalProductRequest) {
		
		CreateChemicalProductResponse createChemicalProductResponse = new CreateChemicalProductResponse();
		
		org.greypowerservices.entities.ChemicalProduct  chemicalProduct = new org.greypowerservices.entities.ChemicalProduct();
		
		chemicalProduct.setName(createChemicalProductRequest.getChemicalProduct().getName());
		chemicalProduct.setDescription(createChemicalProductRequest.getChemicalProduct().getDescription());
		chemicalProduct.setUnitMeasure(createChemicalProductRequest.getChemicalProduct().getUnitMeasureId());
		chemicalProduct.setUnitPrice(createChemicalProductRequest.getChemicalProduct().getUnitPrice());
		chemicalProduct.setImagePath(createChemicalProductRequest.getChemicalProduct().getImagePath());
		
		Long id = 
				productService.createChemicalProduct(chemicalProduct);
		
		createChemicalProductResponse.setId(id);
		
		return createChemicalProductResponse;
		
	}
}
