package org.sepia.skelly.client;

import com.inductiveautomation.ignition.common.script.ScriptManager;    // Import to use Script Manager
import com.inductiveautomation.ignition.common.script.hints.PropertiesFileDocProvider;  // Import to use FilesDocProvider
import com.inductiveautomation.vision.api.client.AbstractClientModuleHook;

/**
 * Client Hook for projects which target Vision
 *
 * @since <DATE>
 */
public class SkellyClientHook extends AbstractClientModuleHook {
    // override methods as required

    @Override
    public void initializeScriptManager(ScriptManager manager) {
        super.initializeScriptManager(manager);
        // Adds the function to the script library and can be ran from terminal
        manager.addScriptModule(
            "sepia.skelly",
            new SkellyClientModule(),
            new PropertiesFileDocProvider()
        );
    }
}
