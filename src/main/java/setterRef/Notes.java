package setterRef;

public class Notes {
/*
 * 
two classes:
AccountService   -> dependency is dbName(string)  -> 1 property tag
UserService  -> dependency are  userName(string)+ accountService obj -> 2 property tags


string
<property name="dbName" value="SQLserver" />

obj
<property name="accountService" ref="aService"/>  provide the bean id of dependent bean
 */
}
