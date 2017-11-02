package com.fca.systems.scripts
import spock.lang.Specification
import spock.lang.*
import groovy.json.*
import spock.lang.Unroll

@Stepwise
class new2 extends Specification {

	@Unroll
	def "arrayvalueassertinresponse"(){
		
		given:
		def list = [1, 2, 3, 4]

		when:
		list.remove(0)

		then:
		assert list == [21, 3, 4]
		
		//def (a, b, c) = [10, 20, 'foo']
		//assert a == 10 && b == 20 && c == 'foo'

	}
	@Unroll
	def "Should be able to remove from list"() {
		given:
		def x

		when:
		x = 1

		then:
		assert x == 2
	}
}