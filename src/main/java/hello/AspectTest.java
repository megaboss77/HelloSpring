
package hello;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectTest {

	//private Logger logger = LoggerFactory.getLogger(this.getClass());

	//What kind of method calls I would intercept
	//execution(* PACKAGE.*.*(..))
	//Weaving & Weaver
    //@Before("execution(* hello.controller.getPet(..))")
    //(List hello.controller.HelloController.getPet())


    @Before(value = "execution(* hello.controller.*.*(..))")
	public void before(JoinPoint joinPoint){
		//Advice
		// logger.info(" Check for user access ");
        // logger.info(" Allowed execution for {}", joinPoint);
        System.out.println("BEFORE: "+joinPoint);
	}
   @After(value = "execution(* hello.controller.*.*(..))")
	public void After(JoinPoint joinPoint){
		//Advice
		// logger.info(" Check for user access ");
        // logger.info(" Allowed execution for {}", joinPoint);
        System.out.println("AFTER: "+joinPoint);
	}
}
	

