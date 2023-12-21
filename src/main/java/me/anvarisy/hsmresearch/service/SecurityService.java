package me.anvarisy.hsmresearch.service;

import org.springframework.stereotype.Service;

import com.safenetinc.luna.LunaSlotManager;

@Service
public class SecurityService extends HsmService{
    
    public Boolean checkMethod(){
        LunaSlotManager manager = super.initialize();
        if (manager == null){
            return false;
        }else{
            return true;
        }
        
    }
}
