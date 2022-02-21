package com.example.Wiederholung;


import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping( "map" )
@RestController
public class Controller {

    @GetMapping( "/key/{key}" )
    public String key( @PathVariable("key") String param ) {
        return MapService.string( param );
    }
    @GetMapping( "/add/{key}/{value}" )
    public String add( @PathVariable("key") String param,  @PathVariable("value") String param2 ) {
        return MapService.add( param, param2 );
    }
    @GetMapping( "/returnKeys" )
    public Set<String> add() {return MapService.returnKeys( );
    }

}
