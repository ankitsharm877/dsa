package visa1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
//		component 1.ts:  hello()
//		button>
//		 
//		componnet2.ts : how wil i call hello()
//		elementRef
//
//		<component1 > 
//
//
//		In a User Registration project where one can add, edit, and view users, it's crucial to have a well-structured UI project folder. Could you describe how you would structure the directories and files in this project to maintain good organization and scalability? Please include key directories, files you'd typically create, and the purpose of each in your explanation
//
//		-> interceptor
//		    -> intercept()
//
//		-> 
//
//		-> services
//		    -> common.service.ts
//		        -> post 
//		        -> get
//		        -> getAll
//		        -> put
//		    -> data.service.ts
//		        -> subject, data
//		-> users
//		    => users.template.html
//		    => users.component.ts
//		    -> add-user
//		         => users.template.html
//		        => users.component.ts
//		    -> edit-user
//		         => users.template.html
//		         => users.component.ts
//		    -> view-user
//		        => users.template.html
//		        => users.component.ts
//
//		@HostListener()
//
//		@HostBinding elementRef
//
//
//
//		 
//		employee.controller
//		    @PostMapping("/user")
//		    -> addUser(@RequestBody User user)
//		    @GetMapping("/user")
//		    -> getAllUser()
//		    @GetMapping("/user/{id}")
//		    -> getUser(@PathVariable int id)
//		    @DeleteMapping("/user/{id}")
//		    -> deleteUser(@PathVariable int id)
//
//
//		new-component 
//		-> button
//
//
//		Design a system for an online recipe sharing platform. 
//		This platform should allow users to share their own recipes, 
//		browse recipes posted by other users, and leave comments .
//		 
//		Question:
//		How would you design the overall architecture of this online recipe sharing platform? 
//		What technologies would you choose for the frontend and backend, and why?
//
//
//		-> UI - angular
//		    -> User (Add, edit, delete, login)
//		    -> Recipe with comment section
//		        (Add recipe, edit recipe, add comment)
//
//		-> Backend - spring boot
//		    -> user-service
//		    -> recipe-service
//		    -> comment-service
//
//		-> Database (NoSQL, MongoDB) Datastore
//		    -> User
//		        -> userid, username
//		    -> Recipe
//		        -> recipeId, recipeName, ingrediants, images URL, videos Url, comments
//		    -> Comment
//		        -> commentId(10), postDateTime, comment, userId (2), , childComments: [
//		            -> commentId, postDateTime, comment, userId (12),
//		            -> commentId, postDateTime, comment, userId (14),
//		        ]
//		            
//		   recipe: {
//		    recipeId, 
//		    recipeName, 
//		    ingrediants, 
//		    images URL, 
//		    videos Url
//		    comments: [{
//		            commentId: 10,
//		            postDateTime: 01/01/2014 : 01:01:01,
//		            comment: "dummy comment",
//		            userId: 10,
//		            recipeId: 1,
//		            childComments:  [
//		                [{
//		                commentId: 10,
//		                postDateTime: 01/01/2014 : 01:01:01,
//		                comment: "dummy comment 2",
//		                userId: 12,
//		                recipeId: 1,
//		                childComments:  []
//		            } ]
//		        },{
//		            commentId: 10,
//		            postDateTime: 01/01/2014 : 01:01:01,
//		            comment: "dummy comment",
//		            userId: 10,
//		            recipeId: 1,
//		            childComments: []
//		        }]
//		   }
//
//
//		ExecutorService 
//
//		FutureTask<String>
//
//
//
//		@async
//		void runServiceCall() {
//
//		}
		//Let's take a 2D array as an example:
//		1 2 3
//		4 5 6
//		7 8 9
//		For each element, we add the element itself and the elements to its right and below (if they exist).
//		So, the output array would be:
//		1+2+4 2+3+5 3+6
//		4+5+7 5+6+8 6+9
//		7+8   8+9   9
//		Which evaluates to:
//		7 10 9
//		16 19 15
//		15 17 9
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		findSum(mat);
		for (int[] m : mat) {
			System.out.println(Arrays.toString(m));
		}
	}
	
	public static void findSum(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int sum = mat[i][j];
				if ((i + 1) < mat.length) {
					sum += mat[i + 1][j];
				}
				if ((j + 1) < mat[i].length) {
					sum += mat[i][j + 1];
				}
				mat[i][j] = sum;
			}
		}
	}
}

