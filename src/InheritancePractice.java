public class InheritancePractice {

    public static void main(String[] args) {

       var control = new UIControl();
       var textBox = new TextBox();
       var textBox1 = new TextBox();
       show(textBox1);

    }
    public static void show(UIControl control){
        if (control instanceof TextBox) {
            var test = (TextBox) control;
            test.setText("Hello");
        }
        System.out.println(control);
    }
}
