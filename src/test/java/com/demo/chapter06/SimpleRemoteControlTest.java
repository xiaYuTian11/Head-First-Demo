package com.demo.chapter06;

import com.demo.chapter06.command.Command;
import com.demo.chapter06.command.LightOnCommand;
import com.demo.chapter06.entity.Light;
import org.junit.jupiter.api.Test;

/**
 * @author TMW
 * @date 2020/8/6 11:43
 */
class SimpleRemoteControlTest {

    @Test
    public void test() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Command command = new LightOnCommand(new Light());
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();

    }
}