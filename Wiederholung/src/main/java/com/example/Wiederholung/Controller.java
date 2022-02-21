package com.example.Wiederholung;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping( "map" )
@RestController
public class Controller {

    @GetMapping( "/key/{key}" )
    public String key( @PathVariable("key") String param ) {
        return MapService.string( param );
    }

}
