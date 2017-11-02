package com.fca.systems.scripts

import java.util.Map
import java.util.concurrent.ConcurrentSkipListMap.KeySet

import javax.xml.crypto.KeySelector

import net.sf.json.JSONException
import net.sf.json.JSONObject
import net.sf.json.groovy.JsonSlurper
import com.fca.systems.utilities.*
import spock.lang.Specification

class AllKeyNamesFromJsonfile extends Specification {

	
	def requestsWithOverridingStateCodes()
	{

    
	given: def path="src/test/resources/presaved.json"
	//JSONObject partsData = new JSONObject("path");
	
	def llp=[:]
	def jsonSlurper = new JsonSlurper()
	//def objectt = jsonSlurper.parseText('{"state":"LA","models":[{"ccode":"CUT201715D23R81A","llpCode":"2DM","configuration":"eJxdkEESgyAMRS_EQnDRbqNIF0aHQlHaBXIQDy_Yjg0MC_Ienwlh34VAJlhzLsviYLooFYa0s_bSATSQVEgJevrShvE_riBT8RWPFKYNggNLs6PfGkFETJ2ixJiedb1F-_vWcHoL7EA79KgoTrYtkI8FAhb4WSjOQxEGpc4yD9CzgEgJAE7kP0RN0cGT4uQtRQ0mz1QYV5vO10bOtTFL_sDCvGuz3qpbB7GYcjk","state":"CC","option":["EEP"]}]}')
	
	def jsonn=('{"state":"LA","models":[{"ccode":"CUT201715D23R81A","llpCode":"2DM","configuration":"eJxdkEESgyAMRS_EQnDRbqNIF0aHQlHaBXIQDy_Yjg0MC_Ienwlh34VAJlhzLsviYLooFYa0s_bSATSQVEgJevrShvE_riBT8RWPFKYNggNLs6PfGkFETJ2ixJiedb1F-_vWcHoL7EA79KgoTrYtkI8FAhb4WSjOQxEGpc4yD9CzgEgJAE7kP0RN0cGT4uQtRQ0mz1QYV5vO10bOtTFL_sDCvGuz3qpbB7GYcjk","state":"CC","option":["EEP"]}]}').toString()
	println jsonn
	
	when:
	//def allkeys=AllMainReusableFUnction.parsingggg(JSONObject json,objectt)
	
	llp=AllMainReusableFUnction.parsingggg(jsonn)
	
	then:
	println llp
	
	}


}

