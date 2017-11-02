package com.fca.systems.scripts

import com.fca.systems.utilities.*
import spock.lang.Specification
import spock.lang.Unroll
import spock.lang.Shared
import groovy.json.JsonBuilder
import groovy.json.JsonOutput

class JsonFromDataTable extends Specification{

	@Unroll("cCode=#code, llp=#llp and config=#config")
	def requestsWithOverridingStateCodes()
	{
		given: 'Defining response post params.'
		String stateCode = "LA";
		def models = new ArrayList<Map>()

		def code=["CUC201701LXCH48A","CUC201701LXCL48B","CUC201701LXCL48C"]
		def llp=["2DF","2DG","2DL"]
		def config=["TeJxljjsOwyAQBS9EgUmRuFzjUFjIIvzdAAfx4YNRFC1YFDCzT_s4T8YEmQhtx5Dy1ktZhUz1JuyvEyjAWBMYbZjRjhQUx2i7rAODh3HOdMIfqE3FyqQM7wfJ-q09r128logDI8DecPrh5jvUEqODD8bIriokFOibcaNZ4mjWfTTa38yRKetMeI6Z-Mr0gc0XG25gBw","eJxlkE0OgyAQRi_EAjHpz3IUsamkoSBIu0AP4uELmLQDDQt4D2bmC_vO2EgaQvMyZBt0t3EhQ9xJ-9NJgQLCvipEhV_EgjC7O-oVFm0wconLLRSX_rpShoPEaRuXQS3nlTZFG91iZKcxH1OUPqWaMA7vG8bZHdgcCEJkZAdOEpMsCACKSqkwWnhi9DxlRkKB_jO2Np2vDX_URrv0TYV51cb0tfGXqs8HoIRx_w","eJxdkEEOgyAQRS_EQmnTdjsqtKmjoaiUukAO4uEL2tSBsID38ifzw7pyjoyzYjsD80JXvpHows3Oh44KFJCkC4omwoAbzZOVR-INdXjs4h4G6CI3wUCzrV0KToQP23yDPtT7d1L2thQlnWr0iSK_4PaMterYsKUo5gdFGARtV6Ok2JVtgoAJzoZiL5LwaPZF5W-RlBvyHREpAUCSRUVxghfFzg4UFej4H4mZclPZ3DR9brSJn5-YT27e12zqC_uigbw"]

		when: 'Use POST method to hit the compare bs url'

		for (def i = 0; i <code.size(); i++) {

			models.add(AllMainReusableFUnction.createConfigCompareElement(code[i],llp[i],config[i]))
		}

		def dataQuery = AllMainReusableFUnction.buildPostBodyRequest(stateCode, models)

		then: 'Verify response success status'

		println dataQuery


	}

}