package com.accolite.DOA;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkDoa {
	 public void save(String ftpServer, String user, String password,
	         String fileName, File source ) throws IOException {
		 
	        if (ftpServer != null && fileName != null &&source != null)
	        {
	           StringBuffer sb = new StringBuffer( "ftp://" );
	           // check for authentication else assume its anonymous access.
	           if (user != null && password != null)
	           {
	              sb.append( user );
	              sb.append( ':' );
	              sb.append( password );
	              sb.append( '@' );
	           }
	           sb.append( ftpServer );
	           sb.append( '/' );
	           sb.append( fileName );
	           /*
	            * type ==&gt; a=ASCII mode, i=image (binary) mode, d= file directory
	            * listing
	            */
	           sb.append( ";type=i" );

	           BufferedInputStream bis = null;
	           BufferedOutputStream bos = null;
	           try
	           {
	              URL url = new URL( sb.toString() );
	              URLConnection urlc = url.openConnection();

	              bos = new BufferedOutputStream( urlc.getOutputStream() );
	              bis = new BufferedInputStream( new FileInputStream( source ) );

	              int i;
	              // read byte by byte until end of stream
	              while ((i = bis.read()) != -1)
	              {
	                 bos.write( i );
	              }
	           }
	           finally
	           {
	              if (bis != null)
	                 try
	                 {
	                    bis.close();
	                 }
	                 catch (IOException ioe)
	                 {
	                    ioe.printStackTrace();
	                 }
	              if (bos != null)
	                 try
	                 {
	                    bos.close();
	                 }
	                 catch (IOException ioe)
	                 {
	                    ioe.printStackTrace();
	                 }
	           }
	           System.out.println("Saved on network");
	        }
	        else
	        {
	           System.out.println( "Input not available." );
	        }
	    }
}
