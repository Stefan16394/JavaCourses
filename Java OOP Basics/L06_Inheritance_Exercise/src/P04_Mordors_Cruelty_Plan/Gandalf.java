package P04_Mordors_Cruelty_Plan;

public class Gandalf {
    private int hapiness;

    public void eatFood(String food)
    {
        switch (food.toLowerCase())
        {
            case "cram":
                this.hapiness+=2;
                break;
            case "lembas":
                this.hapiness+=3;
                break;
            case "apple":
                this.hapiness+=1;
                break;
            case "melon":
                this.hapiness+=1;
                break;
            case "honeycake":
                this.hapiness+=5;
                break;
            case "mushrooms":
                this.hapiness-=10;
                break;
            default:
                this.hapiness-=1;
                break;
        }
    }



    public String getMood() {
       if (hapiness<-5)
       {
           return "Angry";
       }
       else if(hapiness < 0)
       {
           return "Sad";
       }
       else if(hapiness < 15)
       {
           return "Happy";
       }
       else
       {
           return "JavaScript";
       }
    }


    public int getHapiness() {
        return hapiness;
    }

    @Override
    public String toString()
    {
       StringBuilder sb=new StringBuilder();
       sb.append(getHapiness()).append("\n");
       sb.append(getMood());
       return sb.toString();
    }
}
