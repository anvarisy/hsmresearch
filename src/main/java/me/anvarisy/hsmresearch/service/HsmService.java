package me.anvarisy.hsmresearch.service;

import com.safenetinc.luna.LunaSlotManager;

public class HsmService {
    
    public HsmService(){
        initialize();
    }

    protected LunaSlotManager initialize(){
        LunaSlotManager manager = LunaSlotManager.getInstance();
        Boolean status = manager.login(5, "p@ssw0rd");
        if(status){
            return manager;
        }else{
            throw new RuntimeException("Failed to login to the HSM!");
        }
    }
} 