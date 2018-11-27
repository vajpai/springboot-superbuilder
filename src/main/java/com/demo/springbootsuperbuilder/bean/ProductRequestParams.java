package com.demo.springbootsuperbuilder.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@ToString
public class ProductRequestParams extends BaseRequestParams {
    private String productSearch;
}
