package CreateLead_Cucumber_Implementation;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void before(Scenario obj) {
		obj.getName();
		System.out.println(obj.getName());
		System.out.println(obj.getId());
	}
	
	@After
	public void after(Scenario obj) {
		System.out.println(obj.getStatus());
		System.out.println(obj.isFailed());
	}
}
