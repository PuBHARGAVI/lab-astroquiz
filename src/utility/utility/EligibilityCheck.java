package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface {


	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int points1=Integer.parseInt(points);
		if(points1>=80) {
			return true;
		}
		else {
		return false;
	}
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		return checkUser(user);
		
	}

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if(((18 <=user.getAge()) && (user.getAge() <= 35)) && ((155 <=user.getHeight()) && (user.getHeight()<=170)) && ((55<=user.getWeight()) && (user.getWeight()<= 90)) && user.getCountry().equals("ProGrad")){
			return true;
		}
		return false;
	} 

	
	
}







