package weeek3.day1.homeAssignments;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint is "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		if(requestStatus) {
			System.out.println("Endpoint is "+endpoint+" and the Requestbody is "+requestBody);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api = new APIClient();
		api.sendRequest("TestLeaf");
		api.sendRequest("TestLeaf", "LeafApps Portal", true);
	}

}
