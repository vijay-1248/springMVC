package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.simple.services.ProductServices;

public class ProductController implements Controller{
	
	ProductServices product ; 
	
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		product.getProduct();
		mav.setViewName("product");
		
		
		return mav;
	}


	public void setProduct(ProductServices product) {
		this.product = product;
	}
	
	
	
}
