package com.fca.systems.scripts

public class SampleTestT {
	String name
	String note
}
//	def todos = [
//	new SampleTest(name:"1", note:"one"),
//	new SampleTest(name:"2", note:"two"),
//	new SampleTest(name:"3", note:"three")
//	]
//	
//	println "$todos"
//	println todos
//	todos.each {
//	println "${it.name} ${it.note}" }
		def todos = new ArrayList() 
        todos.add(new SampleTestT(name:"1", note:"one"))
        todos.add(new SampleTestT(name:"2", note:"two")) 
        todos.add(new SampleTestT(name:"3", note:"three")) 
        for(SampleTestT todo : todos) { 
           println "${todo.name} ${todo.note}" 
          }

