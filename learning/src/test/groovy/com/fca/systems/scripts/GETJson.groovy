package com.fca.systems.scripts

import spock.lang.Shared
import spock.lang.Specification
import groovy.json.JsonSlurper
import utilities.*

class GETJson extends Specification{

	def "check the key values in JSON"(){
	
	given: 'test'
	def listOfKeys=[]
	def Jsondatata='{"state":"LA","models":[{"ccode":"CUT201715D23R81A","llpCode":"2DM","configuration":"eJxdkEESgyAMRS_EQnDRbqNIF0aHQlHaBXIQDy_Yjg0MC_Ienwlh34VAJlhzLsviYLooFYa0s_bSATSQVEgJevrShvE_riBT8RWPFKYNggNLs6PfGkFETJ2ixJiedb1F-_vWcHoL7EA79KgoTrYtkI8FAhb4WSjOQxEGpc4yD9CzgEgJAE7kP0RN0cGT4uQtRQ0mz1QYV5vO10bOtTFL_sDCvGuz3qpbB7GYcjk","state":"CC","option":["EEP"]}]}'
	
	def jsonSlurper = new JsonSlurper()
	
    def objectt = jsonSlurper.parseText(Jsondatata)
   
	//println objectt
    //objectt.each{k,v-> println "${k}:${v}"}
	
	objectt.each{k,v-> listOfKeys<<'${k}'}
	println listOfKeys
	
//	List<String> getNestedMapKeys(Map map, String keyPrefix = '') {
//		def result = []
//	  
//		map.each { key, value ->
//		  if (value instanceof Map) {
//			result += getNestedMapKeys(value, keyPrefix += "$key.")
//		  } else {
//			result << "$keyPrefix$key"
//		  }
//		}
//	  
//		result
//	  }




}

}

