
public class HelloWorld {

    public static void main(String[] args) {
        for (int i = 1;i < 10;i++){
            for (int j = 1;j < 10;j++){
                if (j >= i){
                    System.out.println(i + "*" + j + "=" + i*j);
                }
            }
        }
    }
}
