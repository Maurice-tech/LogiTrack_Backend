package org.logitrack.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessagingObject {
    private static final long serialVersionUID = 1L;
    private String subject;
    private String title;

    private String senderName;

    private String message;

    private String destinationEmail;

    private Purpose purpose;
}
