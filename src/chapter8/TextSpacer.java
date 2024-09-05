package chapter8;

public class TextSpacer {
    public static void main (String [] args){
        addSpaces("Hey!It'sAlexander");
    }

    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
