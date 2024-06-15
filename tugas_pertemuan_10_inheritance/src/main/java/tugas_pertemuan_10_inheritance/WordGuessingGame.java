/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan_10_inheritance;

import tugas_pertemuan_10_inheritance.Game;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class WordGuessingGame extends Game {
// shfdsfhds
    private String[] words;

    public WordGuessingGame(int guessLimit, String[] words) {
        super(guessLimit);
        this.words = words;
    }

    @Override
    public void generateNumber() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        secretNumber = index; // Memperlakukan indeks sebagai nomor acak
    }

    @Override
    public String checkGuess(int guess) {
        if (guess == secretNumber) {
            return "Benar! Anda menebak kata \"" + words[secretNumber] + "\"";
        } else if (guess > secretNumber) {
            return "Kata yang dicari ada di urutan alfabet yang lebih awal.";
        } else {
            return "Kata yang dicari ada di urutan alfabet yang lebih akhir.";
        }
    }
}
