package DSA_Executor;

import Exception.CustomCheckedException;

public class TestExceptionExecutor {

	public static void main(String[] args) {

	     // 1. Throw using message only
        try {
            throw new CustomCheckedException("User not found");
        } catch (CustomCheckedException e) {
            System.out.println("1.Handled with message only: " + e.getMessage());
        }

        // 2. Throw using message and cause
        try {
            try {
                Integer.parseInt("abc"); // Will throw NumberFormatException
            } catch (NumberFormatException e) {
                throw new CustomCheckedException("Invalid number format", e);
            }
        } catch (CustomCheckedException e) {
            System.out.println("2. Handled with message and cause: " + e.getMessage());
            System.out.println("2. Original cause: " + e.getCause());
        }

        // 3. Throw using only cause
        try {
            try {
                String text = null;
                text.length(); // Will throw NullPointerException
            } catch (NullPointerException e) {
                throw new CustomCheckedException(e);
            }
        } catch (CustomCheckedException e) {
            System.out.println("3. Handled with cause only: " + e.getCause());
        }
        
        int age =10;
        try {
            validateAge(age);
        }catch(CustomCheckedException e) {
        	System.out.println("4. Validate Age : "+e.getMessage());
        }
                
	}
	
	/**
     * This method declares it might throw CustomCheckedException.
     * The caller must handle it with try-catch or declare it further.
     */
    public static void validateAge(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Age must be at least 18");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

}
