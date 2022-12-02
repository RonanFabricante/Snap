# Snap
Snap Project for Blink

THE ASSIGNMENT

We would like you to write a command line app in Scala or Java. You are free to use just 
standard libraries, or any combination of others that will make the task easier for you, or 
cleaner. The problem is deliberately not too complex to focus on the things mentioned above.
The task is to simulate a game of snap between two players using standard playing card decks.
These requirements should drive your solution in a way that will show us multiple facets of your 
coding style:

• The application should ask the user how many playing card decks to play with (also 
possibly how many players, but can also default to just 2)
• The application should ask the user whether cards should be matched: on suit, value, or 
both
• The application should shuffle the decks before play commences
• Games of snap should then be simulated between players. Cards are played one at a 
time in order by each player in the game, onto their stack. When a player deals a card 
that matches a card at the top of another player's stack, the first player to 'shout' snap 
'takes' the two piles.
• The stop condition can be either after the first round when all cards were dealt, with the 
winner being the player who scored more cards, or after multiple rounds once one 
player holds all the cards. Whichever is easier / makes more sense to you. 
• You may choose single or multithreaded approach whichever suits you better, but do 
include some form of randomness

Here is a sample output:
Enter the number of decks to play
1
number of cards to play is 52
How do you want the cards to be matched: suit, value, or both?
suit
card matching type suit
Player 1: King of Spades
Player 2: 7 of Diamonds
Player 1: 7 of Spades
Player 2: 2 of Clubs
Player 1: Jack of Clubs
Player 2: 10 of Spades
Player 1: 5 of Spades
Player 2: 4 of Clubs
Player 1: King of Diamonds
Player 2: 10 of Clubs
Player 1: Queen of Hearts
Player 2: Jack of Hearts
Player 1 shouts: Snap!
Player 1 card size: 27
Player 2 card size: 25
Player 1: Queen of Hearts
Player 2: 4 of Hearts
Player 1 shouts: Snap!
Player 1 card size: 28
Player 2 card size: 24
Player 1: Queen of Hearts
Player 2: 8 of Diamonds
Player 1: Queen of Clubs
Player 2: 3 of Spades
Player 1: Jack of Spades
Player 2: King of Hearts
Player 1: 10 of Hearts
Player 2: 8 of Spades
Player 1: Ace of Diamonds
Player 2: 6 of Spades
Player 1: 8 of Clubs
Player 2: 2 of Diamonds
Player 1: 10 of Diamonds
Player 2: 3 of Clubs
Player 1: Ace of Hearts
Player 2: 6 of Hearts
Player 1 shouts: Snap!
Player 1 card size: 29
Player 2 card size: 23
Player 1: Ace of Hearts
Player 2: 7 of Hearts
Player 1 shouts: Snap!
Player 1 card size: 30
Player 2 card size: 22
Player 1: Ace of Hearts
Player 2: 9 of Hearts
Player 1 shouts: Snap!
Player 1 card size: 31
Player 2 card size: 21
Player 1: Ace of Hearts
Player 2: 3 of Hearts
Player 1 shouts: Snap!
Player 1 card size: 32
Player 2 card size: 20
Player 1: Ace of Hearts
Player 2: 9 of Diamonds
Player 1: 5 of Diamonds
Player 2: 7 of Clubs
Player 1: Queen of Spades
Player 2: 2 of Hearts
Player 1: Jack of Diamonds
Player 2: 4 of Diamonds
Player 1 shouts: Snap!
Player 1 card size: 33
Player 2 card size: 19
Player 1: Jack of Diamonds
Player 2: 9 of Spades
Player 1: 3 of Diamonds
Player 2: 9 of Clubs
Player 1: 4 of Spades
Player 2: Ace of Clubs
Player 1: 6 of Clubs
Player 2: 5 of Clubs
Player 1 shouts: Snap!
Player 1 card size: 34
Player 2 card size: 18
Player 1: 6 of Clubs
Player 2: 7 of Diamonds
Player 1: 5 of Hearts
Player 2: 2 of Clubs
Player 1: Ace of Spades
Player 2: 10 of Spades
Player 1 shouts: Snap!
Player 1 card size: 35
Player 2 card size: 17
Player 1: Ace of Spades
Player 2: 4 of Clubs
Player 1: 8 of Hearts
Player 2: 10 of Clubs
Player 1: King of Clubs
Player 2: 8 of Diamonds
Player 1: Queen of Diamonds
Player 2: 3 of Spades
Player 1: 2 of Spades
Player 2: King of Hearts
Player 1: 6 of Diamonds
Player 2: 8 of Spades
Player 1: King of Spades
Player 2: 6 of Spades
Player 1 shouts: Snap!
Player 1 card size: 36
Player 2 card size: 16
Player 1: King of Spades
Player 2: 2 of Diamonds
Player 1: 7 of Spades
Player 2: 3 of Clubs
Player 1: Jack of Clubs
Player 2: 9 of Diamonds
Player 1: 5 of Spades
Player 2: 7 of Clubs
Player 1: King of Diamonds
Player 2: 2 of Hearts
Player 1: Jack of Hearts
Player 2: 9 of Spades
Player 1: 4 of Hearts
Player 2: 9 of Clubs
Player 1: Queen of Hearts
Player 2: Ace of Clubs
Player 1: Queen of Clubs
Player 2: 7 of Diamonds
Player 1: Jack of Spades
Player 2: 2 of Clubs
Player 1: 10 of Hearts
Player 2: 4 of Clubs
Player 1: Ace of Diamonds
Player 2: 10 of Clubs
Player 1: 8 of Clubs
Player 2: 8 of Diamonds
Player 1: 10 of Diamonds
Player 2: 3 of Spades
Player 1: 6 of Hearts
Player 2: King of Hearts
Player 1 shouts: Snap!
Player 1 card size: 37
Player 2 card size: 15
Player 1: 6 of Hearts
Player 2: 8 of Spades
Player 1: 7 of Hearts
Player 2: 2 of Diamonds
Player 1: 9 of Hearts
Player 2: 3 of Clubs
Player 1: 3 of Hearts
Player 2: 9 of Diamonds
Player 1: Ace of Hearts
Player 2: 7 of Clubs
Player 1: 5 of Diamonds
Player 2: 2 of Hearts
Player 1: Queen of Spades
Player 2: 9 of Spades
Player 1 shouts: Snap!
Player 1 card size: 38
Player 2 card size: 14
Player 1: Queen of Spades
Player 2: 9 of Clubs
Player 1: 4 of Diamonds
Player 2: Ace of Clubs
Player 1: Jack of Diamonds
Player 2: 7 of Diamonds
Player 1 shouts: Snap!
Player 1 card size: 39
Player 2 card size: 13
Player 1: Jack of Diamonds
Player 2: 2 of Clubs
Player 1: 3 of Diamonds
Player 2: 4 of Clubs
Player 1: 4 of Spades
Player 2: 10 of Clubs
Player 1: 5 of Clubs
Player 2: 8 of Diamonds
Player 1: 6 of Clubs
Player 2: 3 of Spades
Player 1: 5 of Hearts
Player 2: 8 of Spades
Player 1: 10 of Spades
Player 2: 2 of Diamonds
Player 1: Ace of Spades
Player 2: 3 of Clubs
Player 1: 8 of Hearts
Player 2: 9 of Diamonds
Player 1: King of Clubs
Player 2: 7 of Clubs
Player 1 shouts: Snap!
Player 1 card size: 40
Player 2 card size: 12
Player 1: King of Clubs
Player 2: 2 of Hearts
Player 1: Queen of Diamonds
Player 2: 9 of Clubs
Player 1: 2 of Spades
Player 2: Ace of Clubs
Player 1: 6 of Diamonds
Player 2: 2 of Clubs
Player 1: 6 of Spades
Player 2: 4 of Clubs
Player 1: King of Spades
Player 2: 10 of Clubs
Player 1: 7 of Spades
Player 2: 8 of Diamonds
Player 1: Jack of Clubs
Player 2: 3 of Spades
Player 1: 5 of Spades
Player 2: 8 of Spades
Player 1 shouts: Snap!
Player 1 card size: 41
Player 2 card size: 11
Player 1: 5 of Spades
Player 2: 2 of Diamonds
Player 1: King of Diamonds
Player 2: 3 of Clubs
Player 1: Jack of Hearts
Player 2: 9 of Diamonds
Player 1: 4 of Hearts
Player 2: 2 of Hearts
Player 1 shouts: Snap!
Player 1 card size: 42
Player 2 card size: 10
Player 1: 4 of Hearts
Player 2: 9 of Clubs
Player 1: Queen of Hearts
Player 2: Ace of Clubs
Player 1: Queen of Clubs
Player 2: 2 of Clubs
Player 1 shouts: Snap!
Player 1 card size: 43
Player 2 card size: 9
Player 1: Queen of Clubs
Player 2: 4 of Clubs
Player 1 shouts: Snap!
Player 1 card size: 44
Player 2 card size: 8
Player 1: Queen of Clubs
Player 2: 10 of Clubs
Player 1 shouts: Snap!
Player 1 card size: 45
Player 2 card size: 7
Player 1: Queen of Clubs
Player 2: 8 of Diamonds
Player 1: Jack of Spades
Player 2: 3 of Spades
Player 1 shouts: Snap!
Player 1 card size: 46
Player 2 card size: 6
Player 1: Jack of Spades
Player 2: 2 of Diamonds
Player 1: 10 of Hearts
Player 2: 3 of Clubs
Player 1: Ace of Diamonds
Player 2: 9 of Diamonds
Player 1 shouts: Snap!
Player 1 card size: 47
Player 2 card size: 5
Player 1: Ace of Diamonds
Player 2: 9 of Clubs
Player 1: 8 of Clubs
Player 2: Ace of Clubs
Player 1 shouts: Snap!
Player 1 card size: 48
Player 2 card size: 4
Player 1: 8 of Clubs
Player 2: 8 of Diamonds
Player 1: 10 of Diamonds
Player 2: 2 of Diamonds
Player 1 shouts: Snap!
Player 1 card size: 49
Player 2 card size: 3
Player 1: 10 of Diamonds
Player 2: 3 of Clubs
Player 1: King of Hearts
Player 2: 9 of Clubs
Player 1: 6 of Hearts
Player 2: 8 of Diamonds
Player 1: 7 of Hearts
Player 2: 3 of Clubs
Player 1: 9 of Hearts
Player 2: 9 of Clubs
Player 1: 3 of Hearts
Player 2: 8 of Diamonds
Player 1: Ace of Hearts
Player 2: 3 of Clubs
Player 1: 5 of Diamonds
Player 2: 9 of Clubs
Player 1: 9 of Spades
Player 2: 8 of Diamonds
Player 1: Queen of Spades
Player 2: 3 of Clubs
Player 1: 4 of Diamonds
Player 2: 9 of Clubs
Player 1: 7 of Diamonds
Player 2: 8 of Diamonds
Player 1 shouts: Snap!
Player 1 card size: 50
Player 2 card size: 2
Player 1: 7 of Diamonds
Player 2: 3 of Clubs
Player 1: Jack of Diamonds
Player 2: 9 of Clubs
Player 1: 3 of Diamonds
Player 2: 3 of Clubs
Player 1: 4 of Spades
Player 2: 9 of Clubs
Player 1: 5 of Clubs
Player 2: 3 of Clubs
Player 1 shouts: Snap!
Player 1 card size: 51
Player 2 card size: 1
Player 1: 5 of Clubs
Player 2: 9 of Clubs
Player 1 shouts: Snap!
Player 1 card size: 52
Player 2 card size: 0
Player1 wins
