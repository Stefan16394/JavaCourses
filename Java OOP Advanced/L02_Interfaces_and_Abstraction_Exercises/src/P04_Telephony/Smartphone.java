package P04_Telephony;

public class Smartphone implements Functionality {

    @Override
    public void call(String[] numbers) {
       for (String number:numbers)
       {
           boolean isValid=true;
           for (int i=0;i<number.length();i++)
           {
               if (Character.isLetter(number.charAt(i)))
               {
                   System.out.println("Invalid number!");
                   isValid=false;
                   break;
               }
           }
           if (isValid)
           {
               System.out.println("Calling... "+number);
           }

       }
    }

    @Override
    public void browse(String[] webSites) {
        for (String webiste:webSites)
        {
            boolean isValid=true;
            for (int i=0;i<webiste.length();i++)
            {
                if (Character.isDigit(webiste.charAt(i)))
                {
                    System.out.println("Invalid URL!");
                    isValid=false;
                    break;
                }
            }
            if (isValid)
            {
                System.out.println("Browsing: "+webiste+"!");
            }

        }
    }
}
