package ru.hbb.game.newyeargame.SoundSystem;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class SoundManager {

    public static SoundManager instance;
    public ClipStage back_ground_music = ClipStage.NEED_TO_RUN;
    public boolean question_music_play = false;
    private Clip cur_sound;
    private static final String sound_dir = SoundManager.class.getResource("/sounds").getPath();
    private static final String game_sound_dir = SoundManager.class.getResource("/game").getPath();
    private Map<String, Clip> loaded_sounds = new HashMap<>();

    public SoundManager(){
        instance = this;
    }

    public synchronized void playBackGroundMusic(String sound){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    InputStream iS = new FileInputStream(new File(sound_dir, sound));
                    InputStream bufferedIn = new BufferedInputStream(iS);
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(bufferedIn);
                    clip.open(inputStream);
                    while (true) {
                        Thread.sleep(20);
                        // System.out.println("works! " + SoundManager.getInstance().back_ground_music);
                        try {
                            if (SoundManager.getInstance().back_ground_music.equals(ClipStage.NEED_TO_STOP)) {
                                clip.stop();
                                SoundManager.getInstance().back_ground_music = ClipStage.PAUSED;
                            }
                            if (SoundManager.getInstance().back_ground_music.equals(ClipStage.NEED_TO_RUN)) {
                                clip.start();
                                clip.loop(1000);
                                SoundManager.getInstance().back_ground_music = ClipStage.RUNNING;
                            }
                        }catch (Exception e){
                        }
                    }
                } catch (Exception e) {
                    System.err.println("ERROR! " + e.getMessage());
                }
            }
        }).start();
    }

    public synchronized void playSystemSound(String sound){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    InputStream iS = new FileInputStream(new File(sound_dir, sound));
                    InputStream bufferedIn = new BufferedInputStream(iS);
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(bufferedIn);
                    clip.open(inputStream);
                    SoundManager.getInstance().back_ground_music = ClipStage.NEED_TO_STOP;
                    Thread.sleep(20);
                    clip.start();
                    Thread.sleep(1000 + clip.getMicrosecondLength() / 1000);
                    clip.stop();
                    if (!SoundManager.getInstance().question_music_play) {
                        SoundManager.getInstance().back_ground_music = ClipStage.NEED_TO_RUN;
                    }
                } catch (Exception e) {
                    System.err.println("ERROR! " + e.getMessage());
                }
            }
        }).start();
    }

    public synchronized void playSound(String sound){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    SoundManager.getInstance().question_music_play = true;
                    Thread.sleep(2000);
                    SoundManager.getInstance().back_ground_music = ClipStage.NEED_TO_STOP;
                    Thread.sleep(3000);
                    Clip clip = AudioSystem.getClip();
                    InputStream iS = new FileInputStream(new File(game_sound_dir, sound));
                    InputStream bufferedIn = new BufferedInputStream(iS);
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(bufferedIn);
                    clip.open(inputStream);
                    clip.start();
                    Thread.sleep(2000 + clip.getMicrosecondLength() / 1000);
                    clip.stop();
                    SoundManager.getInstance().back_ground_music = ClipStage.NEED_TO_RUN;
                    SoundManager.getInstance().question_music_play = false;
                } catch (Exception e) {
                    System.err.println("ERROR! " + e.getMessage());
                }
            }
        }).start();
    }

    public static SoundManager getInstance(){
        return instance;
    }

}
