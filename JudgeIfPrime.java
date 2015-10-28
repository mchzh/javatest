import java.util.Scanner; 

//prime is a natural number��except 1 and itself��it cannot been divided by other natural numbers   
public class JudgeIfPrime {

  public static void main(String[] args) {  

      Scanner scan = new Scanner(System.in);// scanner��receive the input info of control station  

      System.out.print("Input a int number ��");  

      try {  
          int num = scan.nextInt();// get the imput info  
          if (isPrime(num)) {// call isPrime() method  

              System.out.println(num + " is prime��");// if isPrime() return true,output  

          } else {  

              System.out.println(num + " is not prime��");// if isPrime() return false,output  
          }  
      } catch (Exception e) {  
          System.out.println("please input a int");// catch exception��if input number not int��ouput exception  
      }  
  }  

  /** 
   * <pre> 
   * if the number is prime or not��is��return true,not return false 
   * </pre> 
   *  
   * @param a 
   *            input value 
   * @return true��false 
   */  
  public static boolean isPrime(int a) {  

      boolean flag = true;  

      if (a < 2) {// prime is not < 2  
          return false;  
      } else {  

          for (int i = 2; i <= Math.sqrt(a); i++) {  

              if (a % i == 0) {// if been divided��verify not prime��return false  

                  flag = false;  
                  break;// jump loop  
              }  
          }  
      }  
      return flag;  
  }  
}  

/*������ָֻ��1�ͱ���������������
�ж�һ�����ǲ���������2��ƽ������������������˵���Ǽٶ�nΪ17
ƽ����Ϊ�ĵ㼸��������ǲ����������ض��ܻ�Ϊ�������ĳ˻���1�ͱ����⣩
������Ϊ������������ô�϶�������С��17�������������һ����С��4��ƽ����ȡ������ô��һ���˳�һ������ƽ����ȡ��
ӦΪƽ����*ƽ����=17>ƽ����*С��ƽ����������������һ����һ������ƽ������Ҳ����˵���һ����������������һ�����ҵ����������ɳ˻����������һ������ƽ��������ô�ض����ҵ�һ��С��ƽ�������������ɶԣ����Լ��һ�����ǲ�������ֻҪ�����Ƿ��ܱ�2��n��ƽ����֮���ĳ�������������ˡ�*/