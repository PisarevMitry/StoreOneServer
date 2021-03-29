package org.storeoneserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("hello")
public class CardController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getCard() {
        return "card";
    }
}
