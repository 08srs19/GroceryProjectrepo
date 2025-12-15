package utilities;

import com.github.javafaker.Faker;

public class FakerUtilities {
	Faker faker = new Faker();
	public String creatARandomFirstName() 
	{
		return faker.name().firstName();

	}
	public String generateAddress() 
	{
		return faker.address().fullAddress();

	}

	public String generateEmail() 
	{
		return faker.internet().emailAddress();

	}

}
