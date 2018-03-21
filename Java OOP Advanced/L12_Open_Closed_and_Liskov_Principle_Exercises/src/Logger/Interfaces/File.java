package Logger.Interfaces;

import Logger.Messages.Message;

public interface File {
   void write(String message);
   int getSize();
}
