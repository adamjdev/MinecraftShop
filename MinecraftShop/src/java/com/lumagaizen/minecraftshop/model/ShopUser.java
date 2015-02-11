package com.lumagaizen.minecraftshop.model;

import static java.awt.SystemColor.text;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taylor
 */
public class ShopUser
{
    // Information we control. 
    private int userId = 0;
    private Timestamp lastUpdated = null;
    private int tokens = 0;
    private String username = "unique";
    private String ipv4 = null;
    private UUID uuid = null;
    private long lastLogin = 0;
    private long firstLogin = 0;
    
    // Information that requires user input at some point.
    private String displayName = null; 
    private String salt = null;
    private String passwordHash = null;

    
    
    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public long getFirstLogin()
    {
        return firstLogin;
    }

    public void setFirstLogin(long firstLogin)
    {
        this.firstLogin = firstLogin;
    }

    public Timestamp getLastUpdated()
    {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated)
    {
        this.lastUpdated = lastUpdated;
    }

    public int getTokens()
    {
        return tokens;
    }

    public void setTokens(int tokens)
    {
        this.tokens = tokens;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getIpv4()
    {
        return ipv4;
    }

    public void setIpv4(String ipv4)
    {
        this.ipv4 = ipv4;
    }

    public UUID getUuid()
    {
        return uuid;
    }

    public void setUuid(UUID uuid)
    {
        this.uuid = uuid;
    }

    public long getLastLogin()
    {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin)
    {
        this.lastLogin = lastLogin;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }


    
    public String getSalt()
    {
        return salt;
    }

    public void setSalt(String salt)
    {
        this.salt = salt;
    }

    public String getPasswordHash()
    {
        return passwordHash;
    }
    
    /**
     * Returns null if an exception occurs. Otherwise returns a SHA-256 hash of
     * (rawPassword + salt)
     * @param rawPassword
     * @return 
     */
    public String generatePasswordHash(String rawPassword)
    {
        try
        {
            String plainText = rawPassword + this.salt;
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(plainText.getBytes("UTF-8")); // Change this to "UTF-16" if needed
            byte[] digest = md.digest();
            return new String(digest);
        } 
        catch (UnsupportedEncodingException ex)
        {
            Logger.getLogger(ShopUser.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (NoSuchAlgorithmException ex)
        {
            Logger.getLogger(ShopUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void setPasswordHash(String passwordHash)
    {
        this.passwordHash = passwordHash;
    }
    /** Generates the hash of the raw password, then sets the passwordHash to 
     * equal the result. Returns false if an exception occurred.
     * @param rawPassword 
     * @return  
     */
    public boolean setPasswordByRawValue(String rawPassword)
    {
        String hash = generatePasswordHash(rawPassword);
        if (hash == null){ 
            return false;
        }else{
            this.passwordHash = hash;
            return true;
        }
    }

    
}
