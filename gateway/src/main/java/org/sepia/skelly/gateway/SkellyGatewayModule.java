package org.sepia.skelly.gateway;

import org.sepia.skelly.common.AbstractSkellyModule;

public class SkellyGatewayModule extends AbstractSkellyModule {

    @Override
    protected String helloWorldImplementation() {
        return "Hello World!";
    }

    
}