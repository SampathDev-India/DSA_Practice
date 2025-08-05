package Java_8_Features;

import java.util.Optional;

public class OptionalExample {
	
	 public Optional<String> getUpperCase(String input) {
	        return Optional.ofNullable(input)
	                       .map(String::toUpperCase);
	    }

	    public boolean isPresent(String input) {
	        return Optional.ofNullable(input).isPresent();
	    }

}
