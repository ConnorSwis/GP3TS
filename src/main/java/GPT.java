import com.theokanning.openai.service.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import io.github.cdimascio.dotenv.Dotenv;

public class GPT {
    private static final Dotenv dotenv = Dotenv.load();
    public static String getResponse(String prompt) {
        String token = dotenv.get("OPENAI_API_KEY");
        OpenAiService service = new OpenAiService(token);

        CompletionRequest completionRequest = CompletionRequest.builder()
                .model("text-curie-001")
                .prompt(prompt)
                .user("testing")
                .maxTokens(200)
                .n(1)
                .build();

        return service.createCompletion(completionRequest).getChoices().get(0).getText();
    }
}
