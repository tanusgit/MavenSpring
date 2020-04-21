package autowireByName;

public class Notes {
/*
 Autowiring:
----------------
Use Autowiring only if the dependencies are objects and springs has to 
identify +  resolve the dependencies.  
  

Without autowiring:
============================================================
->DEV:  <bean> tags + either <property>/<constr-arg>
-> Springs: -> Create obj + resolve dependencies

No java chanegs; only springs.xml changes
  
With Autowiring::
===============================================================
  ->DEV:  <bean> tags + new attribute for autowire [ no need to write the 
   <property>/<constr-arg>]
  -> Springs: -> Create obj +  Identify Dependency + resolve dependencies
  
adv:
-> dev no need to write<property>/<constr-arg> tag. simplies the springs.xml
-> if the new dependencies are added , there is no change in springs.xml

four approaches:
1.ByNAME
2.ByType
3.ByConstructr
4.Autodetect



                                      											beanid
DaoImpl -> config (string)                                    dao
UserService ->DaoImpl (obj)                                   uService
AccountService -> DaoImpl (obj) and UserService(obj)          aService

ByName:
-----------------
  dependency  name in java class = bean id in springs.xml
the instacne variable name in the class = bean id
  
 ex1:
public class UserService {

	private DaoImpl dao;  // i.v. name here should match with the bean id in the springs.xml
  private DaoImpl dao1;  // dependency is not resolved; there is no beanid with the name "dao1" in the springs.xml
  
} 


ex2:

public class AccountService {
 
	private DaoImpl dao;// dependency is resolved i.v. name "dao" should match with the bean id in the springs.xml
	private UserService uService;// dependency is resolved i.v. name "uService" should match with the bean id in the springs.xml
  
  
} 
 */
}
