package org.sepia.skelly.client;

import org.sepia.skelly.common.AbstractSkellyModule;
import org.sepia.skelly.common.SkellyMessage;

import com.inductiveautomation.ignition.client.gateway_interface.ModuleRPCFactory;

public class SkellyClientModule extends AbstractSkellyModule {
    
    private final SkellyMessage rpc;

    public SkellyClientModule() {
        rpc = ModuleRPCFactory.create(
            "org.sepia.skelly",
            SkellyMessage.class
        );
    }

    @Override
    protected String helloWorldImplementation() {
        return rpc.HelloWorld();
    }
}