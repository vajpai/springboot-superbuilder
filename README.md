# springboot-superbuilder
Lombok @SuperBuilder demo application

This project is build on Spring Boot 2.1.0 and lombok experimental version v1.18.0 for @SuperBuilder.


This is possible with lombok 1.18.2 (and above) using the new (experimental) annotation @SuperBuilder. The only restriction is that every class in the hierarchy must have the @SuperBuilder annotation. There is no way around putting @SuperBuilder on all subclasses, because Lombok cannot know all subclasses at compile time. See the lombok documentation for details.

NOTE : 
1. Need to intialize/build the SearchRequestParams in the advice. Othwise it throws the error.

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

2. If you uses Intelliji IDE then "ProductRequestParams.builder().build();" builder shows error. But it wouldn't impact anything. Build get success. For eclipse no issues.
