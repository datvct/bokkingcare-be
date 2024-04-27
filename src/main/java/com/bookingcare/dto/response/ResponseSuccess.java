package com.bookingcare.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class ResponseSuccess extends ResponseEntity<ResponseSuccess.PayLoad> {

//	put, patch,delete
	public ResponseSuccess(HttpStatusCode status, String mesage) {
		super(new PayLoad(status.value(), mesage), HttpStatus.OK);
	}

//	Get, Post
	public ResponseSuccess(HttpStatusCode status, String mesage, Object data) {
		super(new PayLoad(data, status.value(), mesage), HttpStatus.OK);
	}

	public static class PayLoad {
		private final int status;
		private final String message;
		private Object data;

		public PayLoad(Object data, int status, String message) {
			super();
			this.status = status;
			this.message = message;
			this.data = data;
		}

		public PayLoad(int status, String message) {
			super();
			this.status = status;
			this.message = message;
		}

		public int getStatus() {
			return status;
		}

		public String getMessage() {
			return message;
		}

		public Object getData() {
			return data;
		}

	}
}
