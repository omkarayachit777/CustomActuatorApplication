package com.example;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "loadMyName")
public class MyCustomActuator {

    @ReadOperation
    public String printMyCustomActuator() {
        return "Hello Omkar, This is your custom endpoint :)";
    }

    @WriteOperation
    public String printNameThroughUI(String name) {
        return "Hello " + name + ", This is your custom endpoint of write operation";
    }

    @DeleteOperation
    public String printNameUsingUI() {
        return "Hello !!! you name will be deleted..";
    }
}
