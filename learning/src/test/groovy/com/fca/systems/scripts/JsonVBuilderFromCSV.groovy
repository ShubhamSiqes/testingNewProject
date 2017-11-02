package com.fca.systems.scripts

import com.fca.systems.utilities.*
import spock.lang.Specification
import spock.lang.Unroll
import spock.lang.Shared
import groovy.json.JsonBuilder
import groovy.json.JsonOutput

class JsonVBuilderFromCSV extends Specification{

	@Shared
	def ccodeLlpArray = []

	def setupSpec()
	{
		def CcodeLLpfileName =    "src/test/resources/58702574.csv"
		new File(CcodeLLpfileName).eachLine { line -> ccodeLlpArray.add( line.split(",") ) }
	}

	@Unroll
	def requestsWithOverridingStateCodes()
	{
		given: 'Defining response post params.'
		String state = "LA";
		def models = new ArrayList<Map>();

		when: 'Use POST method to hit the compare bs url'
		models.add(AllMainReusableFUnction.createConfigCompareElement(a,b,c,d,e));
		

		then: 'Verify response success status'
        def dataQuery = AllMainReusableFUnction.buildPostBodyRequest(state, models)
		
		println dataQuery

		where:

		[a,b,c,d,e] << ccodeLlpArray[0..3]

	}

}
