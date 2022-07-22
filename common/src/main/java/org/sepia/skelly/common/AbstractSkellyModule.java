package org.sepia.skelly.common;

import com.inductiveautomation.ignition.common.BundleUtil;
import com.inductiveautomation.ignition.common.script.hints.ScriptArg;
import com.inductiveautomation.ignition.common.script.hints.ScriptFunction;

public abstract class AbstractSkellyModule implements SkellyMessage{

    static {
        BundleUtil.get().addBundle(
            AbstractSkellyModule.class.getSimpleName(),
            AbstractSkellyModule.class.getClassLoader(),
            AbstractSkellyModule.class.getName().replace('.', '/')
        );
    }

    @Override
    @ScriptFunction(docBundlePrefix = "AbstractSkellyModule")
    public String HelloWorld() {

        return helloWorldImplementation();
    }

    protected abstract String helloWorldImplementation();
}