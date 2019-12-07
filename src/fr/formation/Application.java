package fr.formation;

public class Application {

	public static void main(String[] args) {
		Cowboy luckyLuke = createLuckyLuke();
		Cowboy joeDalton = createJoeDalton();
		System.out.println("Before shooting:");
		print(luckyLuke, joeDalton);
		shootUntilDeath(luckyLuke, joeDalton);
		System.out.println("After shooting:");
		print(luckyLuke, joeDalton);
	    }

	    /**
	     * Les cowboys en paramètres se tirent dessus aléatoirement jusqu'à la mort
	     * de l'un des deux.
	     * <p>
	     * Note: plusieurs solutions possibles pour implémenter un tire aléatoire,
	     * aller au plus simple.
	     */
	    private static void shootUntilDeath(Cowboy luckyLuke, Cowboy joeDalton) {
		// To be implemented
	    	boolean canLuckyContinue = true; 
	    	boolean canJoeContinue = true; 
	    	while( ( canLuckyContinue == true) | (canJoeContinue == true) ) {
	    		
	    		int random = (int) Math.round(Math.random());
	    		
	    		if(0 == random) {
	    			canLuckyContinue = luckyLuke.shoot(joeDalton);
		    	} else {
		    		canJoeContinue = joeDalton.shoot(luckyLuke);
		    	}
	    	}
	    	
	    }

	    private static Cowboy createLuckyLuke() {
		// To be implemented
	    	Cowboy luckyLuke = new Cowboy("Lucky LUKE", 5, new Weapon("Colt 5", 5, 2));
	    	return luckyLuke;
	    }

	    private static Cowboy createJoeDalton() {
		// To be implemented
	    	Cowboy joeDalton = new Cowboy("Joe DALTON", 5, new Weapon("Colt 10", 7, 1));
			return joeDalton;
	    }

	    private static void print(Cowboy luckyLuke, Cowboy joeDalton) {
		System.out.println(luckyLuke);
		System.out.println(joeDalton);
		System.out.println();
	    }

}
