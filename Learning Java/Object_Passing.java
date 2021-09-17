/*
class Object_Passing {
    public static void main(String args[]){
        paper p = new paper();
        p.setText("Hello Omkar");
        System.out.println(p.getText());

        printer hp = new printer();
        hp.print(p);
        System.out.println(p.getText());
    }    
}

class paper{
    String text;
    public void setText(String t){
        text = t;
    }
    public String getText(){
        return text;
    }
}

class printer{
    public void print(paper p){
        p.setText("Get Lost");
    }
}
*/