package com.syntax.class19;

public class UserInfo extends UserClass {

	
	
	
		String address;

		UserInfo(String name, String mobileNumber,String address){

		    super(name,mobileNumber);
		    this.address=address;


		}
		void userDetail(){
		    System.out.println("name"+name +" Mobile Number"+mobilNumber+" Address"+address);

		}

		    public static void main(String[] args) {

		    UserInfo userInfo=new UserInfo(" Manfred"," 0711574912"," HornstegStr 50");

		    userInfo.userDetail();
		    }
		

	}


