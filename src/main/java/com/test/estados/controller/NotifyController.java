package com.test.estados.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/notificar")
public class NotifyController {
    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@Validated @RequestBody NotifyAdd notifyAdd){
        log.info("*************************************************");
        log.info("****ID:"+notifyAdd.getId_fulfilment()+"********ESTADOS:"+notifyAdd.getEstados());
        log.info("*************************************************");
    }
}
