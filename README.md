# IndroCore
The main plugin that all Indro Plugins will be based off on.

All indro plugins will work independently of IndroCore but will not connect to each other
This plugin has no commands or client interaction excluding admin commands designed for streamlining setup

How to add the programs to the API:
````
// replace <placeholder> with the plugin name
public interface <placeholder> {
  // put important methods of your program in the interface, without a body

  void setMoney(Player player, int value);
  
  // you shouldn't need to put code in, but if needed:
  
  default int calculateLoss(Player player, int value) {
    // put code here
  }
}


/*
 - once finished, package and add; or import the API into your program and implement the interface previously created.
*/
````
