package com.fca.systems.scripts

import javax.xml.ws.wsaddressing.W3CEndpointReference.Address

import spock.lang.Specification


class StubbingMethod extends Specification{

	def "specifying side effects"() {
		given:
		   List list = Stub(List)
		   //list.size() >> { println "Size method has been invoked" }
		   list.size() >>3
		   list.add("1")
		   
     	 expect:
		 list.size()==3
		 list.empty==false
	 }
}
