package com.quickstart.apitest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.core.MediaType;

@Controller
public class postApi {
    @RequestMapping(
            value = "/postpayload",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody String getMessage(@RequestBody MessagePayload payload) {
       return payload.getMessagePayload();
    }
}
