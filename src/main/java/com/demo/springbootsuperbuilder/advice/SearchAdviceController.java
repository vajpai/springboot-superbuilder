package com.demo.springbootsuperbuilder.advice;

import com.demo.springbootsuperbuilder.bean.ProductRequestParams;
import com.demo.springbootsuperbuilder.bean.SearchRequestParams;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class SearchAdviceController {

    @ModelAttribute("searchRequestParams")
    public SearchRequestParams populateDefaultValuesForSearchRequest() {
        return SearchRequestParams.builder().build();
    }

    @ModelAttribute("productRequestParams")
    public ProductRequestParams populateDefaultValuesForProductRequest() {
        return ProductRequestParams.builder().build();
    }
}
