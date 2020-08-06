package com.demo.chapter06;

import com.demo.chapter06.command.Command;

/**
 * @author TMW
 * @date 2020/8/6 11:42
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
