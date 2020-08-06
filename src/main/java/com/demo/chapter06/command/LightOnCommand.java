package com.demo.chapter06.command;

import com.demo.chapter06.entity.Light;

/**
 * @author TMW
 * @date 2020/8/6 10:50
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
