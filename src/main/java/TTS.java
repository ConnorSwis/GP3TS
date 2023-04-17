import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TTS {
    public static void say(String text) throws IOException {

//            String text = GPT.getResponse("(In minecraft)\nPlayer: *Hits villager*\n Villager: ");
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice != null) {
            voice.allocate();// Allocating Voice
            try {
                voice.setRate(140);// Setting the rate of the voice
                voice.setPitch(100);// Setting the Pitch of the voice
                voice.setVolume(1);// Setting the volume of the voice
                voice.speak(text);// Calling speak() method

            } catch (Exception e1) {
                e1.printStackTrace();
            }

        } else {
            throw new IllegalStateException("Cannot find voice: kevin16");
        }
    }
}