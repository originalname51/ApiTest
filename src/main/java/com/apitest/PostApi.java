package com.apitest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.core.MediaType;

@Controller
public class PostApi {
    private Logger logger = LoggerFactory.getLogger(PostApi.class);
    @RequestMapping(
            value = "/postpayload",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody String getMessage(@RequestBody MessagePayload payload) {
        logger.info("Received message with payload : " + payload.getMessagePayload());
        return payload.getMessagePayload();
    }
}
