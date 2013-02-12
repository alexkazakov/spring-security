package com.saritasa.spring.controllers;

import com.saritasa.spring.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.Collections;
import java.util.List;

@Controller
public class ProductsController {
    @Autowired
    private View view;

    @RequestMapping(value = "/rest/products/list", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ModelAndView getProducts() {
        List<Product> products = Collections.singletonList(new Product("glass-wiper", 10.5f));
        return new ModelAndView(view, "data", products);
    }

    @RequestMapping(value = "/rest/products", method = {RequestMethod.POST}, headers = "Accept=application/json")
    @ResponseStatus(HttpStatus.OK)
    public void addProduct(@RequestBody Product aProduct) {
        System.out.println(aProduct);
    }

    public void setView(View view) {
        this.view = view;
    }
}
