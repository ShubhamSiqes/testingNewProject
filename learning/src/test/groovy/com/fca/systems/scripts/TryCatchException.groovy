package com.fca.systems.scripts
import spock.lang.*
import spock.lang.Shared
import spock.lang.Specification

class TryCatchException extends Specification {

	@Unroll def "scenario 1"()
	{
		given: "An integer with value 5"
		def i = 5
		when: "This integer is multiplied by 2"
		i = i * 2
		
		then: "The final value is 10"
		assert i!=5
		
		then:
		assert i == 10
		//thrown BurnedException("Helooosdsd")
	}

	class BurnedException extends RuntimeException {
		BurnedException(String message) {
			super("this is not actual value")
		}
	}
}