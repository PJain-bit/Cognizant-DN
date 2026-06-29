package com.cognizant.springlearn.service;


import com.cognizant.springlearn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }

    public Country getCountry(String code) {
        List<Country> countries = getAllCountries();
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}