package com.accolite.service;

import java.io.File;
import java.io.IOException;

import com.accolite.DOA.DatabaseDoa;
import com.accolite.DOA.NetworkDoa;

public class StoreService {
	DatabaseDoa database;
    NetworkDoa network;
     
    //setters and getters
 
    public boolean save(String fileName) throws IOException
    {
    	File f = null ;
        database.save(fileName);
        System.out.println("Requested for saving database in main class");
         
        network.save("server", "user","password", "deepa.txt", f);
        System.out.println("Requested for saving database in network class");
         
        return true;
    }
}
