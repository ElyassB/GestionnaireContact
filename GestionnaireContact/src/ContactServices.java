

public class ContactServices {
	
	
	private Object contacts;

	public void add (Contact...contacts) {
		for (Contact c : contacts) {
			((ContactServices) this.contacts).add(c);
		}
	}
	
	public void removeContact (Contact...contacts) {
		for (Contact c : contacts) {
			((ContactServices) this.contacts).removeContact(c);
		}
	}
	

}
