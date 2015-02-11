package com.lumagaizen.minecraftshop.repository;

import com.lumagaizen.minecraftshop.model.ShopUser;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Taylor
 */
public class UserRepository
{
    public boolean insertShopUser(ShopUser user){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public ShopUser getShopUserByUserId(int userId){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public ShopUser getShopUserByUsername(String username){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public ShopUser getShopUserByUUIDStr(String uuidStr){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public ShopUser getShopUserByUUID(UUID uuid){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public ArrayList<ShopUser> getShopUsersByIpv4(String ipv4){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public boolean updateShopUserByUserId(ShopUser su){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public boolean updateShopUserByUsername(ShopUser su){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public boolean updateShopUserByUUIDStr(ShopUser su){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public boolean deleteShopUserByUUIDStr(String uuidStr){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public boolean deleteShopUserByUsername(String username){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public boolean deleteShopUserByUserId(int userId){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
