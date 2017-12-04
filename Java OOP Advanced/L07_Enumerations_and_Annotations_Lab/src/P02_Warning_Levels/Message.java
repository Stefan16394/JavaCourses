package P02_Warning_Levels;

public class Message {
    private Importance importance;
    private String message;

    public Message(Importance importance, String message) {
        this.importance = importance;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",importance,message);
    }

    public Importance getImportance() {
        return importance;
    }

    public String getMessage() {
        return message;
    }
}
