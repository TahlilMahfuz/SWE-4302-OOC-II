public class ShamelessGreen {
    String S;

    public String verse(int VerseNumber)
    {
        switch(VerseNumber){
            case 0: {
                String str;
                str = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
                return str;
            }
            case 1:{
                String str;
                str = "\n1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.\n";
                return str;
            }
            case 2:{
                String str;
                str = "2"+" bottles of beer on the wall, "+"2"+" bottles of beer.\n" +
                        "Take one down and pass it around, "+"1"+" bottle of beer on the wall.\n";
                return str;
            }
            default:{
                String str;
                str = VerseNumber+" bottles of beer on the wall, "+VerseNumber+" bottles of beer.\n" +
                        "Take one down and pass it around, "+(VerseNumber-1)+" bottles of beer on the wall.\n";
                return str;
            }
        }
    }

    public String verse(int starting,int ending){
        String s="";
        for(int i=starting;i>=ending;i--)
        {
            s=s+verse(i);
        }
        return s;
    }
}
