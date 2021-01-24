class Person {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }
}
//Driver class
class Throw {

	public static void main(String[] args) {
		
		Person.checkAge(16); // Set age to 15 (which is below 18...)
	}

}
