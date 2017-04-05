package com.gft.zdrowieton;

import javafx.beans.value.ObservableListValue;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TopicController {

    @MessageMapping("/send/{topicName}")
    @SendTo("/topic/{topicName}")
    public String passThrough(@DestinationVariable String topicName, String message) throws Exception {


        return message;
    }
}
