package org.sepia.skelly.gateway;

import org.sepia.skelly.scripting.AbstractSkellyModule;

public class SkellyGatewayModule extends AbstractSkellyModule {

    @Override
    protected String helloWorldImplementation() {
        return "Hello World!";
    }

    
}