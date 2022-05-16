package com.dubbo.SPI;


import org.apache.dubbo.common.extension.ExtensionLoader;

public class DubboSPITest {

    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot simpleRobot = extensionLoader.getExtension("SimpleRobot");
        simpleRobot.sayHello();
        Robot extendRobot = extensionLoader.getExtension("ExtendRobot");
        extendRobot.sayHello();
    }
}
