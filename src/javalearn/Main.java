package javalearn;


import javalearn.Facebook;
import javalearn.Twitter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main (String[] args) {
		
		System.out.println("Check");
		Facebook fbuser = new Facebook(args[0]);
		Twitter twitteruser = new Twitter(args[1]);
		List<String> fbfriends = fbuser.fetchFriendsUid(args[0]);
		List<String> twitterfriends = twitteruser.fetchFriendsUid(args[1]);
		Map<String,String> commonfriends = new HashMap<String,String>();
		for (String uid : fbfriends) {
			List <String> info = fbuser.fetchInfo(uid);
			commonfriends.put(info.get(0),info.get(1));
		}
		for (String uid : twitterfriends) {
			List <String> info = twitteruser.fetchInfo(uid);
			if (!(commonfriends.containsKey(info.get(0)))) {
				commonfriends.put(info.get(0),info.get(1));
			}
			
		}
		/* Print common friends */
		for (Map.Entry<String,String> entry : commonfriends.entrySet()) {
			System.out.println("User : " + entry.getValue() + " email : " + entry.getKey());
		}
		fbuser.wallPost("Hello");
		twitteruser.wallPost("Hello");
	}
}
