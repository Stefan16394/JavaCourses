package Logger.Files;

import Logger.Interfaces.File;

public class LogFile implements File {
    private int size;

    public LogFile() {
        this.size = 0;
    }

    @Override
    public void write(String message) {

            int sumOfAsci=0;
            for (Character c:message.toCharArray())
            {
                if (Character.isLetter(c))
                {
                    sumOfAsci+=(int) c;
                }
            }
            this.size+=sumOfAsci;
    }

    public int getSize() {
        return size;
    }
}
