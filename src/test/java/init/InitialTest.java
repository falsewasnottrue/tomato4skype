package init;

import com.skype.ChatMessage;
import com.skype.ChatMessageAdapter;
import com.skype.Skype;
import com.skype.SkypeException;
import org.junit.Test;

public class InitialTest {

  @Test
  public void test() throws Exception {

    Skype.addChatMessageListener(new ChatMessageAdapter() {
      @Override
      public void chatMessageReceived(ChatMessage receivedChatMessage) throws SkypeException {
        if (receivedChatMessage.getType().equals(ChatMessage.Type.SAID)) {
          receivedChatMessage.getSender().send("I'm working. Please wait a moment.");
        }
      }
    });
  }
}
