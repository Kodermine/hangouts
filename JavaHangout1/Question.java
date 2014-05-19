class Question {
	
	//Consider this as another DAO. I know the structure is a little crappy but if this was to be bigger it would be much more useful

	public String question;
	
	public String answer1;
	public String answer2;
	public String answer3;
	public String answer4;
	
	public int rightAnswer;
	
	//Instead of setting each variable solely , you can pass arguments into the constructor(optional at Java). It acts as a normal methods , you can also do calculations and stuff inside here. Called upon the creation of the class' object
	public Question(String question , String answer1 , String answer2 , String answer3 , String answer4 , int rightAnswer){
		
		this.question = question;
		
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		
		this.rightAnswer = rightAnswer;
	}
	
}
