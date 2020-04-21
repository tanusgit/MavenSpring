package template;

public class Notes {
/*
 * 
1. AccountService  has dbName,dbUrl,accountType as dependencies  -> 3 property tags in springs.xml
2. CardService  has dbName,dbUrl,fileName,filepath as dependencies -> 4 property tags in springs.xml
3. LoanService  has dbName,dbUrl,loanDept,loanbranch as dependencies -> 4 property tags in springs.xml

-> all the 3 bean classes has dbName,dbUrl  as dependencies

problem:
-> if we have common properties for multiple bean classes then
if  any property is changed then we need to change for every bean class.

solution:
-> define the common props in a single place and reuse for all bean classes.
  
1.define a template bean specify  abstract="true". (template bean is not associated with any bean class)
template bean contains only the common properties

 	<bean id="serviceTemplate" abstract="true" >
		<property name="dbName" value="oracle" />
		<property name="dbUrl" value="http://localhost:8080:xe" />
	</bean>
	

  2. for resusing the template bean, all other beans should be referring to template bean i.e. specify parent="serviceTemplate"
  
  
	<bean id="cService" 
	class="template.CardService" 
	parent="serviceTemplate">
  
  
*/
	
}
