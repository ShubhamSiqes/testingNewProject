package com.fca.systems.scripts
import org.hamcrest.core.Every

import spock.lang.*



class DatatableUse extends Specification {

	@Unroll def "scenario 1"()
	{
		
		def string2="dfheheherererer"
		def array1=['dfhehe','herer']
	
		
		expect: x + y == z 
		
		//assert string2.contains(array1.eachWithIndex({ index, item ->"$index: $item"}).toString())
		//assert string2.contains(array1.indexed().collect{ index, item ->"$index: $item"})
		//assert list.every { it.size() > 10}
		//assert string2.contains(list.take(0..1))

		
		where:
		x|y|z
		1|11|12
		2|3|5
		3|4|6


	}

}