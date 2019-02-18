/**
 * The Character class models a character for a roleplaying game. A character
 * has a name and 3 stats: strength, dexterity, and intelligence, as well as
 * maximum allowed life points and the current value.
 */

public class Character {

	/** static variables */

	static Dice dice = new Dice();

	/** instance variables */

	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	private int maxLife;
	private int currentLife;

	private int maxStrength;
	private int maxDexterity;
	private int maxIntelligence;

	/**
	 * Constructor takes 4 parameters: n,s,d,i and assigns them to instance
	 * variables name, strength, dexterity, intelligence. Also uses the dice
	 * instance to assign a random number to maxlife. currentlife is initialized to
	 * maxlife
	 */

	public Character(String n, int s, int d, int i) {

		this.name = n;
		this.strength = s;
		this.dexterity = d;
		this.intelligence = i;
		if (this.strength > 10) {
			this.strength = 10;
		}

		if (this.dexterity > 10) {
			this.dexterity = 10;
		}

		if (this.intelligence > 10) {
			this.dexterity = 10;
		}

		if (this.strength > 5) {
			this.maxLife = dice.roll(4) * (this.getStrength() * 3);
		} else if (this.strength < 5) {
			this.maxLife = dice.roll(2) * (this.getStrength() * 2);
		}
		this.currentLife = this.getMaxLife();

	}

	/**
	 * Returns a random die roll using the roll method in the Dice.java, *modified
	 * by the character's strength
	 */
	public int attack(int opponentIntelligence) {

		int damage = ((dice.roll(2) * this.getStrength() * this.getDexterity() * 2) / (opponentIntelligence * 2));
		return damage;

	}

	/**
	 * Decreases currentlife by the damage parameter
	 */
	public void wound(int damage) {
		this.currentLife -= damage;
	}

	/**
	 * Increases currentlife by the heal parameter. currentlife cannot be greater
	 * than maxlife
	 */
	public void heal(int heal) {
		int lifeAfterHeal = this.currentLife += heal * this.getIntelligence();

		if (lifeAfterHeal > this.maxLife) {
			this.currentLife = this.maxLife;
		} else {
			this.currentLife = lifeAfterHeal;
		}
	}

	/**
	 * Returns name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns strength
	 */
	public int getStrength() {
		return this.strength;
	}

	/**
	 * Returns dexterity
	 */
	public int getDexterity() {
		return this.dexterity;
	}

	/**
	 * Returns intelligence
	 */
	public int getIntelligence() {
		return this.intelligence;
	}

	/**
	 * Returns currentlife
	 */
	public int getCurrentLife() {
		return this.currentLife;
	}

	/**
	 * Returns maxlife
	 */
	public int getMaxLife() {
		return this.maxLife;
	}
}
