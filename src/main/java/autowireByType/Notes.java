package autowireByType;

public class Notes {
/*
 *                                       											beanid
DaoImpl -> config (string)                                    dao
AccountService -> DaoImpl (obj) and UserService(obj)          aService

ByType:
-----------------
  dependency  class name in java class = any bean class in springs.xml
the instance variable class name  =any bean class
   
ex1:
public class AccountService {

	private DaoImpl dao;// dependency is resolved as for DaoImpl there is an entry in the springs.xml
}


                                      											beanid
DaoImpl -> config (string)                                    dao
AccountService -> DaoImpl (obj) and UserService(obj)          aService
CustomerService  -> DaoImpl (obj)                             cService
LoanService ->      DaoImpl (obj)                             lService
UserService -> DaoImpl (obj) , LoanService(obj)               uService
              CustomerService(obj)
ByType:
-----------------
  there is no restriction in the instance variable name.
  
  dependency  class name in java class = any bean class in springs.xml
the instance variable class name  =any bean class
   
ex1:
public class AccountService {

	private DaoImpl dao;// dependency is resolved as for DaoImpl there is an entry in the springs.xml
}

ex2:

public class UserService {

	private DaoImpl d; // dependency is resolved as for DaoImpl there is an entry in the springs.xml

	private LoanService ls; // dependency is resolved as for LoanService there is an entry in the springs.xml

	private CustomerService cs; // dependency is resolved as for CustomerService there is an entry in the springs.xml
  
}



<bean id="daoImplObj"
	 class="autowireByType.DaoImpl" >
     
     byName uses bean id="daoImplObj" for resolving dependency
     ByType uses bean  class="autowireByType.DaoImpl"  for resolving dependency


DaoImpl -> config (string)                                    dao
AccountService -> DaoImpl (obj) and UserService(obj)          aService
CustomerService  -> DaoImpl (obj)                             cService
LoanService ->      DaoImpl (obj)                             lService
UserService -> DaoImpl (obj) , LoanService(obj)               uService
              CustomerService(obj)
ByType:
-----------------
  there is no restriction in the instance variable name.
  
  dependency  class name in java class = any bean class in springs.xml
the instance variable class name  =any bean class
 

we need write only one bean tag for one class 

 */
}
