package com.fca.systems.scripts
import spock.lang.Shared
import spock.lang.Specification
import groovy.sql.Sql
import java.sql.*
import groovy.json.JsonBuilder
import com.fca.systems.utilities.*

class MySqlDBConnection extends Specification{

	def requestsWithOverridingStateCodes()
	{
		given:
		def sql1=AllMainReusableFUnction.sqldatabaseconnection()
		
		when:
		def resultset = sql1.rows("select * from test.employee_details")
		def result2=sql1.firstRow("select MGNT_ID from test.finance_details limit 1")
		
		then:
		println result2
		println resultset
		
	
		println new JsonBuilder(state:result2[0],models:resultset).toPrettyString()

		//assert result2 == 7567
		}

}