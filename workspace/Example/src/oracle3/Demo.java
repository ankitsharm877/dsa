package oracle3;

public class Demo {

	public static void main(String[] args) {
//		ObjectMapper 
//		JSON -> Model
//		Model -> JSON
//
//		//Singleton
//		public static ObjectMapper getObjectMapper() {
//		  ObjectMapper om = new ObjectMapper();
//		  // set configuration
//		  return om;
//		}
//
//		public EmailUtils  {
//		    sendEmail(to, cc, message, htmlFormatBody);
//		}
//
//		Model m = om.parse(source, new <Model>);
//
//		class ServiceLogE2ETable {
//		    // start time ,end time, E2ETime
//		}
//
//		class Schulder {
//		@Scheduler(cron= "") 
//		public void triggerEmailForLogTimeE2E() {
//		  // fetch 2 days data LogE2ETable
//		  // check for time difference > 60 then 
//		  if (e2eTime > 60) {
//		    // set data in html
//		    sendMail("admin@email.com", html);
//		  }
//		}
//		@Scheduler(cron= "") 
//		public void triggerEmailForLogTimeE2E() {
//		  // fetch 2 days data LogE2ETable
//		  // check for time difference > 60 then 
//		  if (e2eTime > 60) {
//		    // set data in html
//		    sendMail("admin@email.com", html);
//		  }
//		}
//		@Scheduler(cron= "") 
//		public void triggerEmailForLogTimeE2E() {
//		  // fetch 2 days data LogE2ETable
//		  // check for time difference > 60 then 
//		  if (e2eTime > 60) {
//		    // set data in html
//		    sendMail("admin@email.com", html);
//		  }
//		}
//		@Scheduler(cron= "") 
//		public void triggerEmailForLogTimeE2E() {
//		  // fetch 2 days data LogE2ETable
//		  // check for time difference > 60 then 
//		  if (e2eTime > 60) {
//		    // set data in html
//		    sendMail("admin@email.com", html);
//		  }
//		}
//
//		}
//
//		class Service1 {
//		 
//		//call this method 4 in day 5 mint 
//
//		// max 10 threads,
//		// max 20 threads
//
//		Thread Pool -> 10 theads
//
//		@Async
//		@Trasanction
//		public void fetchDatafromSource1() { table1 
//		   // Startime
//		 // parentId -> current Date 
//		 //-> new thread
//		  // fetching data
//		  // call API that a response
//		 //  covert into Model 
//		 // save Model to DB 
//		 // New table -> ParentId
//		  // endTime , calculate E2E, ParentID
//
//		  if (e2eTime > 60) {
//		    // set data in html
//		    sendMail("admin@email.com", html);
//		  }
//		}
//
//		}
//
//		class Service2 {
//
//		@Async
//		public void fetchDatafromSource2() { table2
//		 -> new thread
//		 // fetching data
//		 // 
//		  // save to DB
//		   //parentId -> current Date 
//		}
//
//		}
//
//		class Service3 {
//
//		@Async
//		public void fetchDatafromSource3() { table3
//		 -> new thread
//		 // fetching data
//		 // 
//		// save to DB
//		}
//
//		}
//
//		// Auth server -> token // email, address 
//
//		//service
//
//		// auth  -> validate token and check user has BOUser, BOAdmin
//		// access apis 
//
//		// controller {
//
//		  @PostMapping
//		  public String getTokenPasswordMethod(email, password) {
//
//		  }
//
//		  @PostMapping
//		  public String getTokenOauthMethod(email, password, clientid, clientsecret) {
//		    
//		  }
//
//		}
//
//		application.properties
//		// url 
//		// auth config data
//
//
//
//
//
//		///SQL:
//
//		Customer Table:
//		Name ,Cust_Id, Country of origin 
//
//		Trips Table :
//		Trip_Id, Trip Country Source, Trip Country DEstination, cust_id
//
//		Show the names of the customers who are not Indian but having no of trips more than 100.
//
//		select * from customer c inner join (select * from trips
//		group by Source, DEstination having count(*) > 100) t
//		on c.cust_id = t.cust_id and c.origin != 'India';





	}

}
