public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3};
        int[] array2 = new int[array1.length];
        String str1 = "B";
        String[] array3 = new String[]{"A","B","C"};

        //数组的复制
        for (int i = 0;i < array1.length;i++){
            array2[i] = array1[i];
            System.out.println(array2[i]);
        }

        //数组的逆序排列
        for (int j = 0;j < array1.length;j++){
            array2[j] = array1[array1.length - j - 1];
            System.out.println(array2[j]);
        }

        //数组的线性查找
        for (int k = 0;k < array3.length;k++){
            if (str1.equals(array3[k])){
                System.out.println(array3[k]);
            }
        }
    }
}
