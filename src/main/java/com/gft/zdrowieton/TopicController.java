package com.gft.zdrowieton;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TopicController {

    @MessageMapping("/send/{topicName}")
    @SendTo("/topic/{topicName}")
    public String passThrough(@DestinationVariable String topicName, String message) throws Exception {
        return message;
    }
}
