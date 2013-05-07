package javalearn;

import java.util.ArrayList;
import java.util.List;

public class Twitter extends User implements CommonFunctions{
	
	public Twitter(String uid) {
		setUid(uid);
		/*
		List<String> info = fetchInfo(uid);
		setName(info.get(0));
		setEmail(info.get(1));
		setContactNumber(info.get(2));
		setLocation(info.get(3));
		*/
	}
	
	public List<String> fetchInfo(String uid) {
		/* Fetch User info from Twitter using Twitter Api's */
		return new ArrayList<String>();
	}
	
	public List<String> fetchFriendsUid(String uid) {
		/* Fetch user's friend's uid */
		return new ArrayList<String>();
	}

	public boolean sendMessageUid(String uid, String message) {
		 /* Use Twitter api to send message to user on the basis of uid */
		try {
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		
	}
	public boolean sendMessageUidList(List<String>uidList, String message) {
		for (String uid : uidList) {
			if (!(sendMessageUid(uid,message))) {
					System.out.println("Error in sending message to uid :" + uid);
					return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}
	public boolean wallPost(String Message) {
		/* use Twitter api to update wall post */
		String uid = getUid();
		try {
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		
	}
	public boolean follow(String uid) {
		try {
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		
	}
	public boolean unfollow(String uid) {
		try {
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		
	}
}
