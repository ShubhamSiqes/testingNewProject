package com.fca.systems.utilities

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import net.sf.json.JSONException
import net.sf.json.JSONObject
import groovy.sql.Sql

import java.sql.*
import java.util.Map


class AllMainReusableFUnction {

	public static def buildPostBodyRequest(String State,  ArrayList<Map> Models) {

		def size = Models.size();
		def builder = new JsonBuilder();

		builder{
			if(State!=null)
				state State

			models(Models)
		}

		def result = builder.toString().replace("\\", "");
		return result;
	}

	public static def parseResponseJson (String response)
	{
		def slurper = new JsonSlurper()
		def resp = slurper.parseText(response);
		return resp;
	}


	public static def createModelCompareElement(String Ccode=null, String Llp=null, String State=null)
	{
		def builder = [:]
		if(Ccode!=null)
			builder['ccode'] = Ccode
		if(Llp!=null)
			builder['llpCode'] = Llp
		if(State!=null)
			builder['state'] = State

		return builder
	}
	public static def sqldatabaseconnection() {
		// connect to db

		 return  (Sql.newInstance("jdbc:mysql://localhost:3306/test","root", "root123", "com.mysql.jdbc.Driver"))
	}
	
	public static def createConfigCompareElement(String Ccode=null, String Llp=null, String config=null, Object Option=null)
	{

		def builder = [:]
		if(Ccode!=null)
			builder['ccode'] = Ccode
		if(Llp!=null)
			builder['llpCode'] = Llp
		if(config!=null)
			builder['configuration'] = config
	    if(Option!=null)
				builder['option'] = [Option]

		return builder
	}
	
	public static def Map<String,String> parsingggg(JSONObject json , Map<String,String> out) throws JSONException
	{
		Iterator<String> keys = json.keys();
		
		while(keys.hasNext()){
			String key = keys.next();
			String val = null;
	if ( json.getJSONObject(key) instanceof JSONObject ) {
		JSONObject value = json.getJSONObject(key);
		parse(value,out);
	}
	
	else {
		 val = json.getString(key);
	}
	
	
			if(val != null){
				out.put(key,val);
			}
		}
		return out;
	}


}
