package poker.dominio;

public class card {
    private String character;
    private String suit;

    @Override
    public String toString() {
        return character + " of " + suit;
    }

    public card(String character, String suit) {
        this.character = character;
        this.suit = suit;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
