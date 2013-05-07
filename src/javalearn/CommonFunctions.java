package javalearn;

import java.util.List;

public interface CommonFunctions {
	public List<String> fetchFriendsUid(String uid);
	public List<String> fetchInfo(String uid);
	public boolean sendMessageUid(String uid, String message);
	public boolean sendMessageUidList(List<String>uidList, String message);
	public boolean wallPost(String Message);
	public boolean follow(String uid);
	public boolean unfollow(String uid);

}
