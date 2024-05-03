package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 单张扑克牌类
class Card {
    private String huase; // 花色
    private String dianshu; // 点数

    public Card(String huase, String dianshu) {
        this.huase = huase;
        this.dianshu = dianshu;
    }

    public int getValue() {
        switch (dianshu) {
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(dianshu);
        }
    }

    @Override
    public String toString() {
        return dianshu + huase;
    }
}

// 一副扑克牌类
class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = generateDeck();
        Collections.shuffle(cards);
    }

    private List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();
        String[] huases = {"♠", "♥", "♦", "♣"};
        String[] dianshus = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String huase : huases) {
            for (String dianshu : dianshus) {
                deck.add(new Card(huase, dianshu));
            }
        }
        return deck;
    }



    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null; // 牌已经发完
        }
    }
}

// 玩家类
class Player {
    private List<Card> hand;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public void takeCard(Card card) {
        hand.add(card);
    }

    public int getScore() {
        int score = 0;
        for (Card card : hand) {
            score += card.getValue();
        }
        return score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : hand) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString();
    }
}

public class TwentyOneGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player[] players = new Player[3]; // 创建3个玩家
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }

        // 发牌
        for (int i = 0; i < 3; i++) {
            for (Player player : players) {
                player.takeCard(deck.drawCard());
            }
        }

        // 输出每个玩家的手牌和点数
        for (int i = 0; i < players.length; i++) {
            System.out.println("玩家" + (i + 1) + "的手牌：" + players[i].toString());
            System.out.println("玩家" + (i + 1) + "的点数：" + players[i].getScore());
            System.out.println();
        }
    }
}

