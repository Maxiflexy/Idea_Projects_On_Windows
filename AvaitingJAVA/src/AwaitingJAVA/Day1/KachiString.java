package AwaitingJAVA.Day1;
public class KachiString {

    private String original;

    public KachiString(String original){
        this.original=original;
    }
    public KachiString() {
    }
    @Override
    public String toString() {
        return "KachiString{" +
                "original='" + original + '\'' +
                '}';
    }
    public void callMyName(){
        System.out.println("My name is : "+this.original);
    }
}
