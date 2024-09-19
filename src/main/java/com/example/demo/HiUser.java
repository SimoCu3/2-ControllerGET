package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HiUser {

    @GetMapping(path = "ciao/{citta}")
    public User2 ciao(
            @PathVariable String citta,
            @RequestParam(required = true) String nome)
    {
        return new User2(nome, citta);
    }
    //http://localhost:8080/v2/ciao/Lombardia?nome=Giuseppe

}
