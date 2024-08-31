package opentext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Round3 {

	public static void main(String[] args) {
//		getFilesList("/Users/I559003/Job/DS&A/workspace/Interview");
//		//System.out.println(res);
//		
//		System.out.println(clockAngle(4, 35));
	}
	
	// int h, int m
	
	public static int clockAngle(int h, int m) {
		// validate the input
		if (h < 0 || m < 0 || h > 12 || m > 60)
			System.out.println("Wrong input");

		if (h == 12)
			h = 0;
		if (m == 60) {
			m = 0;
			h += 1;
			if (h > 12)
				h = h - 12;
		}

		// Calculate the angles moved by hour and minute hands
		// with reference to 12:00
		int hour_angle = (int) (0.5 * (h * 60 + m));
		int minute_angle = (int) (6 * m);

		// Find the difference between two angles
		int angle = Math.abs(hour_angle - minute_angle);

		// smaller angle of two possible angles
		angle = Math.min(360 - angle, angle);

		return angle;
	}
	
	// take json and return map of list
	// List<Person> -> List<Fruits>
	
//	static HashMap<String, List<String>> hm = new HashMap<>();
//	public static HashMap<String, List<String>> mapData(JsonArray arr) {
//		for (int idx = 0; idx < arr.length; idx++) {
//			JsonObject obj = arr.getJSONObject(idx);
//			if (!hm.containsKey(obj.getString("personName"))) {
//				List<String> fruits = new ArrayList<>();
//				JSONArray fruitsArr = obj.getArray("fruits");
//				for (int j = 0; j < fruitsArr.length; j++) {
//					if (!fruits.contains(fruitsArr.getObject(j).getString("fruitName"))) {
//						fruits.add(fruitsArr.getObject(j).getString("fruitName"));
//					}
//				}
//				hm.put(obj.getString("personName"), fruits);
//			} else {
//				List<String> fruits = hm.get(obj.getString("personName"));
//				JSONArray fruitsArr = obj.getArray("fruits");
//				for (int j = 0; j < fruitsArr.length; j++) {
//					if (!fruits.contains(fruitsArr.getObject(j).getString("fruitName"))) {
//						fruits.add(fruitsArr.getObject(j).getString("fruitName"));
//					}
//				}
//				hm.put(obj.getString("personName"), fruits);
//			}
//		}
//		return hm;
//	}
	
	// return list of files from a folder
	static ArrayList<File> res = new ArrayList<>();
	
	public static List<File> getFilesList(String folderName) {
		File folder = new File(folderName);
		if (folder.isFile()) {
			if (!folder.getName().startsWith(".")) {
				res.add(folder);
			}
			return res;
		} else if (folder.isDirectory()) {
			for (File f : folder.listFiles()) {
				if (f.isDirectory()) {
				 	getFilesList(f.getAbsolutePath());
				} else {
					if (!f.getName().startsWith(".")) {
						res.add(f);
					}
					
				}
			}
		}
		return res;
	}
}

//class Profile {
//	String name;
//	int age;
//}
//
//class Controller {
//	
//	@GetMapping("/profile")
//	public ResponseEntity<Profile> getProfile() {
//		
//	}
//	
//	@PostMapping("/profile")
//	public ResponseEntity<Profile> uploadProfile(@RequestBody Profile profile, @RequestPart MultipartFile resume) {
//		
//		if (profile.resume != null) {
//			
//		}
//		// respo.save(profile);
//	}
//	
////	@GetMapping("/profile/{id}")
////	public ResponseEntity<Profile> getProfile(@PathVariable int id, HttpServletResponse response) {
////		Profile p = repo.findById(id);
////		try {
////	        String filePathToBeServed = "resume.pdf"//complete file name with path;
////	        File fileToDownload = new File(filePathToBeServed);
////	        InputStream inputStream = new FileInputStream(fileToDownload);
////	        response.setContentType("application/pdf");
////	        response.setHeader("Content-Disposition", "attachment; filename="+fileName+".txt"); 
////	        IOUtils.copy(inputStream, response.getOutputStream());
////	        response.flushBuffer();
////	        inputStream.close();
////	    } catch (Exception e){
////	        LOGGER.debug("Request could not be completed at this moment. Please try again.");
////	        e.printStackTrace();
////	    }
////	}
//}

//export class Service {
//client: HttpClient
//
//Service(private client: HttpClient) {
//	
//}
//
//downloadProfile() {
//	
//	let header:HttpHeader =  new HttpHeader();
//	header.add("content-type", "application/*")
//
//	this.client.get("http://localhost:8000/profile/1", header).subscribe(res => {
//		
//		window.location = ""
//		console.log(res);
//	}, error => {
//		
//	});
//
//}
//}
