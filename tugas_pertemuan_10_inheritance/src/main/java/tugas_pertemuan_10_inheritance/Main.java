/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tugas_pertemuan_10_inheritance;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        // Contoh Game Tebak Angka
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();
// Contoh Game Tebak Kata
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
    }
}
