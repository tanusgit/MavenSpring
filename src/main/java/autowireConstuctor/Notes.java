package autowireConstuctor;

public class Notes {
/*
 * 
 
 <bean id="aService" 
	class="autowireConstuctor.AccountService" 
     
     byName uses bean id="aService" for resolving dependency
     ByType uses bean  class="autowireConstuctor.AccountService"  
      for resolving dependency + setter injection
      constructor uses bean  class="autowireConstuctor.AccountService" 
        for resolving dependency + constr injection
 
 autowire="autodetect"
autowire uses permutation of byconstr, bytype, by name.


<bean id="aService" 
	class="autowireConstuctor.AccountService" 
     
     byName uses bean id="aService" for resolving dependency
     ByType uses bean  class="autowireConstuctor.AccountService"   for resolving dependency + setter injection
      constructor uses bean  class="autowireConstuctor.AccountService"   for resolving dependency + constr injection[ call the constr that has more no of args]
 
 
 
 
 */
}
