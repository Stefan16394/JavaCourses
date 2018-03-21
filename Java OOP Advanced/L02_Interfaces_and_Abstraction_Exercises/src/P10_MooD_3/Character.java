package P10_MooD_3;

public abstract class Character implements ICharacter{
  private String username;
  private String hashedPassword;
  private int level;

    public Character(String username, int level) {
        this.username = username;
        this.hashedPassword=setHashedPassword();
        this.level = level;
    }

    @Override
    public String setHashedPassword() {
     return "";
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    public int getLevel() {
        return this.level;
    }
}
