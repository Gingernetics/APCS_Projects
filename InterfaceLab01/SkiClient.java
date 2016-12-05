public class SkiClient{

    // precondition: jumpers != null and jumpers.length > 0
    // postcondition: returns the SkiJumper with the most jumps
    public static SkiJumper mostExperienced(SkiJumper [] jumpers){
	SkiJumper ans = jumpers[0];
	for (SkiJumper s : jumpers)
		if (s.compareTo(ans) > 0)
			ans = s;
	return ans;
    }
    

    public static void main(String [] args){
	SkiJumper[] jumpers = {new SkiJumper("Bill","White"),
			       new SkiJumper("Carol", "Sage"),
			       new SkiJumper("Pat", "Lee")
	};

	/*
	// print jumpers
	for (SkiJumper s : jumpers)
	    System.out.println(s);
	*/

	// train
	for (SkiJumper s : jumpers){
	    s.train(Math.random() * 100);
	    while (Math.random() < 0.9)  s.fly();
	}

	// print jumpers
	for (SkiJumper s : jumpers)
	    System.out.println(s);


	// find the most experience SkiJumper
	System.out.println("Most experienced jumper: " + mostExperienced(jumpers));
	
    }


}
