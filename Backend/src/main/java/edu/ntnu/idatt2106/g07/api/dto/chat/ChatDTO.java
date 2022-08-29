package edu.ntnu.idatt2106.g07.api.dto.chat;

import edu.ntnu.idatt2106.g07.api.dto.user.UserInfoDTO;
import edu.ntnu.idatt2106.g07.api.entity.Chat;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ChatDTO {
    private Long id;
    private List<UserInfoDTO> users;
    private List<ChatMessageDTO> messages;

    public ChatDTO(Chat chat) {
        id = chat.getId();
        users = chat.getUsers().stream().map(UserInfoDTO::new).collect(Collectors.toList());
        messages = chat.getMessages().stream().map(MessageChatMessageDTO::new).collect(Collectors.toList());
    }
}
