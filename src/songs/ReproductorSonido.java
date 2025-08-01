/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songs;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ReproductorSonido {
    public static void reproducirSonido(String rutaSonido) {
        try {
            File archivoSonido = new File("src/songs/radio.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivoSonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start(); // Reproduce una vez
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error al reproducir sonido: " + e.getMessage());
        }
    }
}
