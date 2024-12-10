class Person
{
	public int myAge;			//年齢	
	private double myWeight;	//体重[kg]	
	private double myHeight;	//身長[cm]	
	private double myBMI;		// BMI ( 体重[kg] / 身長[m]^2 )

	// コンストラクタ クラスメイト同じメソッド名にする
	public Person()
	{
		myAge=51;
		myWeight=123;
		myHeight=321;

		calcBMI();
	}

	// 引数を持つコンストラクタの例
	/*
	public Person(int myAge, double myWeight, double myHeight)
	{
		this.myAge = myAge;
		this.myWeight = myWeight;
		this.myHeight = myHeight;

		calcBMI();
	}
	*/

	private void calcBMI()
	{
		double calc_height = myHeight/100;
		double calc_weight = myWeight;

		myBMI= calc_weight / calc_height / calc_height;

	}

	public double retBMI()
	{
		calcBMI();	
		return myBMI;
	}

	void show()
	{
		System.out.println("年齢は"+myAge+"歳");
		System.out.println("体重は"+myWeight+"[kg]");
		System.out.println("身長は"+myHeight+"[cm]");
	}

	// 年齢設定を行うメソッド
	int setAge(int age)
	{
		if(age <0)
		{
			System.out.println("年齢が負です");
			return -1;								//負値のとき-1
		}

		myAge = age;
		return 0;
	}


	// 体重設定を行うメソッド
	int setWeight(double weight)
	{
		if(weight <=0)
		{
			System.out.println("体重がおかしな値です");
			return -1;								//負値のとき-1
		}

		this.myWeight = weight;

		return 0;
	}


	// 身長設定を行うメソッド
	int setHeight(double myHeight)
	{
		if(myHeight <0)
		{
			System.out.println("身長がおかしな値です");
			return -1;								//負値のとき-1
		}

		this.myHeight = myHeight;

		return 0;
	}


		
}

public class constructor 
{
	public static void main(String[] args)
	{
		Person gachaping;	
		gachaping =new Person();

		// 引数を持つコンストラクタ
//		gachaping =new Person(5, 100.0,200.0);	

		int ret;

		// 初期状態(コンストラクタによる実行結果を見る)
		gachaping.show();

		System.out.print("\n\n");


		gachaping.setAge(5);
		gachaping.setHeight(165.0);
		gachaping.setWeight(80.0);

		gachaping.show();

		System.out.println("BMI計算");
		System.out.println(gachaping.retBMI());



	}
}
