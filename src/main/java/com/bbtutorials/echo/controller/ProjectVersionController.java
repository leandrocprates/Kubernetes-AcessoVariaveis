package com.bbtutorials.echo.controller;

import com.bbtutorials.echo.model.Retorno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
@RequestMapping("/api/v1/version")
public class ProjectVersionController {


    @Autowired(required = false)
    @Qualifier("podInfoAnnotations")
    private Properties podInfoAnnotations;

    @GetMapping(value = "/k8s", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Retorno> k8sVersion() {

        String build = (String) podInfoAnnotations.get("build");
        System.out.println("Build "+build);

        String builder = (String) podInfoAnnotations.get("builder");
        System.out.println("Builder "+builder);

        Retorno retornoValue = new Retorno();
        retornoValue.getMapRetorno().put("build" , build) ;
        retornoValue.getMapRetorno().put("builder" , builder) ;

        return ResponseEntity.ok(retornoValue);
    }
}
