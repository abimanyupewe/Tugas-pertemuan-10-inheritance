/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan_10_inheritance;

/**
 *
 * @author Lenovo
 */
public class NumberGuessingGame extends Game {

    public NumberGuessingGame(int guessLimit) {
        super(guessLimit);
    }

    @Override
    public void play() {
        super.play(); // Memanggil metode dari kelas base
        System.out.println("Terima kasih sudah bermain!");
    }
}
