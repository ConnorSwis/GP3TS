import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String line = GPT.getResponse("(In Minecraft. Only respond with one voice-line)\nPlayer: *Hits villager*\nVillager: ");
        System.out.println(line);
        TTS.say(line);
    }
}