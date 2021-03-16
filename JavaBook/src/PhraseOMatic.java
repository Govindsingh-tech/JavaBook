
public class PhraseOMatic {

	public static void main(String[] args) {
		String[] wordListOne = {"24/7", "multitier", "30,000 foot", "b-to-b", "win-win", "frontend", "web-based", 
				"pervasive", "smart", "six-sigma", "critical path", "dynamic"};
		
		String[] wordListTwo = {"empowered", "sticky", "value added", "oriented", "centric", 
				"distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", 
				"focused", "leeraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", 
				"core competency", "startegy", "mindshare", "portal", "space", "vision", "paradigm", 
				"mission"};
		
		//find out how many words are in each list!
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		System.out.println(oneLength);
		
		//generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		//now build a phrase
		String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
		
		//print out the phrase 
		System.out.println("What we need is a "+ phrase);
	}

}
