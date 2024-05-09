package com.app.demo.exceptioon;

public class NoDataForGivenIdException extends RuntimeException{
		private String message="No data for given Id ";

		public NoDataForGivenIdException() {
			getMessage();
		}

		public NoDataForGivenIdException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
			this.message = message;
			getMessage();
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
}
