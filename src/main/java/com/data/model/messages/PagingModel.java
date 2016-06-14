package com.data.model.messages;

public class PagingModel {

	public String previous;
	public String next;

	public PagingModel() {
		setPrevious();
		setNext();
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public void setPrevious() {
		this.previous = "https://graph.facebook.com/v2.6/t_mid.1441089310860:1241ac2fd302509804/messages?since=1465814587&limit=500&fields=message,to,from,created_time,attachments,shares&access_token=CAALyDYhpkjYBAGWZCtDMD9hHZAijZAeMuMPE6VjqIqZCXiDam2dZAjvMYYHc36bUfK6dI6vpaZBP2oZAGltFl2ZBuZBA2nQyeIoh5TpCpIlhxaMeFgiAM9n37qf3fGZA6YEVMfRpc6yk7WJEdbcF0Q0ikSQ8nDSkKztqZCpXkVi6ef9FsnQ8hkZCUpRR&__paging_token=enc_AdBZBtQKBBpc2ZBQvZB3HgTG9BqjohQaKgAtqZAxKaaONCKf71LCdQZCZA50V3jYLrs87TahLNSI1DW3ZC1luczdWHOyv5K1ONJslO5fgsNbQ4Se8qM3wZDZD&__previous=1";
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public void setNext() {
		this.next = "https://graph.facebook.com/v2.6/t_mid.1441089310860:1241ac2fd302509804/messages?since=2016-06-13T09\u00253A36\u00253A41Z&limit=500&fields=message,to,from,created_time,attachments,shares&access_token=CAALyDYhpkjYBAGWZCtDMD9hHZAijZAeMuMPE6VjqIqZCXiDam2dZAjvMYYHc36bUfK6dI6vpaZBP2oZAGltFl2ZBuZBA2nQyeIoh5TpCpIlhxaMeFgiAM9n37qf3fGZA6YEVMfRpc6yk7WJEdbcF0Q0ikSQ8nDSkKztqZCpXkVi6ef9FsnQ8hkZCUpRR&until=1465814587&__paging_token=enc_AdBZBtQKBBpc2ZBQvZB3HgTG9BqjohQaKgAtqZAxKaaONCKf71LCdQZCZA50V3jYLrs87TahLNSI1DW3ZC1luczdWHOyv5K1ONJslO5fgsNbQ4Se8qM3wZDZD";
	}

}
