package com.data.model.messages;

public class ParticipantsPagingModel {
	
	public String next;
	
	public ParticipantsPagingModel(){
		setNext();
	}

	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public void setNext() {
		this.next = "https://graph.facebook.com/v2.6/t_mid.1441089310860:1241ac2fd302509804/participants?fields=name,id,picture&access_token=CAALyDYhpkjYBAGWZCtDMD9hHZAijZAeMuMPE6VjqIqZCXiDam2dZAjvMYYHc36bUfK6dI6vpaZBP2oZAGltFl2ZBuZBA2nQyeIoh5TpCpIlhxaMeFgiAM9n37qf3fGZA6YEVMfRpc6yk7WJEdbcF0Q0ikSQ8nDSkKztqZCpXkVi6ef9FsnQ8hkZCUpRR&limit=25&offset=25&__after_id=enc_AdAIBfSCxtFbf20yEcDAgBbR0ZB7cZC1OkCbW9SqqZB7c07JQZBymSZA069uS0L1UvNkckwJlZABoWvaBLUSZCCv8TfTUTH" ;
	}

}
