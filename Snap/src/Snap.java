/**
 * @author ronan ray fabricante
 * The project is to simulate a game of snap between two players 
 * using standard playing card decks.
 * 
 * Input
 * Number of card decks to play with
 * How cards should be matched: on suit, value, or both
 * Output
 * The winner of the game 
 */

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Snap
{
	
	public static void main(String[] args)
	{
		//Variables
		ArrayList<Card> cards = createDeck();
		Queue<Card> player1 = new LinkedList<Card>();
		Queue<Card> player2 = new LinkedList<Card>();
		int i = 0;
		String matchType = "value";
		
		/*The application should ask the user whether cards should be matched: 
		  on suit, value, or both
		  default it to value*/
		
		try {
			System.out.println("How do you want the cards to be matched: suit, value, or both?");
			DataInputStream ds = new DataInputStream(System.in);
			matchType = ds.readLine();
			System.out.println("card matching type " + matchType);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Splits the deck evenly between both players
		for(Card card: cards)
		{
			if(i < (cards.size()/2))
			{
				player1.add(card);
				i++;
			}
			else
			{
				player2.add(card);
			}
		}
		
		//Variables
		boolean end = false;
		int playerNo = 1;
		boolean check = false;
		Card card1 = player1.peek();
		Card card2 = player2.peek();
				
		//Main game, keeps comparing cards until no more card left on a player
		while (end == false)
		{
			if (player1.size() == 0 || player2.size() == 0)
			{
				end = true;
				//declare winner
				if (player1.size() > player2.size())
				{
					System.out.println("Player1 wins");
				}
				else if (player2.size() > player1.size())
				{
					System.out.println("Player1 wins");
				}
				else
				{
					System.out.println("We have a draw!");
				}
			}
			else 
			{	
				//While loop keeps comparing cards until a winner is declared 
				while (player1.size() > 0 && player2.size() >0)
				{
					//Check if player1 matches previous player2 card 
					System.out.println("Player 1: "+player1.peek());
					System.out.println("Player 2: "+player2.peek());
					check = checkCards(player1.peek(), player2.peek(), matchType);
					
					if (check == true)
					{
						//which of the 2 players shouts snap first
						playerNo = ThreadLocalRandom.current().nextInt(1,2);
						System.out.println("Player "+playerNo  +" shouts: Snap!");
						
						//Player who shouts first takes the other players cards
						if(playerNo == 1)
						{
							//player1 takes player2's card
							player1.add(player2.peek());
							player2.remove();
						}
						else
						{
							//player2 takes player1's card
							player2.add(player1.peek());
							player1.remove();
						}
						
						//check current card size
						System.out.println("Player 1 card size: "+player1.size());
						System.out.println("Player 2 card size: "+player2.size());
						
					}
					else
					{
							//move the played cards to the bottom of the queue
							card1 = player1.remove();
							player1.add(card1);
							card2 = player2.remove();
							player2.add(card2);
							
					}
				}
			}
			
		}
	}
	
	//Compares 2 cards to check if they are the same
	public static boolean checkCards(Card a, Card b, String matchType)
	{
		//Checks if same value
		if (matchType.equalsIgnoreCase("value"))
		{
			if(a.getValue() == b.getValue())
			{
				return true;
			}
		} else if (matchType.equalsIgnoreCase("suit"))
		{
			if(a.getSuit() == b.getSuit())
			{
				return true;
			}
		}
		else
		{
			if ((a.getValue() == b.getValue()) && (matchType.equalsIgnoreCase("suit")))
			{
				return true;
			}
		}
		return false;
	}
	
	//Creates a shuffled deck
	public static ArrayList<Card> createDeck()
	{
		
		int numDeck = 1;
		
		//ask a user to enter the number of card decks to play
		try {
			System.out.println("Enter the number of decks to play");
			DataInputStream ds = new DataInputStream(System.in);
			numDeck = 	Integer.parseInt(ds.readLine());
			System.out.println("number of cards to play is " + numDeck*52);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Variables
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		ArrayList<Card> cards = new ArrayList<Card>();
		
		//Creates a deck of numDeck*52 unique cards
		for (int d =0; d< numDeck; d++)
		{
			for(int i = 0; i < suits.length; i++)
			{
				for( int j = 0; j < values.length; j++)
				{
					cards.add(new Card(suits[i],values[j]));
				}
			}
		}
	
		//The application should shuffle the decks before play commences
		Collections.shuffle(cards);
		return cards;
	}
}
