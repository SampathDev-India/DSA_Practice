package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		
		List<List<String>> skills = Arrays.asList(
				Arrays.asList("Java", "Spring ", "SpringBoot"),
				Arrays.asList("Angular", " css", "Html")
				);
		System.out.println("Skills with list of list : "+ skills);
		
		List<String> allSkills = skills.stream().flatMap(skill -> skill.stream()).collect(Collectors.toList());
		
		System.out.println(" "+ allSkills);
		
		List<String> skillsStartswithS = allSkills.stream().filter(skill -> skill.startsWith("S")).collect(Collectors.toList());
		
		System.out.println(skillsStartswithS);
	}

}
