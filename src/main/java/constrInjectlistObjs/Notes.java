package constrInjectlistObjs;

public class Notes {
/*
 * if the depedency is a list use the list tag in
 * *****************************************************
 lifecycle of spring bean objects:
------------------------------------
Phase                 			Responsible                 Frequency
1.loading class    			 	-> Springs   ,                  1 time
2.create object     			-> Springs                      1 time
3.resolve the dependencies 		-> Springs                  1 time  either setter methods or constrs are called automatically.
(either constr injection or 
setter injection)    
4.initilization (call init method )-> provided by developer and invoked by  Springs , 1 time 
 myInit() 
5.service execution call service method-> provided by developer and invoked by  developer , any time
save() method
6.destroy (call destroy method )  -> provided by developer and invoked by  Springs  1 time
myClose()
 */
}
