import java.util.Scanner;

/*
* Câu 1
Cho chuỗi sau: You Only Live Once. But if You do it right. once is Enough

Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó (VD: You Only Live Once. But If You Do It Right. Once Is Enough)
Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường
* (VD: You only live once. But if you do it right. Once is enough)*/
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi: ");
        String string = scanner.nextLine();

        int count = countUpperCase(string);
        System.out.println("Số từ viết hoa là: " + count);

        String upperCaseWord = toFirstWordUpperCase(string);
        System.out.println("Chuỗi viết hoa ký tự đầu: " + upperCaseWord);

        String upperCase = toFirstUpperCase(string);
        System.out.println("Chuỗi viết hoa ký tự đầu, hoặc viết hoa sau dấu chấm: " + upperCase);
    }
    //Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
    public static int countUpperCase(String s)
    {
        int count = 0;
        for (int i = 0; i<s.length(); i++)
        {

            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            {
                count++;
            }
        }
        return count;
    }

    //Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó (VD: You Only Live Once. But If You Do It Right. Once Is Enough)

    public static String toFirstWordUpperCase(String s)
    {
        char[] arr = s.toCharArray();
        boolean isPreSpace = true;
        for (int i = 0; i < arr.length; i++){
            if(isPreSpace && Character.isLowerCase(arr[i])){
                arr[i] = Character.toUpperCase(arr[i]);
            }
            isPreSpace = (arr[i] == ' ');
        }
        String result = String.valueOf(arr);
        return result;
    }
    //Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường
    //* (VD: You only live once. But if you do it right. Once is enough)
    public static String toFirstUpperCase(String s)
    {
        char[] arr = s.toCharArray();
        boolean isPreDot = true;
        for (int i = 0; i < arr.length; i++){
            if(isPreDot && Character.isLowerCase(arr[i])){
                arr[i] = Character.toUpperCase(arr[i]);
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }
            if(arr[i] != ' ') {
                isPreDot = (arr[i] == '.');
            }
        }
        String result = String.valueOf(arr);
        return result;
    }
}


