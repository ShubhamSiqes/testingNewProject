package com.fca.systems.scripts
import spock.lang.*
import groovy.json.JsonBuilder
import spock.lang.Shared
import spock.lang.Specification

class CSVtoJSONNewtoday extends Specification{
	
	def "groovyclosures"(){
	
		given:
	      def name = "Chris"
		  def printClosure = { println "Hello, ${name}" }
	  
		  printClosure()
	      name = "Joseph"
	      printClosure()
	}

}