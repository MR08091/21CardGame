
# 🃏 Blackjack 21 - Java Console Game

## 🎮 Description
This is a Blackjack game** also known as 21 written in Java. You play against a computer dealer and try to get a hand value closer to 21 than the dealer — without going over!

---

## 🧠 Game Rules
- The player and dealer are each dealt 2 cards at the start.
- The dealer shows only 1 of their 2 cards.
- Player chooses to:
  - **Hit** – draw another card
  - **Stay** – keep current total
- Cards:
  - 2–10 = face value  
  - J, Q, K = 10  
  - Ace (A) = 11 or 1 (auto-adjusted to avoid bust)
- The dealer will draw cards until reaching at least 16.
- If you go over 21 = **Bust = Lose**
- If the dealer busts or your hand is closer to 21 = **You win!**
- If totals are equal = **Tie**

---

## 🛠️ How to Run

### ✅ Requirements:
- Java 8 or higher
- Terminal / Command Line

### ▶️ Steps:
1. Save the code as `Blackjack21.java`
2. Open your terminal and run:
   ```bash
   javac Blackjack21.java
   java Blackjack21
   ```

---

## 📂 File Structure
```
📁 Blackjack21
 └── Blackjack21.java    ← Main Java source code
 └── README.md           ← This file
```

---

## 🚀 Features
- Playable terminal game
- Clean turn-by-turn interaction
- Automatic handling of Ace as 11 or 1
- Full round with win/loss logic
- Option to play multiple rounds

---

## 🧩 Possible Future Improvements
- Card suits and visual symbols
- Multiple players or AI bots
- Betting system or chips
- Graphical interface with JavaFX or Swing

---

## 👤 Author
Muhammad Rizvi  
Grade 11 Java Project – Blackjack
