/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author K00243015
 */
public class User
{
    //attributes
    private String username, password;
    
    //constructors
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    //getters
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    
    //setters
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    //methods
    @Override
    public String toString()
    {
        return String.format("%s:%s;", getUsername(), getPassword());
    }
}
