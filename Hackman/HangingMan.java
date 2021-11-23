public class HangingMan {

    private int numWrongGuesses;
    private String[] HangmanImage = {
                                "        ☆\n" + 
                                "      /   \\\n" +
                                "     /  o  \\\n" +
                                "     ~~~~~~~\n" +
                                "    /  o    \\\n" +
                                "   /       o \\\n" +
                                "   ~~~~~~~~~~~\n" +
                                "  /      o    \\\n" +
                                " /  o        o \\\n" +
                                " ~~~~~~~~~~~~~~~\n" +
                                "        ||\n",       
          

                                "        ☆\n" + 
                                "      /   \\\n" +
                                "     /  o  \\\n" +
                                "     ~~~~~~~\n" +
                                "    /  o    \\\n" +
                                "   /       o \\\n" +
                                "   ~~~~~~~~~~~\n" +
                                "  /      o    \\\n" +
                                " /  o          \\\n" +
                                " ~~~~~~~~~~~~~~~\n" +
                                "        ||\n",
                            
                                
                                "        ☆\n" + 
                                "      /   \\\n" +
                                "     /  o  \\\n" +
                                "     ~~~~~~~\n" +
                                "    /  o    \\\n" +
                                "   /       o \\\n" +
                                "   ~~~~~~~~~~~\n" +
                                "  /      o    \\\n" +
                                " /             \\\n" +
                                " ~~~~~~~~~~~~~~~\n" +
                                "        ||\n",
                            
                                
                                "        ☆\n" + 
                                "      /   \\\n" +
                                "     /  o  \\\n" +
                                "     ~~~~~~~\n" +
                                "    /  o    \\\n" +
                                "   /       o \\\n" +
                                "   ~~~~~~~~~~~\n" +
                                "  /           \\\n" +
                                " /             \\\n" +
                                " ~~~~~~~~~~~~~~~\n" +
                                "        ||\n",
                                
                                
                                "        ☆\n" + 
                                "      /   \\\n" +
                                "     /  o  \\\n" +
                                "     ~~~~~~~\n" +
                                "    /  o    \\\n" +
                                "   /         \\\n" +
                                "   ~~~~~~~~~~~\n" +
                                "  /           \\\n" +
                                " /             \\\n" +
                                " ~~~~~~~~~~~~~~~\n" +
                                "        ||\n",
                                
                                
                                "        ☆\n" + 
                                "      /   \\\n" +
                                "     /  o  \\\n" +
                                "     ~~~~~~~\n" +
                                "    /       \\\n" +
                                "   /         \\\n" +
                                "   ~~~~~~~~~~~\n" +
                                "  /           \\\n" +
                                " /             \\\n" +
                                " ~~~~~~~~~~~~~~~\n" +
                                "        ||\n",
                                
                                
                                "        ☆\n" + 
                                "      /   \\\n" +
                                "     /     \\\n" +
                                "     ~~~~~~~\n" +
                                "    /       \\\n" +
                                "   /         \\\n" +
                                "   ~~~~~~~~~~~\n" +
                                "  /           \\\n" +
                                " /             \\\n" +
                                " ~~~~~~~~~~~~~~~\n" +
                                "        ||\n",
                            };
                            
                            
    public HangingMan () {
        numWrongGuesses = 0;
    }
    
    public boolean isntDead() {
        return numWrongGuesses < HangmanImage.length;
    }
    
    public void show() {
        System.out.println(HangmanImage[numWrongGuesses]);
    }
    
    public void dieSomeMore() {
        numWrongGuesses += 1;
    }
    
}
