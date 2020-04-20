package constrInject3;

public class Notes {
/*
 * package constrInject3;


AccountService -> dbName(string) as dependency 
ProductService ->   accountService(obj) as dependencies 
UserService ->  userName(string)  , accountService(obj) as dependencies 

 
req : 
call the saveUser() method inside UserService class
call the saveProduct() method inside ProductService class
 <constructor-arg ref="aService" /> will call the constructor
 <property > tag will call the setter method internally
 */
}
