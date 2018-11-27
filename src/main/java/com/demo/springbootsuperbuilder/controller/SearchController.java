package com.demo.springbootsuperbuilder.controller;

import com.demo.springbootsuperbuilder.bean.ProductRequestParams;
import com.demo.springbootsuperbuilder.bean.SearchRequestParams;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @RequestMapping("/")
    public String index() {
        StringBuilder sb = new StringBuilder(500);
        sb.append("Greetings from  search for @SuperBuilder Demo !!");
        return sb.toString();
    }

    @GetMapping("/search")
    public ResponseEntity<SearchRequestParams> getSearchTerms(@ModelAttribute("searchRequestParams") SearchRequestParams searchRequestParams){

        return new ResponseEntity<SearchRequestParams>(searchRequestParams, HttpStatus.OK);
    }

    @GetMapping("/productSearch")
    public ResponseEntity<ProductRequestParams> getSearchTerms(@ModelAttribute("productRequestParams") ProductRequestParams productRequestParams){
        return new ResponseEntity<ProductRequestParams>(productRequestParams, HttpStatus.OK);
    }

    
}
