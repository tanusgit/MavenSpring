package scopes;

public class NOtes {
/*
 * scopes:
--------------
lifetime for bean obj
  1.singleton -> one bean obj for the bean class
  2.prototype -> create bean obj everytime when getBean() method is called.
  3.request   -> web  , one bean obj per reuqest
  4.session  -> web  , one bean obj per user/session
  5.global-session -> web , one bean obj per application.
  how to specify bean:
a) springs.xml
<bean id="uService" 
	class="scopes.UserService" 
	scope="prototype"/>
	
b) annoattions
  
 */
}
