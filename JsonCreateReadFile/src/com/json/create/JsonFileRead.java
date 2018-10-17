package com.json.create;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileRead {

	public static void main(String[] args) {
		JSONParser parser=new JSONParser();
		
		try{
			Object obj=parser.parse(new FileReader("myJSON.json"));
			JSONObject jsonObj=(JSONObject)obj;
			String name=(String)jsonObj.get("name");
			System.out.println("Name is:" +name);
			
			String location=(String)jsonObj.get("location");
			System.out.println("Location is:" +location);
			
			JSONArray courseArray=(JSONArray)jsonObj.get("courses");
			Iterator<String> iterator=courseArray.iterator();
			while(iterator.hasNext()){
				System.out.println("Course :" +iterator.next());
			}
		}
        catch(FileNotFoundException e){
        	e.printStackTrace();
        }
		catch(IOException e){
        	e.printStackTrace();
        }
		catch(ParseException e){
        	e.printStackTrace();
        }
		catch(Exception e){
        	e.printStackTrace();
        }
	}

}
