package com.project.loginservice.service;

import com.project.loginservice.pojo.BuyerSignupPojo;
import com.project.loginservice.pojo.SellerSignupPojo;

public interface SellerSignupService {
	SellerSignupPojo validateSeller(SellerSignupPojo sellerSignupPojo);
	SellerSignupPojo getItems(int SellerId);
}
