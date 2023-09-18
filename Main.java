import java.util.Arrays;
import java.util.Random;
public class Main {

// генерируем рандомные числа от -3.0 до 10.0

public static double generateRandom(){ 
	Random rnd = new Random();
	double a;
      a =rnd.nextDouble(13)-3;
	a*=10;
	a = Math.round(a);
	a/=10;
	return a;
    }
// математическая функция 1
public static double func1(double x){ 
	double osn = (Math.PI /2 )/ (Math.pow(Math.sin(x),2));
	double stepen = Math.tan(Math.asin((x+3.5)/13));
	double a = Math.log(Math.pow(osn,stepen));
	return a;
    }
// математическая функция 2
public static double func2(double x){ 
	double a = Math.atan(Math.sin(x));
	return a;
    }
// математическая функция 3
public static double func3(double x){ 
	double mnozh1= Math.sin(Math.cbrt(Math.cos(x)));
	double mnozh2 =			Math.sin(Math.log(Math.pow(  ((Math.abs(x))/(Math.abs(x)+1)),x  ) ) );
	double a = mnozh1*(mnozh2+1);
	return a;
    }
    public static void main(String[] args) {
// создаём и заполняем первый массив
	short[] c;
	c = new short[21];
        for (short i= 0; i<=20;i++){
		c[i] = (short)(i+3);
	}
// создаём и заполняем второй массив

	double[]  x;
	x = new double[16];
	for (int i=0;i<16;i++){
	x[i] = generateRandom();
	}
// создаём и заполняем третий массив

double[][] arr = new double[21][16];

for( int i=0;i<21;i++){
	int ct =c[i];
if (ct == 23){
for (int j=0; j<16;j++){
	arr[i][j] = func1(x[j]);
}
}
else if(Arrays.asList(3,9,11,17,19).contains(ct)){
for (int j=0; j<16;j++){
	arr[i][j] = func2(x[j]);
}
}
else{
for (int j=0; j<16;j++){

	arr[i][j] = func3(x[j]);
}
}
}
//выводим массивы	
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(x));
	
for(double ci[] : arr){
	for (double el : ci){
	System.out.printf("%8.5f",el);
	System.out.print("   ");
			}
	System.out.println();
		}
    }
}