package org.greypowerservices.services.endpoint;

import java.util.List;

import org.greypowerservices.entities.Product;
import org.greypowerservices.entities.UnitMeasure;
import org.greypowerservices.services.ProductService;
import org.greypowerservices.webservices.ChemicalProduct;
import org.greypowerservices.webservices.productservice.ChemicalProductRequest;
import org.greypowerservices.webservices.productservice.ChemicalProductResponse;
import org.greypowerservices.webservices.productservice.CreateChemicalProductRequest;
import org.greypowerservices.webservices.productservice.CreateChemicalProductResponse;
import org.greypowerservices.webservices.productservice.GetChemicalProductsRequest;
import org.greypowerservices.webservices.productservice.GetChemicalProductsResponse;
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
		chemicalProduct.setUnitMeasure(new UnitMeasure(createChemicalProductRequest.getChemicalProduct().getUnitMeasureId(), null, null));
		chemicalProduct.setUnitPrice(createChemicalProductRequest.getChemicalProduct().getUnitPrice());
		chemicalProduct.setImagePath(createChemicalProductRequest.getChemicalProduct().getImagePath());
		
		Long id = 
				productService.createChemicalProduct(chemicalProduct);
		
		createChemicalProductResponse.setId(id);
		
		return createChemicalProductResponse;
		
	}
	
	@PayloadRoot(localPart = "GetChemicalProductsRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload GetChemicalProductsResponse GetChemicalProducts(@RequestPayload GetChemicalProductsRequest getChemicalProductsRequest) {
		
		GetChemicalProductsResponse getChemicalProductsResponse = new GetChemicalProductsResponse();

		List<org.greypowerservices.entities.ChemicalProduct> chemicalProducts = productService.getAllChemicalProducts();
		
		for (org.greypowerservices.entities.ChemicalProduct chemicalProduct: chemicalProducts) {
			org.greypowerservices.webservices.ChemicalProduct chemicalProduct2 = new org.greypowerservices.webservices.ChemicalProduct();
			chemicalProduct2.setId(chemicalProduct.getId());
			chemicalProduct2.setName(chemicalProduct.getName());
			chemicalProduct2.setDescription(chemicalProduct.getDescription());
			chemicalProduct2.setImagePath(chemicalProduct.getImagePath());
			chemicalProduct2.setUnitPrice(chemicalProduct.getUnitPrice());
			chemicalProduct2.setUnitMeasureId(chemicalProduct.getUnitMeasure().getId());
			getChemicalProductsResponse.getChemicalProduct().add(chemicalProduct2);
		}

		return getChemicalProductsResponse;
		
	}
}
