package com.lumagaizen.minecraftshop.service;

import com.lumagaizen.minecraftshop.model.ShopUser;
import com.lumagaizen.minecraftshop.repository.UserRepository;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Taylor
 */
public class UserService
{
    private final UserRepository repo;
    public UserService()
    {
        this.repo = new UserRepository();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Create/ Insert">
    /**
     * Inserts a new user object into the database. UserID does not need to be
     * set for this to work. 
     * @param user
     * @return 
     */
    public boolean insertShopUser(ShopUser user){
        return this.repo.insertShopUser(user);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Retrieve / Get">
    /**
     * Retrieve a user by their userId in the database. This is generally
     * considered to be the fastest method of retrieval due to how the 
     * indexing works.
     * @param userId
     * @return 
     */
    public ShopUser getShopUserByUserId(int userId){
        return this.repo.getShopUserByUserId(userId);
    }
    
    /**
     * Retrieve a user by their username in the database. Users can change their
     * names in minecraft, so this is not considered an entirely reliable method
     * of retrieval. Still, if a user is currently logged into the server and
     * their username is what you search for, that will work. 
     * indexing works.
     * @param username
     * @return 
     */
    public ShopUser getShopUserByUsername(String username){
        return this.repo.getShopUserByUsername(username);
    }
    
    /**
     * Retrieve a user by the string representation of their UUID. UUIDs in 
     * minecraft are persistent and will never change for a user unless their
     * UUID is being updated into the DB for the first time. Otherwise, consider
     * it to be a reliable method of user identification. 
     * @param uuidStr
     * @return 
     */
    public ShopUser getShopUserByUUIDStr(String uuidStr){
        return this.repo.getShopUserByUUIDStr(uuidStr);
    }
    
    /**
     * Retrieve a user by their UUID. UUIDs in  minecraft are persistent and 
     * will never change for a user unless their UUID is being updated into 
     * the DB for the first time. Otherwise, consider it to be a reliable 
     * method of user identification. 
     * @param uuid
     * @return 
     */
    public ShopUser getShopUserByUUID(UUID uuid){
        return this.repo.getShopUserByUUID(uuid);
    }
    
    /**
     * Fetches zero to many ShopUsers by a matching Ipv4 address. This method
     * can be used to find alternate accounts. 
     * @param ipv4
     * @return 
     */
    public ArrayList<ShopUser> getShopUsersByIpv4(String ipv4){
        return this.repo.getShopUsersByIpv4(ipv4);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Update">
    public boolean updateShopUserByUserId(int userId, ShopUser su){
        return this.repo.updateShopUserByUserId(su);
    }
    
    public boolean updateShopUserByUsername(ShopUser su){
        return this.repo.updateShopUserByUsername(su);
    }
    
    public boolean updateShopUserByUUIDStr(ShopUser su){
        return this.repo.updateShopUserByUUIDStr(su);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Delete">
    public boolean deleteShopUserByUUIDStr(String uuidStr){
        return this.repo.deleteShopUserByUUIDStr(uuidStr);
    }
    
    public boolean deleteShopUserByUsername(String username){
        return this.repo.deleteShopUserByUsername(username);
    }
    
    public boolean deleteShopUserByUserId(int userId){
        return this.repo.deleteShopUserByUserId(userId);
    }
    //</editor-fold>
}
