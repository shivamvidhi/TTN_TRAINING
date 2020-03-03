package com.shivam.firstspring;

import com.shivam.firstspring.LooseCoupling.adminUser;
import com.shivam.firstspring.LooseCoupling.normalUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.shivam.firstspring.LooseCoupling.*;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
//		Main obj = new Main();
//		obj.main(args);


		ApplicationContext applicationContext = SpringApplication.run(FirstSpringApplication.class, args);
		for (String name:applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);

			// 1. calling admin user
			User obj2 = applicationContext.getBean(adminUser.class);
			obj2.Dosomething();


			// 2. calling normal us
			User obj3 = applicationContext.getBean(normalUser.class);
			obj3.Dosomething();



			// 3. calling Main and this will return primary component
			//	* if we do not put primary in any one of the two i.e. Admin User and Normal User then ambiguity will come.
			Main obj4 = applicationContext.getBean(Main.class);
			obj4.main();

		}
	}

}
