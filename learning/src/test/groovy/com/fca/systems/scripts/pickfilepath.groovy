package com.fca.systems.scripts
import spock.lang.*
import java.io.lang.*

class pickfilepath

{
	static void main(String[] args) {

 
              //def path = getBaseResourcePath() + resources;
              


File projectDir = new File(System.getProperty("user.dir"));
def path = System.getProperty("user.dir")+"/58702574.csv";

println path

File file = new File("src/test/resources/58702574.csv");
String absolutePath = file.getAbsolutePath();
println absolutePath




}


		
		
		

	
	
}
