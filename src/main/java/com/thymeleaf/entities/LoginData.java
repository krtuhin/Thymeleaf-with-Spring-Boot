package com.thymeleaf.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

//@NotBlank - validation for field not empty
//@Size - validation for field value size
//@Pattern/@Email - used to validate particular pattern 
//@AssertTrue - used to check true or not (check box)

public class LoginData {

	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email..!!")
	private String email;

	@NotBlank(message = "Password cannot be empty..!!")
	@Size(min = 4, max = 20, message = "Password must contain 4 to 20 characters..!!")
	private String password;

	@AssertTrue(message = "Please accept terms & conditions..!!")
	private boolean check;

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginData(@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email..!!") String email,
			@NotBlank(message = "Password cannot be empty..!!") @Size(min = 4, max = 20, message = "Password must contain 4 to 20 characters..!!") String password,
			@AssertTrue(message = "Please accept terms & conditions..!!") boolean check) {
		super();
		this.email = email;
		this.password = password;
		this.check = check;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "LoginData [email=" + email + ", password=" + password + ", check=" + check + "]";
	}

}
