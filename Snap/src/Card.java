/**
 * Class represents the Card and its attributes
 */
public class Card{
	
	//Variables
	private String suit;
	private String value;

	//Constructor
	public Card(String suit, String value)
	{
		setSuit(suit);
		setValue(value);
	}
	
	//Getter functions
	public String getSuit()
	{
		return suit;
	}
	
	public String getValue()
	{
		return value;
	}
	
	//Setter functions
	public void setSuit(String suit)
	{
		this.suit = suit;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	//Makes it easy to print the card values
	public String toString()
	{
		return (value+" of "+suit);
	}
}

