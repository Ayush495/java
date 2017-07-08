package com.javatpoint.rest;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  
@Path("/hello")  
public class Test{  
  // This method is called if HTML and XML is not requested  
  @GET  
  @Produces(MediaType.TEXT_PLAIN)  
  public String sayPlainTextHello() {  
    return "Hello Jersey Plain";  
  }  
  // This method is called if XML is requested  
  @GET  
  @Produces(MediaType.TEXT_XML)  
  public String sayXMLHello() {  
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
  }  
  
  // This method is called if HTML is requested  
  @GET  
  @Produces(MediaType.TEXT_HTML)  
  public String sayHtmlHello() {  
    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
  }  
  @GET
  @Path("/get")
  @Produces(MediaType.APPLICATION_JSON)
  public String sayJsonHello() {  
	    return "hello";  
	  } 
  @SuppressWarnings("unchecked")
@GET
  @Path("/hitjson")
  @Produces(MediaType.APPLICATION_JSON)
   public String formObject() { 
	  JSONObject obj = new JSONObject();
	  JSONArray arr=new JSONArray();
	  
	  Map<String, Object> map = new HashMap<String, Object>();
      map. put("name", "foo");
      map.put("num", new Integer(100));
      map.put("balance", new Double(1000.21));
      map.put("is_vip", new Boolean(true));
      
      
      obj = new JSONObject(map);
      arr.add(obj);
      
     // System.out.print(obj.toJSONString());
	  //  return obj.toJSONString(); 
      System.out.println(arr);
      return obj.toJSONString();
	  }
   
} 