package com.json.create;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJsonFile {

	//create json file
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
        obj.put("name","sravani");
        obj.put("location","Seattle");
        
        JSONArray list=new JSONArray();
        list.add("Java");
        list.add("JSP");
        list.add("Servlets");
        
        obj.put("courses",list);
        
        try(FileWriter file=new FileWriter("E:\\myJSON.json")){
        	file.write(obj.toString());
        	file.flush();
        }
        catch(IOException e){
        	e.printStackTrace();
        }
        
        System.out.println(obj);
	}

}
