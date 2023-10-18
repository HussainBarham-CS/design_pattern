package com.example.demo.Model;

import com.example.demo.Country;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String firstName;
    private String lastName;
    private Country country;

}
