package chat21.android.core.conversations.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.ServerValue;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by stefano on 06/10/2015.
 */
public class Conversation implements Serializable {

    /**** conversation status ****/
    public static final int CONVERSATION_STATUS_FAILED = 0; // non andato a buon fine
    //creo una conversazione (NON chiaro) - usato solo per conversazioni di gruppo
    public static final int CONVERSATION_STATUS_JUST_CREATED = 1;
    // la conversazione contiene l'ultimo messaggio inviato
    public static final int CONVERSATION_STATUS_LAST_MESSAGE = 2;


    @Exclude
    private String conversationId;
    @Exclude
    private String convers_with;
    private String convers_with_fullname;
    private Boolean is_new;
    private String last_message_text;
    private String recipient;
    private String recipient_fullname;
    private String sender;
    private String sender_fullname;
    private int status;
    private Long timestamp;
    private Map<String, Object> extras;
    private String group_id;
    private String group_name;

    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    public Conversation() {
    }

    @Exclude
    public String getConversationId() {
        return conversationId;
    }

    @Exclude
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    @Exclude
    public String getConvers_with() {
        return convers_with;
    }

    @Exclude
    public void setConvers_with(String convers_with) {
        this.convers_with = convers_with;
    }

    public String getConvers_with_fullname() {
        return convers_with_fullname;
    }

    public void setConvers_with_fullname(String convers_with_fullname) {
        this.convers_with_fullname = convers_with_fullname;
    }

    public Boolean getIs_new() {
        return is_new;
    }

    public void setIs_new(Boolean is_new) {
        this.is_new = is_new;
    }

    public String getLast_message_text() {
        return last_message_text;
    }

    public void setLast_message_text(String last_message_text) {
        this.last_message_text = last_message_text;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipientFullName() {
        return recipient_fullname;
    }

    public void setRecipientFullName(String recipient_fullname) {
        this.recipient_fullname = recipient_fullname;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender_fullname() {
        return sender_fullname;
    }

    public void setSender_fullname(String sender_fullname) {
        this.sender_fullname = sender_fullname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public java.util.Map<String, String> getTimestamp() {
        return ServerValue.TIMESTAMP;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Exclude
    public Long getTimestampLong() {
        return timestamp;
    }

    public Map<String, Object> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, Object> extras) {
        this.extras = extras;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    public String toString() {
        return "Conversation{" +
                "conversationId='" + conversationId + '\'' +
                ", convers_with='" + convers_with + '\'' +
                ", convers_with_fullname='" + convers_with_fullname + '\'' +
                ", is_new=" + is_new +
                ", last_message_text='" + last_message_text + '\'' +
                ", recipient='" + recipient + '\'' +
                ", recipient_fullname='" + recipient_fullname + '\'' +
                ", sender='" + sender + '\'' +
                ", sender_fullname='" + sender_fullname + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                ", extras=" + extras +
                ", group_id='" + group_id + '\'' +
                ", group_name='" + group_name + '\'' +
                '}';
    }
}